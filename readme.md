
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
 

