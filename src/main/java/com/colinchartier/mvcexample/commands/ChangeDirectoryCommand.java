package com.colinchartier.mvcexample.commands;

import com.colinchartier.mvcexample.ShellInstance;

import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ChangeDirectoryCommand implements Command {

  private final ShellInstance shell;

  public ChangeDirectoryCommand(ShellInstance shellInstance) {
    this.shell = shellInstance;
  }

  //cd [path]
  public boolean exec(String[] args) {
    if (args.length != 1) {
      //TODO how to test?
      System.err.println("Usage: cd [path]");
      return false;
    }

    try {
      Path path = FileSystems.getDefault().getPath(args[0]);
      if (!path.toFile().exists()) {
        System.err.println("File \"" + args[0] + "\" does not exist!");
        return false;
      }
      this.shell.changeCurrPath(path);
    } catch (InvalidPathException e) {
      System.err
          .println("Invalid path: " + args[0] + " (" + e.getMessage() + ")");
      return false;
    }
    return true;
  }
}