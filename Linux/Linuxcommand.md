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

# File permission

Unix is multi user system Every file and directory in your account can be made accessible to other user by changing its access permission. Every responsbility  for controlling access to their files 

## Permission for a file or directory may be restricted to by types

there are 3 type of permission  

- r - read
- w  →  write
- x →  execute

Each permission ( rwx) can be controlled at three levels

- u →  user =your self
- g  → group  → working people in same projects
- o → other → Every one access the file

## File or directory permission can be displayed by running ls -l command

- -rwxrwxrwx

## Command to change permission

- chmod
- 4 read
- 2 write
- 1  excute

## **File Permissions:**

- **`chmod u+r file.txt`**: Change Mode - Adds read permission for the owner of the file.
- **`chown [OPTIONS] [NEW_OWNER] FILE name`**: Change Ownership - Changes the owner of a file or directory in Unix/Linux systems.

## **File Searching and Manipulation:**

- **`grep`**: Global Regular Expression Print - Searches for patterns in files.
- **`grep "search word " file name`**: Basic Search - Searches for a specific word in a file.
- **`grep -w "searching word" filename`**: Word Search - Searches for a specific word in files.
- **`grep -n "searching word" filename`**: Line Number Search - Displays line numbers where a word is found.
- **`grep -i "searching word" filename`**: Case-Insensitive Search - Searches for a word regardless of case sensitivity.
- **`grep win "search word " file name`**: Combined Functionality - Searches for a word with case sensitivity, whole word matching, and line numbers.
- **`grep -B "search word " file name`**: Contextual Search - Displays lines before the matching line.
- **`grep -win "search word " ./*.txt`**: Directory Search - Searches for a word in all .txt files in the current directory.
- **`grep -rwin "search " .`**: Recursive Directory Search - Searches for a word in all files within subdirectories.
- **`grep -c "search word" filename`**: Count Search - Counts occurrences of a word in a file.

## **Terminal Operations:**

- **`history`**: Command History - Displays a list of previously executed commands.
- **`history | grep "Linux command"`**: Command History Search - Filters command history for specific commands.
- **`alias`**: Alias Creation - Sets up shortcuts or alternate names for commands or command sequences.
- **Terminal Shortcuts**:
    - **`ctrl + a`**: Move to the beginning of the line.
    - **`ctrl + e`**: Move to the end of the line.
    - **`ctrl + u`**: Clear the line before the cursor.
    - **`tab`**: Auto-complete commands or file names.
    - **`Ctrl + R`**: Reverse search for previously executed commands.
    - **`clear`**: Clear the terminal screen.
    - **`;`**: Execute multiple commands sequentially.

## **System Information and Management:**

- **`sort file name`**: Sort - Displays file contents in ascending order.
- **`sort -r filename`**: Reverse Sort - Displays file contents in descending order.
- **`sort -n`**: Numeric Sort - Displays file contents in ascending numerical order.
- **`sort -r -n`**: Reverse Numeric Sort - Displays file contents in descending numerical order.
- **`wget`**: Web Get - Downloads files from the internet.
- **`top`**: Task Manager - Displays real-time system information.
- **`uname`**: Unix Name - Displays system information such as kernel name, operating system, machine hardware, and kernel version.
- **`cat /etc/os-release`**: Operating System Release - Displays information about the operating system.

## **File Compression and Network Tools:**

- **`zip create zipname.zip target file name`**: Create Zip - Compresses files into a zip archive.
- **`unzip create zipname.zip target file name`**: Unzip - Extracts files from a zip archive.
- **`hostname`**: Hostname - Displays the hostname of the system.
- **`hostname -i`**: Hostname IP - Displays the IP address of the system's hostname.
- **`free -h`**: Free Memory - Displays available memory in a human-readable format.
- **`id`**: User Identification - Displays user and group identification information.
- **`getent group "username"`**: Get Entry - Displays group information for a specific user.
- **`lsof`**: List Open Files - Displays files opened by processes.
- **`nslookup`**: Name Server Lookup - Queries internet domain name servers.

## **Miscellaneous:**

- **`&`**: Background Execution - Executes commands in the background.
- **`command !(filename )`**: Command Expansion - Executes a command while excluding specified files

```java
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

find  -type d -name "*.txt"  // spcific search  collection of files

find  -type f -iname "file name"  //i used not a case sentivie 

find . -type f -mmin +2  //find the mintues of file 

find . -type f -mmin +2 -mmin -10 //find the mintues of file  

find .-size +(sizeoffile)  // searching on file size

find  . -type f -maxdepth 1  // specified directory and its subdirectories.

find. -empty // show the empty folder

file permision // read write and excute 

chmod u+r file.txt  // + add the access - means remove the access 

chown [OPTIONS] [NEW_OWNER] FILE name  // "chown changes the ownership of a file or directory in Unix/Linux systems."

grep  // grep command is searching a particular word in file

grep "search word " file name  //searching a particular word using in grep command

grep -w "searching word"  filename  // searching a word 

grep -n  "searching word"  filename  // searching a number of line word found 

grep -i  "searching word"  filename  // searching case sentive word search upper case and lower case 

grep win  "search word " file name  // combined all 3 functionality i -> case sentive , w -> word search m, n -> line

grep  -B "search word " file name   // search file name display previous file name

grep -win "searh word " ./*.txt  // searching a current  directory of files      */

grep -rwin "search " .  // search full sub direcctory of files

grep -c "search word" filename  // search count of file 

history // show  up history 

history | grep "Linux command"  // showing up the history of particular command
 
alias   // command in Unix-like operating systems (such as Linux) allows you to create shortcuts or alternate names for other commands or command sequences.

terminal shortcuts 

ctrl + a // start point of cursor in terminal 
ctrl + e // end point of cursor in terminal
ctrl + u  // remove the full line in terminal 
tab // tab for auto completion 
Ctrl + R // for reverse search in Linux:
clear // clear the screen
; // excxuting same line multiple command 

sort file name // display ascending order 
sort -r filename  // display descending order 
sort -n // display ascending order number 
sort -r -n // display descending order
wget // easliy download online 
top // task manager 
uname // show up the kernal name
uname -0 // show the operatinf system type 
uname -m // show up to the arichuturce 
uname -r  // show an the kernal version 
cat /etc/os-release // shows up the operating system specification 

zip create zipname.zip target file name // create a zip files 
unzip create zipname.zip target file name // create a unzip files 
hostname // hostname file server like this 
hostname -i // shown an ip address 
free -h  // check out free space in memory 
id // show all the id's
getent group "username"  // check out the user in linux command
lsof // stands for List Open Files
nslookup // find the ip adress 
& // use multiple command in same time 
command !(filename )//  expect delete the files  rm -f !(filename )

```
