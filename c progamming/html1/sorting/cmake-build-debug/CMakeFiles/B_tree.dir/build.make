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
CMAKE_SOURCE_DIR = "C:\c progamming\html1\sorting"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "C:\c progamming\html1\sorting\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/B_tree.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/B_tree.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/B_tree.dir/flags.make

CMakeFiles/B_tree.dir/B_tree.cpp.obj: CMakeFiles/B_tree.dir/flags.make
CMakeFiles/B_tree.dir/B_tree.cpp.obj: ../B_tree.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="C:\c progamming\html1\sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/B_tree.dir/B_tree.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\B_tree.dir\B_tree.cpp.obj -c "C:\c progamming\html1\sorting\B_tree.cpp"

CMakeFiles/B_tree.dir/B_tree.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/B_tree.dir/B_tree.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "C:\c progamming\html1\sorting\B_tree.cpp" > CMakeFiles\B_tree.dir\B_tree.cpp.i

CMakeFiles/B_tree.dir/B_tree.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/B_tree.dir/B_tree.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "C:\c progamming\html1\sorting\B_tree.cpp" -o CMakeFiles\B_tree.dir\B_tree.cpp.s

# Object files for target B_tree
B_tree_OBJECTS = \
"CMakeFiles/B_tree.dir/B_tree.cpp.obj"

# External object files for target B_tree
B_tree_EXTERNAL_OBJECTS =

B_tree.exe: CMakeFiles/B_tree.dir/B_tree.cpp.obj
B_tree.exe: CMakeFiles/B_tree.dir/build.make
B_tree.exe: CMakeFiles/B_tree.dir/linklibs.rsp
B_tree.exe: CMakeFiles/B_tree.dir/objects1.rsp
B_tree.exe: CMakeFiles/B_tree.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="C:\c progamming\html1\sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable B_tree.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\B_tree.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/B_tree.dir/build: B_tree.exe
.PHONY : CMakeFiles/B_tree.dir/build

CMakeFiles/B_tree.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\B_tree.dir\cmake_clean.cmake
.PHONY : CMakeFiles/B_tree.dir/clean

CMakeFiles/B_tree.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "C:\c progamming\html1\sorting" "C:\c progamming\html1\sorting" "C:\c progamming\html1\sorting\cmake-build-debug" "C:\c progamming\html1\sorting\cmake-build-debug" "C:\c progamming\html1\sorting\cmake-build-debug\CMakeFiles\B_tree.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/B_tree.dir/depend

