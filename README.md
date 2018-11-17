# MVC Example project for java

## Description
If you run this project, you get a little terminal prompt:

`> `

In that prompt, you can type "ls (file)" to list the files on your computer at a specific path.

On windows, `ls C:\`, on mac/lunux, `ls /` for examples.

### Code coverage instructions

1. Press "Run" in top bar
2. Press "Edit Configurations"
3. Press "JUnit > All in MVC\_Test"
4. Press "Code Coverage"
5. Add two new packages (lower + button)
  - com.colinchartier.mvcexample.commands.*
  - com.colinchartier.mvcexample.*
6. Let's manually exclude our model, view, and main classes. (Upper + button)
  - Filesystem
  - Terminal
  - Main
  - Uncheck the 'Include/Exclude' checkbox for the three to exclude them
4. Press "Run" in top bar again
5. Press "Run All in MVC_Test with Coverage"


## Iterations

### MVC-less, single app
https://github.com/ColinChartier/MVCExample/commit/a43d966ac7fdbde2f901da60c24edd427249015c
https://github.com/ColinChartier/MVCExample/tree/a43d966ac7fdbde2f901da60c24edd427249015c

### MVC-ed, with a crude test
https://github.com/ColinChartier/MVCExample/commit/c413b80434ca2b5f65743b77caea8afd728e0d06
https://github.com/ColinChartier/MVCExample/tree/c413b80434ca2b5f65743b77caea8afd728e0d06

### MVC, JUnit, gradle
https://github.com/ColinChartier/MVCExample/commit/554c777ff3af27b4cf415d29dfd1e57ca37b2078
https://github.com/ColinChartier/MVCExample/tree/554c777ff3af27b4cf415d29dfd1e57ca37b2078
