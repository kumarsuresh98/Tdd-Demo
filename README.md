# Tdd-Demo
This Sample code shows how to develop an application using TDD [Test Driven Development]. 
Start with Junit and makes fail the scenarios and move to actual production ready code.
Initially you may feel its hard to follow. But I am sure, if you practices this you can develop strong bug free/less code.
Also now a days, most of the companies are looking for developers who knows TDD.
Have to practice this in order to be upto the speed.


Referring this video which may helps you.

https://www.youtube.com/watch?v=s9vt6UJiHg4




Some GIT Cli Commands

Getting & Creating Projects
----------------------------

git init : 	Initialize a local Git repository

git clone ssh://git@github.com/[username]/[repository-name].git  : 	Create a local copy of a remote repository


Basic Snapshotting
-------------------

git status               : Check status<br>
git add [file-name.txt]	 : Add a file to the staging area<br>
git add -A               : Add all new and changed files to the staging area<br>
git commit -m "message]" : Commit changes<br>
git rm -r [file-name.txt]: Remove a file (or folder)<br>


Branching & Merging
-------------------


git branch	: List branches (the asterisk denotes the current branch)<br>
git branch -a	 : List all branches (local and remote)<br><br><br>
git branch [branch name]	: Create a new branch<br><br>
git branch -d [branch name]	 : Delete a branch<br>
git push origin --delete [branch name]	 : Delete a remote branch<br>
git checkout -b [branch name]	 : Create a new branch and switch to it<br>
git checkout -b [branch name] origin/[branch name]	 : Clone a remote branch and switch to it<br>
git checkout [branch name]	 : Switch to a branch<br>
git checkout -	: Switch to the branch last checked out<br>
git checkout -- [file-name.txt]	 : Discard changes to a file<br>
git merge [branch name]	 : Merge a branch into the active branch<br>
git merge [source branch] [target branch]	 : Merge a branch into a target branch<br>
git stash	: Stash changes in a dirty working directory<br>
git stash clear : 	Remove all stashed entries<br>



Cheers...
SureshKumar
