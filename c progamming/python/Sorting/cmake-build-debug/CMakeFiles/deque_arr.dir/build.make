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
include CMakeFiles/deque_arr.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/deque_arr.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/deque_arr.dir/flags.make

CMakeFiles/deque_arr.dir/deque_arr.cpp.obj: CMakeFiles/deque_arr.dir/flags.make
CMakeFiles/deque_arr.dir/deque_arr.cpp.obj: ../deque_arr.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="C:\c progamming\python\Sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/deque_arr.dir/deque_arr.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\deque_arr.dir\deque_arr.cpp.obj -c "C:\c progamming\python\Sorting\deque_arr.cpp"

CMakeFiles/deque_arr.dir/deque_arr.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/deque_arr.dir/deque_arr.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "C:\c progamming\python\Sorting\deque_arr.cpp" > CMakeFiles\deque_arr.dir\deque_arr.cpp.i

CMakeFiles/deque_arr.dir/deque_arr.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/deque_arr.dir/deque_arr.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "C:\c progamming\python\Sorting\deque_arr.cpp" -o CMakeFiles\deque_arr.dir\deque_arr.cpp.s

# Object files for target deque_arr
deque_arr_OBJECTS = \
"CMakeFiles/deque_arr.dir/deque_arr.cpp.obj"

# External object files for target deque_arr
deque_arr_EXTERNAL_OBJECTS =

deque_arr.exe: CMakeFiles/deque_arr.dir/deque_arr.cpp.obj
deque_arr.exe: CMakeFiles/deque_arr.dir/build.make
deque_arr.exe: CMakeFiles/deque_arr.dir/linklibs.rsp
deque_arr.exe: CMakeFiles/deque_arr.dir/objects1.rsp
deque_arr.exe: CMakeFiles/deque_arr.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="C:\c progamming\python\Sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable deque_arr.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\deque_arr.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/deque_arr.dir/build: deque_arr.exe
.PHONY : CMakeFiles/deque_arr.dir/build

CMakeFiles/deque_arr.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\deque_arr.dir\cmake_clean.cmake
.PHONY : CMakeFiles/deque_arr.dir/clean

CMakeFiles/deque_arr.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "C:\c progamming\python\Sorting" "C:\c progamming\python\Sorting" "C:\c progamming\python\Sorting\cmake-build-debug" "C:\c progamming\python\Sorting\cmake-build-debug" "C:\c progamming\python\Sorting\cmake-build-debug\CMakeFiles\deque_arr.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/deque_arr.dir/depend

