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
include CMakeFiles/Qu5_pdf.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/Qu5_pdf.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Qu5_pdf.dir/flags.make

CMakeFiles/Qu5_pdf.dir/Qu5_pdf.c.obj: CMakeFiles/Qu5_pdf.dir/flags.make
CMakeFiles/Qu5_pdf.dir/Qu5_pdf.c.obj: ../Qu5_pdf.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="C:\c progamming\html1\sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/Qu5_pdf.dir/Qu5_pdf.c.obj"
	C:\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\Qu5_pdf.dir\Qu5_pdf.c.obj -c "C:\c progamming\html1\sorting\Qu5_pdf.c"

CMakeFiles/Qu5_pdf.dir/Qu5_pdf.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Qu5_pdf.dir/Qu5_pdf.c.i"
	C:\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "C:\c progamming\html1\sorting\Qu5_pdf.c" > CMakeFiles\Qu5_pdf.dir\Qu5_pdf.c.i

CMakeFiles/Qu5_pdf.dir/Qu5_pdf.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Qu5_pdf.dir/Qu5_pdf.c.s"
	C:\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "C:\c progamming\html1\sorting\Qu5_pdf.c" -o CMakeFiles\Qu5_pdf.dir\Qu5_pdf.c.s

# Object files for target Qu5_pdf
Qu5_pdf_OBJECTS = \
"CMakeFiles/Qu5_pdf.dir/Qu5_pdf.c.obj"

# External object files for target Qu5_pdf
Qu5_pdf_EXTERNAL_OBJECTS =

Qu5_pdf.exe: CMakeFiles/Qu5_pdf.dir/Qu5_pdf.c.obj
Qu5_pdf.exe: CMakeFiles/Qu5_pdf.dir/build.make
Qu5_pdf.exe: CMakeFiles/Qu5_pdf.dir/linklibs.rsp
Qu5_pdf.exe: CMakeFiles/Qu5_pdf.dir/objects1.rsp
Qu5_pdf.exe: CMakeFiles/Qu5_pdf.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="C:\c progamming\html1\sorting\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable Qu5_pdf.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Qu5_pdf.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Qu5_pdf.dir/build: Qu5_pdf.exe
.PHONY : CMakeFiles/Qu5_pdf.dir/build

CMakeFiles/Qu5_pdf.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Qu5_pdf.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Qu5_pdf.dir/clean

CMakeFiles/Qu5_pdf.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "C:\c progamming\html1\sorting" "C:\c progamming\html1\sorting" "C:\c progamming\html1\sorting\cmake-build-debug" "C:\c progamming\html1\sorting\cmake-build-debug" "C:\c progamming\html1\sorting\cmake-build-debug\CMakeFiles\Qu5_pdf.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Qu5_pdf.dir/depend

