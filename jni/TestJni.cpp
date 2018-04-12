#include "TestJni.h"

JNIEXPORT void JNICALL Java_com_demon_jni_TestJni_hello
(JNIEnv *, jclass){
    std::cout<<"hello jni"<<std::endl;
}
