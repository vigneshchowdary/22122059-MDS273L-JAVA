Lab Exercise Question
You are supposed to create a menu-driven program that has the following menu options:
Enter a name
Search for a name
Remove a name
Show all names
Note:
The menu-driven program has to be made with the help of a do-while loop and switch-case statements.
Constraints:
The names collected must be stored in an array with a max length of 1024.
The names in the array should be UNIQUE; no duplicate entries are expected!
Provide necessary validations that the user enters only valid names that are not going to be repeated.
Removing a name should not create empty space inside the array!
Format your results properly!!


PS C:\Users\Vignesh>  & 'C:\Program Files\Java\jdk-19\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\Vignesh\AppData
\Local\Temp\vscodesws_98e33\jdt_ws\jdt.ls-java-project\bin' 'seconds' 
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
1
Enter your name: vicky
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
varun
Exception in thread "main" java.lang.NumberFormatException: For input string: "varun"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.parseInt(Integer.java:781)
        at seconds.main(seconds.java:20)
PS C:\Users\Vignesh>  & 'C:\Program Files\Java\jdk-19\bin\java.exe' '--enable-preview' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\Vignesh\AppData
\Local\Temp\vscodesws_98e33\jdt_ws\jdt.ls-java-project\bin' 'seconds' 
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
1
Enter your name: vickty
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
1
Enter your name: varun
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
1
Enter your name: yuvraj
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
1
Enter your name: ashish
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
2
Which name your are searching?.
vicky
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
3
Which name you want to delete. :
vicky
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
4
Your list are:
vickty,varun,yuvraj,ashish,
########### MENU ###########
## 1. Enter the name:    ###
## 2. Search for a name: ###
## 3. Remove a name:    ####
## 4. Print the name list ##
## 5. Quit              ####
############################
Enter your choice:
5
Program will now wxit in 3.2.1..
PS C:\Users\Vignesh>
