package com.colinchartier.mvcexample;

import java.io.File;
import java.util.ArrayList;

public class Filesystem {
  public String[] getFileContents() {
    return null; //TODO
  }

  public String[] listDirectoryFiles(String file) {
    ArrayList<String> ret = new ArrayList<>();
    for(File f : (new File(file).listFiles())) {
      ret.add("" + f);
    }
    return (String[])ret.toArray(new String[0]);
  }
}