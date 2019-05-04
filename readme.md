### different and problematic behaviour between intellij and gradle 
this project doesn't compile in gradle but works fine in intellij, 
transtitive dependencies should be out of classpath 
instead is present and usable in test

- src/test/java/net/me/consumer/Main.java

and is present but not usable in main 
- src/main/java/net/me/consumer/Main.java

execute the class with intellij to spot the issue..   

this could create problems of conflicting dependencies while working, 
for "a should not be a problem because hidden transitive in upstream implementations" dependencies  
 



to build the base library run :
```
gradle :clean :build  publishToMavenLocal

# then run
gradle build 
# to build everything but this will fail.. while intellij see no problems , will compile and run everything    
```

then open the project in intellij ( tested both using wrapper and local gradle, which is 5.4.1 )  
