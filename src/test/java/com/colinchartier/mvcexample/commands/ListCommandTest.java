package com.colinchartier.mvcexample.commands;

import com.colinchartier.mvcexample.Filesystem;
import com.colinchartier.mvcexample.Terminal;

import org.junit.Test;
import org.mockito.ArgumentMatchers;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ListCommandTest {

  @Test
  public void testPrintsOneFile() throws IOException {
    Terminal terminal = mock(Terminal.class);
    when(terminal.promptLine()).thenReturn("ls /a");

    Filesystem fs = mock(Filesystem.class);
    when(fs.listDirectoryFiles("/a")).thenReturn(new String[]{"hello"});

    ListCommand ls = new ListCommand(terminal, fs);
    assertTrue(ls.exec(new String[]{"/a"}));
    verify(terminal).printLine(ArgumentMatchers.eq("hello"));
  }
}