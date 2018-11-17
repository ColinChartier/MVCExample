package com.colinchartier.mvcexample;

import java.nio.file.Path;

/**
 * This class contains information about a single shell instance.
 * It, for example, keeps track of which directory we are in.
 */
public class ShellInstance {
  private Path currPath;

  public void changeCurrPath(Path path) {
    this.currPath = path;
  }

  public Path getCurrPath() {
    return this.currPath;
  }
}
