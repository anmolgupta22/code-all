# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2021.2.1\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2021.2.1\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = C:\c++\Assignment1_ds_sir

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = C:\c++\Assignment1_ds_sir\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/A7.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/A7.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/A7.dir/flags.make

CMakeFiles/A7.dir/A7.cpp.obj: CMakeFiles/A7.dir/flags.make
CMakeFiles/A7.dir/A7.cpp.obj: ../A7.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\c++\Assignment1_ds_sir\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/A7.dir/A7.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\A7.dir\A7.cpp.obj -c C:\c++\Assignment1_ds_sir\A7.cpp

CMakeFiles/A7.dir/A7.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/A7.dir/A7.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\c++\Assignment1_ds_sir\A7.cpp > CMakeFiles\A7.dir\A7.cpp.i

CMakeFiles/A7.dir/A7.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/A7.dir/A7.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\c++\Assignment1_ds_sir\A7.cpp -o CMakeFiles\A7.dir\A7.cpp.s

# Object files for target A7
A7_OBJECTS = \
"CMakeFiles/A7.dir/A7.cpp.obj"

# External object files for target A7
A7_EXTERNAL_OBJECTS =

A7.exe: CMakeFiles/A7.dir/A7.cpp.obj
A7.exe: CMakeFiles/A7.dir/build.make
A7.exe: CMakeFiles/A7.dir/linklibs.rsp
A7.exe: CMakeFiles/A7.dir/objects1.rsp
A7.exe: CMakeFiles/A7.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\c++\Assignment1_ds_sir\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable A7.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\A7.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/A7.dir/build: A7.exe
.PHONY : CMakeFiles/A7.dir/build

CMakeFiles/A7.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\A7.dir\cmake_clean.cmake
.PHONY : CMakeFiles/A7.dir/clean

CMakeFiles/A7.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\c++\Assignment1_ds_sir C:\c++\Assignment1_ds_sir C:\c++\Assignment1_ds_sir\cmake-build-debug C:\c++\Assignment1_ds_sir\cmake-build-debug C:\c++\Assignment1_ds_sir\cmake-build-debug\CMakeFiles\A7.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/A7.dir/depend
