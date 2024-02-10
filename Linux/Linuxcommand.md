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

- **`pwd`**: Print working directory.
- **`ls -`**: List contents of the current directory.
- **`ls -a`**: List all files including hidden files.
- **`ls -l`**: List files with properties.
- **`ls -al`**: List hidden files with properties.
- **`ls -R`**: List files and subdirectories recursively.
- **`cd`**: Change directory.
- **`cd .`**: Stay in the current directory.
- **`cd ..`**: Move up one directory.
- **`cd ../folder_name`**: Change to a specific directory.
- **`cd ~/`**: Change to the home directory.

## **File Commands:**

- **`cat`**: Display file contents.
- **`cat > filename`**: Create a new file.
- **`cat file1 file2`**: Display multiple files.
- **`echo`**: Print a statement.
- **`tr`**: Translate characters (e.g., change case).
- **`mkdir`**: Make a new directory.
- **`mkdir folder/subfolder`**: Create nested directories.
- **`mkdir -p folder/new_folder/subfolder`**: Create nested directories.
- **`touch`**: Create a new file.
- **`cp`**: Copy files or directories.
- **`cp -R`**: Copy directories recursively.
- **`mv`**: Move or rename files.
- **`rm -f`**: Remove files forcefully.
- **`rm -r`**: Remove directories recursively.

## **System Commands:**

- **`sudo`**: Execute a command as the superuser.
- **`df -m`**: Display free disk space.
- **`du -h`**: Display file sizes.

## **File Viewing:**

- **`head`**: Display first lines of a file.
- **`head -n4`**: Display first lines of a file.
- **`tail`**: Display last lines of a file.
- **`tail -n4`**: Display last lines of a file.

## **File Comparison:**

- **`diff`**: Compare files.

## **File Search:**

- **`find .`**: Search for files and directories recursively.
- **`locate "*.filename"`**: Search files using a database.
- **`find -type d -name "folder_name"`**: Search for directories.
- **`find -type f -name "file_name"`**: Search for files.
- **`find -type d -name "*.txt"`**: Search for directories.
- **`find -type f -iname "file_name"`**: Search for files ignoring case.
- **`find . -type f -mmin +2`**: Find files modified more than 2 minutes ago.
- **`find . -type f -mmin +2 -mmin -10`**: Find files modified between 2 and 10 minutes ago.
- **`find . -size +(size_of_file)`**: Find files larger than specified size.

## **Miscellaneous:**

- **`find . -type f -maxdepth 1`**: Search files in the current directory only.
- **`find . -empty`**: Show empty folders.



















```
pwd  //print working directory

ls - // list of directory

ls -a  // list of hidden files

ls -l  //show the property of files 

ls -al // show the hidden files and hidden files properties

ls -R  // Show the sub-directories of the files 

cd    // change directory

cd . // back previous directory 

cd .. // back previous and previous folder

cd ../folder name    // changing the folder to another folder to a specific path of the folder 

cd ~/  // changing to the home directories or changing to the any folder (Give folder name)


cat  // show the files 

cat > create  a new file    // create a new file and easy to access edit file in same place and handling Easy
// Exit ctrl + c 

cat file1 file2  // show the multiple files in the same cat command

echo // print the any statement 

man  // helping command manual of all commands Quit press q

tr - Translate the character // changing upper case to lower case   
// eg cat filename | tr a-z A-Z

cat filename \  // add a new line add file here the command

mkdir   // make a new floder 

mkdir folder/folder   // create a folder inside a folder of commands

mkdir -p  folder/new folder / folder // create a middle of  the folder of file path 

touch // create a new File

cp copying file new file // copy file to another file 

cp -R  copying file new file  // -r used to copy all the subdirectories of the folder 

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

find . -type  d //to display all the folder

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
