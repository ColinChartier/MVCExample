package com.colinchartier.mvcexample.commands;

import com.colinchartier.mvcexample.Filesystem;
import com.colinchartier.mvcexample.Terminal;

import org.junit.Test;

import java.io.IOException;

public class ListCommandTest {

  //test the ListCommand class
  private String whatWasPrinted = null;

  @Test
  public void testPrintsOneFile() {
    ListCommand ls = new ListCommand(
        new Terminal() {
          public void printLine(String message) {
            whatWasPrinted = message;
          }

          public String promptLine() throws IOException {
            return "ls /a";
          }
        }, new Filesystem() {
          public String[] listDirectoryFiles(String file) {
            if("/a".equals(file)) {
              return new String[] {"hello"};
            }
            return new String[] {"sad"};
          }
        }
    );

    assert ls.exec(new String[]{"/a"}); //runs it, asserts it is true
    //if this is not hello, we are not helloing today.
    assert whatWasPrinted.equals("hello");
  }
}