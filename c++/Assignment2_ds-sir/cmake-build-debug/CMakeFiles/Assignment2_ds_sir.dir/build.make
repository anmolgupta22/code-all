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
CMAKE_SOURCE_DIR = C:\c++\Assignment2_ds-sir

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = C:\c++\Assignment2_ds-sir\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/Assignment2_ds_sir.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/Assignment2_ds_sir.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Assignment2_ds_sir.dir/flags.make

CMakeFiles/Assignment2_ds_sir.dir/A1.cpp.obj: CMakeFiles/Assignment2_ds_sir.dir/flags.make
CMakeFiles/Assignment2_ds_sir.dir/A1.cpp.obj: ../A1.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\c++\Assignment2_ds-sir\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Assignment2_ds_sir.dir/A1.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\Assignment2_ds_sir.dir\A1.cpp.obj -c C:\c++\Assignment2_ds-sir\A1.cpp

CMakeFiles/Assignment2_ds_sir.dir/A1.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Assignment2_ds_sir.dir/A1.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\c++\Assignment2_ds-sir\A1.cpp > CMakeFiles\Assignment2_ds_sir.dir\A1.cpp.i

CMakeFiles/Assignment2_ds_sir.dir/A1.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Assignment2_ds_sir.dir/A1.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\c++\Assignment2_ds-sir\A1.cpp -o CMakeFiles\Assignment2_ds_sir.dir\A1.cpp.s

# Object files for target Assignment2_ds_sir
Assignment2_ds_sir_OBJECTS = \
"CMakeFiles/Assignment2_ds_sir.dir/A1.cpp.obj"

# External object files for target Assignment2_ds_sir
Assignment2_ds_sir_EXTERNAL_OBJECTS =

Assignment2_ds_sir.exe: CMakeFiles/Assignment2_ds_sir.dir/A1.cpp.obj
Assignment2_ds_sir.exe: CMakeFiles/Assignment2_ds_sir.dir/build.make
Assignment2_ds_sir.exe: CMakeFiles/Assignment2_ds_sir.dir/linklibs.rsp
Assignment2_ds_sir.exe: CMakeFiles/Assignment2_ds_sir.dir/objects1.rsp
Assignment2_ds_sir.exe: CMakeFiles/Assignment2_ds_sir.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\c++\Assignment2_ds-sir\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Assignment2_ds_sir.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Assignment2_ds_sir.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Assignment2_ds_sir.dir/build: Assignment2_ds_sir.exe
.PHONY : CMakeFiles/Assignment2_ds_sir.dir/build

CMakeFiles/Assignment2_ds_sir.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Assignment2_ds_sir.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Assignment2_ds_sir.dir/clean

CMakeFiles/Assignment2_ds_sir.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\c++\Assignment2_ds-sir C:\c++\Assignment2_ds-sir C:\c++\Assignment2_ds-sir\cmake-build-debug C:\c++\Assignment2_ds-sir\cmake-build-debug C:\c++\Assignment2_ds-sir\cmake-build-debug\CMakeFiles\Assignment2_ds_sir.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/Assignment2_ds_sir.dir/depend
