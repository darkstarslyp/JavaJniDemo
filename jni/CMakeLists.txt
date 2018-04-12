cmake_minimum_required(VERSION 3.9)
project(HelloJNI )

set(CMAKE_CXX_STANDARD 11)

if(NOT DEFINED ENV{JAVA_HOME})
    message(FATAL_ERROR "not defined environment variable:JAVA_HOME")
else()
    set(JNI_INCLUDE "$ENV{JAVA_HOME}/include")
    include_directories(${JNI_INCLUDE})
    if(APPLE)
        include_directories(${JNI_INCLUDE}/darwin)
    elseif(UNIX)
        include_directories(${JNI_INCLUDE}/linux)
    else()
        message(FATAL_ERROR "Not support  platform: ${CMAKE_SYSTEM_NAME}")
    endif()
endif()



add_library(HelloJNI SHARED TestJni.cpp)
set_target_properties(HelloJNI PROPERTIES LINKER_LANGUAGE CXX )
set_target_properties(HelloJNI PROPERTIES SUFFIX ".so")


