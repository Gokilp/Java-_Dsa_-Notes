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
pwd  //print working directory

ls - // list of directory

ls -a  // list of hidden files

ls -l  //show the property of files 

ls -al // show the hidden files and hidden files properties

ls -R  // Show the sub directories of the files 

cd    // change directory

cd . // back previous directory 

cd .. // back previous and previous floder

cd ../folder name    // changing the folder to another folder to specific path of folder 

cd ~/  // changing to the home directories or changing to the any folder (Give folder name)


cat  // show the files 

cat > create  a new file    // create a new file and easy to access edit file in same place and handling Easy
// Exit ctrl + c 

cat file1 file2  // show the multiple file in same cat command

echo // print the any statement 

man  // helping command manual of all commands Quit press q

tr - Translate the character // changing upper case to lower case   
// eg cat filename | tr a-z A-Z

cat filename \  // add a new line add file here the command

mkdir   // make a new floder 

mkdir folder/floder   // create a folder inside a folde of commands

mkdir -p  folder/new folder / floder // create a middle of  folder of file path 

touch // create a new File

cp copying file new file // copy file to another file 

cp -R  copying file new file  // -r used copy all the sub directories of folder 

mv target source file  // move  select current file select to moved location 

mv oldnamefile1 newnamefile1  //renaming a files 

rm -f //remove the files 

rm -r  //remove the folders 

sudo  // super user do Acces the adminstartive work 

df -m //free disk space 

du -h // properties of files 

head filename  // display frist 10 lines 

head -n4 filename   //display frist 4 lines 

tail filename  // display last 10 lines 

tail  -n4 filename   //display last  4 lines 

diff file1 file2   // comparsion of the files 

find . //display all the files

find . -type  d // display all the folder

find . -type f // display all the inside the folder

locate "*.filename" 

find  -type d -name "folder name" // find the folder

find  -type f -name "file name"  // finding the file name 

find  -type d -name "*.txt"  //specific search  collection of files

find  -type f -iname "file name"  //i used not a case sensitive 

find . -type f -mmin +2  //find the mintues of file 

find . -type f -mmin +2 -mmin -10 //find the minutes of file  

find .-size +(sizeoffile)  // searching on file size

find  . -type f -maxdepth 1  // specified directory and its subdirectories.

find. -empty // show the empty folder


```
