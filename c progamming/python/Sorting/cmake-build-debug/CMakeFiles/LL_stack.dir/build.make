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
CMAKE_SOURCE_DIR = "C:\c progamming\python\Sorting"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "C:\c progamming\python\Sorting\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/LL_stack.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/LL_stack.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/LL_stack.dir/flags.make

CMakeFiles/LL_stack.dir/LL_stack.cpp.obj: CMakeFiles/LL_stack.dir/flags.make
CMakeFiles/LL_stack.dir/LL_stack.cpp.obj: ../LL_stack.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="C:\c progamming\python\Sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/LL_stack.dir/LL_stack.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\LL_stack.dir\LL_stack.cpp.obj -c "C:\c progamming\python\Sorting\LL_stack.cpp"

CMakeFiles/LL_stack.dir/LL_stack.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/LL_stack.dir/LL_stack.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "C:\c progamming\python\Sorting\LL_stack.cpp" > CMakeFiles\LL_stack.dir\LL_stack.cpp.i

CMakeFiles/LL_stack.dir/LL_stack.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/LL_stack.dir/LL_stack.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "C:\c progamming\python\Sorting\LL_stack.cpp" -o CMakeFiles\LL_stack.dir\LL_stack.cpp.s

# Object files for target LL_stack
LL_stack_OBJECTS = \
"CMakeFiles/LL_stack.dir/LL_stack.cpp.obj"

# External object files for target LL_stack
LL_stack_EXTERNAL_OBJECTS =

LL_stack.exe: CMakeFiles/LL_stack.dir/LL_stack.cpp.obj
LL_stack.exe: CMakeFiles/LL_stack.dir/build.make
LL_stack.exe: CMakeFiles/LL_stack.dir/linklibs.rsp
LL_stack.exe: CMakeFiles/LL_stack.dir/objects1.rsp
LL_stack.exe: CMakeFiles/LL_stack.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="C:\c progamming\python\Sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable LL_stack.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\LL_stack.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/LL_stack.dir/build: LL_stack.exe
.PHONY : CMakeFiles/LL_stack.dir/build

CMakeFiles/LL_stack.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\LL_stack.dir\cmake_clean.cmake
.PHONY : CMakeFiles/LL_stack.dir/clean

CMakeFiles/LL_stack.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "C:\c progamming\python\Sorting" "C:\c progamming\python\Sorting" "C:\c progamming\python\Sorting\cmake-build-debug" "C:\c progamming\python\Sorting\cmake-build-debug" "C:\c progamming\python\Sorting\cmake-build-debug\CMakeFiles\LL_stack.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/LL_stack.dir/depend

