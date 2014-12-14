![TOMRA logo](https://github.com/Engineer2B/TOMRA/blob/master/logo-tomra.png "TOMRA")
=====
## Requirements
To be able to execute the jar file "calculateStatistics.jar":
  *. The input must be located in the input directory (see **Location** for details)
  *. Java SE Runtime Environment 8 must be installed.

## Usage instructions
Follow the following steps to run the code:
1. Shift+right-click somewhere in the directory named TOMRA, i.e. the top-level directory.  
2. Select "Open command window here" to open a console window in this directory.  
3. Type `java -jar calculateStatistics.jar "$NameFile.txt"` where
$NameFile is the name of the file located in the input directory
(see **[Location](#location)** for details).  
4. Provided all the steps were followed and the requirements are met, the output will be printed to the console window.


## Input folder
The input must be stored on a single line in a .txt file in the folder `./input`.

## Input format
The input file will have the following format `[$,$,$]` or `$,$,$` where `$` are numbers.