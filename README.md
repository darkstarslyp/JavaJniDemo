# JavaJniDemo
The sample for java jni develop



How to load library ?

### System.load();
You must specify the absolute path of shared library. 
```
System.load("/Users/demon.li/JavaJniDemo/jni/build/libHelloJNI.so");
```
### Systeme.loadLibrary();
You only specify the  shared library simple name . 
If your shared library file name is `libHelloJni.so`,you can call `Systeme.loadLibrary("HelloJNI");`,but
you must add the path to  `java.library.path` where the shared library is.
      
```
      System.setProperty("java.library.path", TestJni.class.getResource("/").getPath()+":"+System.getProperty("java.library.path")+":"+
                    ":"+System.getenv("LD_LIBRARY_PATH")
            );

            try {

                Field fieldSysPath = null;
                fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
                fieldSysPath.setAccessible(true);
                fieldSysPath.set(null, null);

            } catch (Exception e) {
                e.printStackTrace();
            }
      System.loadLibrary("HelloJNI");
```
If TestJni.java locate at `/Users/demon.li/JavaJniDemo/java/com/demon/jni/TestJni.java`
The shared library must  locate at `/Users/demon.li/JavaJniDemo/java/libHelloJNI.so`.

      
      
      
      
      
   
  
