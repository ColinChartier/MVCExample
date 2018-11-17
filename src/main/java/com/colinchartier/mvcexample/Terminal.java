package com.colinchartier.mvcexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Terminal {
  public void printLine(String message) {
    System.out.println(message);
  }

  public String promptLine() throws IOException {
    System.out.print("> ");
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    return r.readLine();
  }
}