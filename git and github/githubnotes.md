# Git and Github

# What is Git?

free and open-source version control System 

# What is a Version Control System

- A System that keeps track of our files  or projects
- it allow you to revert selected files to the previous state, and revert the entire modified somethings so that we can know what might be causing a problem, or what is an issue who made it and when with the details

# Types of Version Control System

- Centralized version control System
- Distributed Version Control System

# Centralized Version control system

In a centralized version control system (CVCS) — also known as a centralized source control or revision control system — a server acts as the main centralized repository which stores every version of code. Using centralized source control, every user commits directly to the main branch.

# Distributed  Version Control System

A distributed version control system (DVCS) brings a local copy of the complete repository to every team member’s computer, so they can commit, branch, and merge locally. The server doesn’t have to store a physical file for each branch — it just needs the differences between each commit.

![git](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/9b187052-da4c-4056-9967-f3ac35f02056)



What is Git hub 

- GitHub is web based hosting service for git repositories.
- you can use git without Github, but you cannot use GitHub with git

| Git | Git Hub  |
| --- | --- |
| Used for Versions Control  | Used for hosting Git repositories  |
| Installed locally on computer  | cloud based |
| Tracks changes made to a file  | provides a web interface to view file changes |

# Local Repository

Every VCS tool provides a private working space as a working copy. Developers make changes in the private workplace and after commit. these changes become a part of the repository 

Git takes it one step further by providing them with a private workplace and  after   the commit can be formatted and reviewed before completing the commit whole repository. Users  can perform many operations with this such as add files,remove file , rename file, move  file, commit changes and many more.

Working Directory and Staging Area or Index

An intermediate area where commits can be formatted and reviewed before completing the commit 

### Push :

send a change to another repository (may required permission) 

### Pull :

grab  a change from a repository 

The basic workflow of git

Step  -1: You modify a file from the working directory.

Step →  2: You add these files to the staging areas.

Step → 3:  You perform a commit operation that moves the files from the staging area.

After  the push operation, it stores  the changes  permanently  in the Git repository 

![add and commit](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/d54aec5c-5bd4-4646-bdb9-b50200d4b97b)

# Binary Large Object

- Blobs stands for Binary Large Object
- Each version  of a file is represented by a blob. A blob hold the file data but doesn’t contain any metadata about the file
- it is binary file and in git database, it is named as SHA1 hash of that file
- In git files are not addressed by names. Everything is content-addressed

# Trees

Tree is an Object, which represents a directory. it holds blobs as well as other sub-directories 

A tree is a binary file that stores reference to blobs and trees which are also named as SHA1 hash of the tree object

| Aspect | Blobs | Trees (Directories) |
| --- | --- | --- |
| Definition | Contains the content of a single file. | Contains references to blobs (file contents) or other trees. |
| Content | Stores the file content in its entirety. | Stores references to other blobs or trees, forming a directory structure. |
| Type | Represents a file. | Represents a directory or folder. |
| Identifier | Identified by SHA-1 hash based on the file's content. | Identified by SHA-1 hash and include references to other blobs or trees. |
| Usage | Used for tracking individual file changes. | Used for organizing files into a hierarchical structure. |
| Example (Command) | git ls-tree <commit> or git cat-file -p <blob-hash> | git ls-tree <commit> or git cat-file -p <tree-hash> |

# Commits

- commits the current state of the repository. A commit is also named by SHA1 hash.
- Commit object = a node of the Linked List
- Every commit object has  a pointer to the parent commit object.
- From a given commit, you can traverse back by looking at the parent pointer to view the history of the commit
- if a commit has multiple parent commits, then that particular commit has been created by two branches

  # Git Commands
git configuration setup

1. 

```jsx
Set your username:
git config --global user.name "FIRST_NAME LAST_NAME"

Set your email address:
git config --global user.email "MY_NAME@example.com"
```

```jsx
git init // change the file git 
ls .a // show the hidden folders 
```

```jsx
git add . // staging of git file
```

```jsx
git status // check the status of history 
```

```jsx
git commit -m "message" // sent local respiratory
```

```jsx
git remote -v // location of github respiratory 
```

```jsx
git remote add origin (repo link) // add the repo link 
```

```jsx
git push origin (branch) (main or master) //push the file to github
```

```jsx
git clone (github link) // clone the reposistory 
```

```jsx
touch (create file name.extension) // create a new file
```

```jsx
git remote remove origin  // remove all the repo link the local repo
```

```jsx
git pull --rebase origin main // rebase the repo
```

```jsx
git branch  //  list out all the branch of repo 

```

```jsx
git branch  // list out all branch
```

```jsx
git checkout -b (new branch name) // create a  new branch
```

```jsx
git checkout (branch name) // chaning one to another branch
```

```jsx
git diff (branch name) // differnate the branch name to main branch 
```

```jsx
git branch -d (branch name) //delete branch
```

```jsx
git restore --staged (file name) // remove on file on staging
```

```jsx
git log  // show the history of commit the files
```

```jsx
rm -rf (file name) // remove the file name
```

```jsx
git reset (commit id) // remove the commit from the history of a projects it show on git log command
```

```jsx
 git stash // staging the all file if  your wish not add history of properly 
             //  you use stash command 
             // stash -> marragie not used thing stored in back side of marriage stage 
```

```jsx
git stash pop // come back the normal marriage back side of stage storing 
```

```jsx
git stash clean // remove all the file in stashing area
```

```jsx
git merge (new branch)  // new branch merge to main branch 

```

```jsx
git reset --hard (log value) // reset the log value of hardly delete
```


```jsx
git fetch --all //update remote repo to local repo 
```
```jsx
git rebase //Rebasing is the process of moving or combining a sequence of commits to a new base commit
```

# Pull Request

A pull request (PR) is a method of submitting proposed changes to the Free Code Camp Repo (or any Repo, for that matter). You will make changes to copies of the files which make up in a personal fork,  contribute your changes in real world projects.

# Merge conflicts

- If you’ve ever worked on a team that's working on a large codebase, you’ve likely experienced merge conflicts while creating a pull request or merging two branches.
- Even if you’ve never worked with a team or on a large codebase, it is still possible to have merge conflicts as long as you have more than one branch. In the process of merging one branch with another, a merge conflict may occur.
- Merge conflicts can also occur even if you’re not working with team members. If you’ve made changes to the same file from different branches and the changes are conflicting, there will be a merge conflict.
- On many occasions, Git automatically handles merging for you. But if there are conflicting changes you make to the same file, you have to resolve them manually.




![Untitled](https://github.com/Gokilp/Java-_Dsa_-Notes/assets/76507378/9ea4913d-0599-4971-843f-f2d0723626e6)

