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
include CMakeFiles/Qu1_pdf2.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/Qu1_pdf2.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Qu1_pdf2.dir/flags.make

CMakeFiles/Qu1_pdf2.dir/Qu1_pdf2.cpp.obj: CMakeFiles/Qu1_pdf2.dir/flags.make
CMakeFiles/Qu1_pdf2.dir/Qu1_pdf2.cpp.obj: ../Qu1_pdf2.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="C:\c progamming\html1\sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Qu1_pdf2.dir/Qu1_pdf2.cpp.obj"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\Qu1_pdf2.dir\Qu1_pdf2.cpp.obj -c "C:\c progamming\html1\sorting\Qu1_pdf2.cpp"

CMakeFiles/Qu1_pdf2.dir/Qu1_pdf2.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Qu1_pdf2.dir/Qu1_pdf2.cpp.i"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "C:\c progamming\html1\sorting\Qu1_pdf2.cpp" > CMakeFiles\Qu1_pdf2.dir\Qu1_pdf2.cpp.i

CMakeFiles/Qu1_pdf2.dir/Qu1_pdf2.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Qu1_pdf2.dir/Qu1_pdf2.cpp.s"
	C:\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "C:\c progamming\html1\sorting\Qu1_pdf2.cpp" -o CMakeFiles\Qu1_pdf2.dir\Qu1_pdf2.cpp.s

# Object files for target Qu1_pdf2
Qu1_pdf2_OBJECTS = \
"CMakeFiles/Qu1_pdf2.dir/Qu1_pdf2.cpp.obj"

# External object files for target Qu1_pdf2
Qu1_pdf2_EXTERNAL_OBJECTS =

Qu1_pdf2.exe: CMakeFiles/Qu1_pdf2.dir/Qu1_pdf2.cpp.obj
Qu1_pdf2.exe: CMakeFiles/Qu1_pdf2.dir/build.make
Qu1_pdf2.exe: CMakeFiles/Qu1_pdf2.dir/linklibs.rsp
Qu1_pdf2.exe: CMakeFiles/Qu1_pdf2.dir/objects1.rsp
Qu1_pdf2.exe: CMakeFiles/Qu1_pdf2.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="C:\c progamming\html1\sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Qu1_pdf2.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Qu1_pdf2.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Qu1_pdf2.dir/build: Qu1_pdf2.exe
.PHONY : CMakeFiles/Qu1_pdf2.dir/build

CMakeFiles/Qu1_pdf2.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Qu1_pdf2.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Qu1_pdf2.dir/clean

CMakeFiles/Qu1_pdf2.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "C:\c progamming\html1\sorting" "C:\c progamming\html1\sorting" "C:\c progamming\html1\sorting\cmake-build-debug" "C:\c progamming\html1\sorting\cmake-build-debug" "C:\c progamming\html1\sorting\cmake-build-debug\CMakeFiles\Qu1_pdf2.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Qu1_pdf2.dir/depend
