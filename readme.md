## EDIT

This fork demonstrates that Gradle "implementat/api" feature is properly supported with Gradle version >= 5.0.

See Main class in subproject  "consumer".


## EDIT 2 : 

see branche /gradle-4x  using Gradle v4.8 : the "Api and Implementation separation" is not enabled by default

(see more information https://docs.gradle.org/current/userguide/java_library_plugin.html#sec:java_library_separation )

## gradle "implementation" doesn't work

demonstration :

run 
`gradle  clean build  publishToMavenLocal`

then on another empty project add to gradle :
```
implementation "net.me:library-sample:1.0-SNAPSHOT"
```

now on that empty project you can import and use the codec library
ie :  
```
import org.apache.commons.codec.Decoder
```

but why if it's an implementation ? 
 

someone suggest using shadowJar or fatJar to hide implementations but using those everything is hidden ( also api libraries )  

and using : `from components.java` everything is leaked ..



