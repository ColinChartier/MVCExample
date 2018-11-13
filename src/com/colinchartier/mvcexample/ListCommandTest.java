package com.colinchartier.mvcexample;

import com.colinchartier.mvcexample.commands.ListCommand;

import java.io.IOException;

public class ListCommandTest {

  //test the ListCommand class
  String whatWasPrinted = null;

  //@Test please
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