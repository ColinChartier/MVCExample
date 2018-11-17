package com.colinchartier.mvcexample;

import com.colinchartier.mvcexample.commands.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) throws IOException {
    String path = "/";

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    Filesystem fs = new Filesystem(); //model
    Terminal t = new Terminal(); // view
    HashMap<String, Command> commands = new HashMap<>();
    commands.put("ls", new ListCommand(t, fs)); //gluing the model to the view with logic!
    while(true) {
      //interact with view, e.g., if button is clicked or something
      String command = t.promptLine();
      String commandArgs = command.split(" ", 2)[1];
      commands.get(command.split(" ", 2)[0]).exec(commandArgs.split(" "));
    }
  }
}