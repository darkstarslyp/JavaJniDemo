if [ ! -d "./jni/build" ]; then
   mkdir jni/build
fi   
if [ ! -f "./jni/build/libHelloJNI.so" ];then
   cd jni/build
   cmake ..
   make
   cd ../../java/
else
   cd java
fi
javac com/demon/jni/TestJni.java
java com.demon.jni.TestJni