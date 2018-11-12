package com.colinchartier.mvcexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    String path = "/";

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
      System.out.print("> ");
      String line = r.readLine();
      if("ls".equals(line)) {
        for(File f : new File(path).listFiles()) {
          System.out.println("File: " + f);
        }
      } else if(line.startsWith("cd")) {
        path = line.split(" ", 2)[1];
        System.out.println("Path is now " + path);
      } else if("pwd".equals(line)) {
        System.out.println("Current path: " + path);
      } else if("exit".equals(line)) {
        System.exit(0);
      }
    }
  }
}