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
include CMakeFiles/duplicate_array_remove.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/duplicate_array_remove.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/duplicate_array_remove.dir/flags.make

CMakeFiles/duplicate_array_remove.dir/duplicate_array_remove.cpp.obj: CMakeFiles/duplicate_array_remove.dir/flags.make
CMakeFiles/duplicate_array_remove.dir/duplicate_array_remove.cpp.obj: ../duplicate_array_remove.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="C:\c progamming\python\Sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/duplicate_array_remove.dir/duplicate_array_remove.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\duplicate_array_remove.dir\duplicate_array_remove.cpp.obj -c "C:\c progamming\python\Sorting\duplicate_array_remove.cpp"

CMakeFiles/duplicate_array_remove.dir/duplicate_array_remove.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/duplicate_array_remove.dir/duplicate_array_remove.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "C:\c progamming\python\Sorting\duplicate_array_remove.cpp" > CMakeFiles\duplicate_array_remove.dir\duplicate_array_remove.cpp.i

CMakeFiles/duplicate_array_remove.dir/duplicate_array_remove.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/duplicate_array_remove.dir/duplicate_array_remove.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "C:\c progamming\python\Sorting\duplicate_array_remove.cpp" -o CMakeFiles\duplicate_array_remove.dir\duplicate_array_remove.cpp.s

# Object files for target duplicate_array_remove
duplicate_array_remove_OBJECTS = \
"CMakeFiles/duplicate_array_remove.dir/duplicate_array_remove.cpp.obj"

# External object files for target duplicate_array_remove
duplicate_array_remove_EXTERNAL_OBJECTS =

duplicate_array_remove.exe: CMakeFiles/duplicate_array_remove.dir/duplicate_array_remove.cpp.obj
duplicate_array_remove.exe: CMakeFiles/duplicate_array_remove.dir/build.make
duplicate_array_remove.exe: CMakeFiles/duplicate_array_remove.dir/linklibs.rsp
duplicate_array_remove.exe: CMakeFiles/duplicate_array_remove.dir/objects1.rsp
duplicate_array_remove.exe: CMakeFiles/duplicate_array_remove.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="C:\c progamming\python\Sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable duplicate_array_remove.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\duplicate_array_remove.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/duplicate_array_remove.dir/build: duplicate_array_remove.exe
.PHONY : CMakeFiles/duplicate_array_remove.dir/build

CMakeFiles/duplicate_array_remove.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\duplicate_array_remove.dir\cmake_clean.cmake
.PHONY : CMakeFiles/duplicate_array_remove.dir/clean

CMakeFiles/duplicate_array_remove.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "C:\c progamming\python\Sorting" "C:\c progamming\python\Sorting" "C:\c progamming\python\Sorting\cmake-build-debug" "C:\c progamming\python\Sorting\cmake-build-debug" "C:\c progamming\python\Sorting\cmake-build-debug\CMakeFiles\duplicate_array_remove.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/duplicate_array_remove.dir/depend

