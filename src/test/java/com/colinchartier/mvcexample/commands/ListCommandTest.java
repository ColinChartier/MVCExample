package com.colinchartier.mvcexample.commands;

import org.junit.Test;

import com.colinchartier.mvcexample.Filesystem;
import com.colinchartier.mvcexample.Terminal;

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
    });

    assert ls.exec(new String[] {"/a"}); //runs it, asserts it is true
    //if this is not hello, we are not helloing today.
    assert whatWasPrinted.equals("hello");
  }
}