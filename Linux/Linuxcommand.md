# Terminal

A terminal is a text-based interface for interacting with a computer system, typically through a command-line interface (CLI). It allows users to input commands and receive textual output, enabling tasks like file manipulation, process management, and system configuration. Terminal emulators replicate this functionality on modern graphical user interfaces (GUI).

# shell

A shell is a command-line interface program that interprets user commands to interact with an operating system. It acts as an intermediary, executing commands and managing system resources. Shells offer features like scripting, input/output redirection, and piping, making them powerful tools for system administration and development.

 Common Unix/Linux shells include Bash, Zsh, Fish, Ksh, and Csh, each with its own syntax and capabilities. Users can customize their shell environments for improved productivity and workflow efficiency.

# Enviornment Variables

Environment variables are dynamic values stored within a system, used by applications in shells or sub-shells. They customize system performance and application behavior. The environment serves as the interface for a computer application to interact with the system. Environment variables contain information such as default applications, system locally, executable file paths, keyboard layout settings, etc., making applications available according to the system's configuration.

# PATH

In Linux, the "PATH" is an environment variable that lists directories containing executable files. When you type a command, the system searches these directories to find the corresponding executable. Customizing the PATH allows users to run programs from any location in the terminal.

# Commands Linux

- **`pwd`**: Prints the current working directory.
- **`ls -`**: Lists the contents of the current directory (the hyphen **``** here doesn't do anything special; it's likely a typo).
- **`ls -a`**: Lists all files including hidden files (those starting with a dot **`.`**).
- **`ls -l`**: Lists files in long format, displaying additional information such as permissions, ownership, size, and modification time.
- **`ls -al`**: Combines options **`a`** and **`l`** to list all files in long format including hidden files.
- **`ls -R`**: Lists files recursively, showing contents of subdirectories as well.
- **`cd`**: Changes the current directory to the user's home directory.
- **`cd .`**: Stays in the current directory (**`.`** refers to the current directory).
- **`cd ..`**: Moves up one directory (the parent directory).
- **`cd ../folder_name`**: Changes to a specific directory within the parent directory.
- **`cd ~/`**: Changes to the user's home directory.
- **`cat`**: Concatenates and displays the content of files.
- **`cat > filename`**: Creates a new file and allows input to be written into it, terminated by Ctrl + C.
- **`cat file1 file2`**: Displays the contents of multiple files.
- **`echo`**: Prints text or variables to the terminal.
- **`man`**: Displays the manual pages for commands. Press **`q`** to quit.
- **`tr`**: Translates characters. Commonly used for converting text from lowercase to uppercase or vice versa.
- **`mkdir`**: Creates a new directory.
- **`mkdir folder/subfolder`**: Creates a directory within another directory.
- **`mkdir -p folder/new_folder/subfolder`**: Creates nested directories, creating parent directories if they don't exist.
- **`touch`**: Creates a new file.
- **`cp`**: Copies files or directories.
- **`mv`**: Moves or renames files or directories.



















```
pwd: Print working directory.
ls: List directory contents.
ls -a: List all files including hidden ones.
ls -l: List files with details such as permissions and ownership.
ls -al: List all files with detailed information, including hidden ones.
ls -R: List subdirectories recursively.
cd: Change directory.
cd .: Go to the current directory.
cd ..: Go to the parent directory.
cd ../folder_name: Go to a specific folder in the parent directory.
cd ~/: Go to the home directory.
File Handling
cat: Display file content.
cat > filename: Create a new file or overwrite an existing file. Press Ctrl + C to exit file creation mode.
cat file1 file2: Display content of multiple files in sequence.
System Output
echo: Print a statement or variable.
Additional Help
man: Access the manual pages for commands. Use 'q' to quit the manual.
```
