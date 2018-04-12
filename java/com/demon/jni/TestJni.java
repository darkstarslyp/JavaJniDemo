package com.demon.jni;

import java.io.File;

public class TestJni {

    static {
        try{
            
            String libraryPath = TestJni.class.getResource("/").getPath();
            libraryPath = new File(libraryPath).getParentFile().getAbsolutePath()+File.separator+"jni/build/libHelloJNI.so";
            System.load(libraryPath);

        }catch (UnsatisfiedLinkError error){
            System.out.println(error.toString());
        }
    }

    public static native void hello();


    public static void main(String []args){
        hello();
    }
}
