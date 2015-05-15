# File Parse Utility
I built a generic file parsing app using Spring Boot and OpenCSV along with FreeMarker templates to transform the data after it is parsed by the OpenCSV. 

Steps to Run Project.
```sh
$  git clone  git clone https://github.com/cothedeveloper/FileParseUtility FileParseUtil
$  cd FileParseUtil/
$  mvn package
$  java -jar target/file_parse_utility-1.0-SNAPSHOT.jar  (It is important to run this from the project root)
OR
$ mvn spring-boot:run
```
### application.properties Overview

This is the configuration/properties file in order to run this app. In this file we will update where to read in the file and other information related to parsing a delimited file.  See below for details.

`inputFileLocation`- Where is the file being picked up by the application

`templateLoadingDirectory`- This tells the app where to load the FreeMarker templates.  Usually this will not change unless deployed in a distributed environment.

`fileEncoding`- What type of encoding to use with the delimited file

`skipLines`- This is to skip the header line.  Specify 1 to skip just 1 line from the top.

`templateName`- This tells us which FreeMarker template to use with the data being parsed.

`Separator`- if you want to change the delimited value.  It can be done by using , or | or any other delimiter.

`fileparser.position.var` – This defines the position and the name of the variable we plan to use in the FTL templates.  I made avialbe 20 columns.  You will need to add more columns if your file exceeds 20 columns.

 
