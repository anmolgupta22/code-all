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
include CMakeFiles/a4.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/a4.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/a4.dir/flags.make

CMakeFiles/a4.dir/A4.cpp.obj: CMakeFiles/a4.dir/flags.make
CMakeFiles/a4.dir/A4.cpp.obj: ../A4.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\c++\Assignment1_ds_sir\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/a4.dir/A4.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\a4.dir\A4.cpp.obj -c C:\c++\Assignment1_ds_sir\A4.cpp

CMakeFiles/a4.dir/A4.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/a4.dir/A4.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\c++\Assignment1_ds_sir\A4.cpp > CMakeFiles\a4.dir\A4.cpp.i

CMakeFiles/a4.dir/A4.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/a4.dir/A4.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\c++\Assignment1_ds_sir\A4.cpp -o CMakeFiles\a4.dir\A4.cpp.s

# Object files for target a4
a4_OBJECTS = \
"CMakeFiles/a4.dir/A4.cpp.obj"

# External object files for target a4
a4_EXTERNAL_OBJECTS =

a4.exe: CMakeFiles/a4.dir/A4.cpp.obj
a4.exe: CMakeFiles/a4.dir/build.make
a4.exe: CMakeFiles/a4.dir/linklibs.rsp
a4.exe: CMakeFiles/a4.dir/objects1.rsp
a4.exe: CMakeFiles/a4.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\c++\Assignment1_ds_sir\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable a4.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\a4.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/a4.dir/build: a4.exe
.PHONY : CMakeFiles/a4.dir/build

CMakeFiles/a4.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\a4.dir\cmake_clean.cmake
.PHONY : CMakeFiles/a4.dir/clean

CMakeFiles/a4.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\c++\Assignment1_ds_sir C:\c++\Assignment1_ds_sir C:\c++\Assignment1_ds_sir\cmake-build-debug C:\c++\Assignment1_ds_sir\cmake-build-debug C:\c++\Assignment1_ds_sir\cmake-build-debug\CMakeFiles\a4.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/a4.dir/depend

