package com.colinchartier.mvcexample.commands;

public interface Command {
  boolean exec(String[] args);
}