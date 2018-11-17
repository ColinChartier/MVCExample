package com.colinchartier.mvcexample.commands;

import com.colinchartier.mvcexample.Filesystem;
import com.colinchartier.mvcexample.Terminal;

import java.io.File;

public class ListCommand implements Command {
  private final Terminal term;
  private final Filesystem fs;

  public ListCommand(Terminal term, Filesystem fs) {
    this.term = term;
    this.fs = fs;
  }

  //E.G., if i type
  //ls filename, args = {filename}
  public boolean exec(String[] args) {
    for(String f : fs.listDirectoryFiles(args[0])) {
      this.term.printLine("" + f);
    }
    return true;
    //read from file
    //print to terminal
  }
}