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
CMAKE_SOURCE_DIR = "C:\c progamming\python\Sorting\Assignment_ds"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "C:\c progamming\python\Sorting\Assignment_ds\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Qu2.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/Qu2.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Qu2.dir/flags.make

CMakeFiles/Qu2.dir/Qu2.c.obj: CMakeFiles/Qu2.dir/flags.make
CMakeFiles/Qu2.dir/Qu2.c.obj: ../Qu2.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="C:\c progamming\python\Sorting\Assignment_ds\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/Qu2.dir/Qu2.c.obj"
	C:\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\Qu2.dir\Qu2.c.obj -c "C:\c progamming\python\Sorting\Assignment_ds\Qu2.c"

CMakeFiles/Qu2.dir/Qu2.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Qu2.dir/Qu2.c.i"
	C:\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "C:\c progamming\python\Sorting\Assignment_ds\Qu2.c" > CMakeFiles\Qu2.dir\Qu2.c.i

CMakeFiles/Qu2.dir/Qu2.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Qu2.dir/Qu2.c.s"
	C:\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "C:\c progamming\python\Sorting\Assignment_ds\Qu2.c" -o CMakeFiles\Qu2.dir\Qu2.c.s

# Object files for target Qu2
Qu2_OBJECTS = \
"CMakeFiles/Qu2.dir/Qu2.c.obj"

# External object files for target Qu2
Qu2_EXTERNAL_OBJECTS =

Qu2.exe: CMakeFiles/Qu2.dir/Qu2.c.obj
Qu2.exe: CMakeFiles/Qu2.dir/build.make
Qu2.exe: CMakeFiles/Qu2.dir/linklibs.rsp
Qu2.exe: CMakeFiles/Qu2.dir/objects1.rsp
Qu2.exe: CMakeFiles/Qu2.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="C:\c progamming\python\Sorting\Assignment_ds\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable Qu2.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Qu2.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Qu2.dir/build: Qu2.exe
.PHONY : CMakeFiles/Qu2.dir/build

CMakeFiles/Qu2.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Qu2.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Qu2.dir/clean

CMakeFiles/Qu2.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "C:\c progamming\python\Sorting\Assignment_ds" "C:\c progamming\python\Sorting\Assignment_ds" "C:\c progamming\python\Sorting\Assignment_ds\cmake-build-debug" "C:\c progamming\python\Sorting\Assignment_ds\cmake-build-debug" "C:\c progamming\python\Sorting\Assignment_ds\cmake-build-debug\CMakeFiles\Qu2.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Qu2.dir/depend

