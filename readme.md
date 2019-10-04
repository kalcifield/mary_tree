a folder structure represented by a tree, that
contains all writable folders that :

writable == W
readable == R
if W -> R
if R != W

R - W == ReadOnly -> RO
RO folders can be ignored, because it is not necessary to mark readonly folders
and leaf RO folders are not shown

-can be reached via at least readable folder from the root.

The tree cannot contain folders that are:

-not readable by the user (not even if it has writable subfolders).
    !every input folder is readable

Folders that are readable must be included if they have writable subfolders,
if it has no writable descendant, it has to be excluded

Paths that are in the writable list, are also in the readable list
Folder names do not contain any special characters
- You can assume the folder structure fits into memory