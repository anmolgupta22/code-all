cmake_minimum_required(VERSION 3.20)
project(DSA C)

set(CMAKE_C_STANDARD 11)

add_executable(DSA
        linklist.c
        linklist_atin.c
        linklist_insertion.c
        linklist_sir.c)
add_executable(chell chell.cpp)

