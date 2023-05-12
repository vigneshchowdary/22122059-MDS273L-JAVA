Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
Four functions inside your lab program class including your main class
One static String array storing the names (note the program can store up to 1024 students)
One two-dimensional string array storing the details of up to 1024 students
A menu-driven main method implementing the functions and functionality

## Output:-
Menu:
1. Enter student details
2. Display student details
3. Search student details
4. Exit
Enter an option: 1
Enter student name: vignesh
Enter register number: 22122059
Enter email: vignesh@gmail.com
Enter class: mscdsa
Enter department: DS
Details added successfully!
Menu:
1. Enter student details
2. Display student details
3. Search student details
4. Exit

Enter an option: 2
Name            Register Number         Email                   Class           Department
vignesh         22122059                vignesh@gmail.com               mscdsa          DS
Menu:
1. Enter student details
2. Display student details
3. Search student details
4. Exit
Enter an option: 3
Enter student Register number: 22122059
Name            Register Number
vignesh         22122059
Menu:
1. Enter student details
2. Display student details
3. Search student details
4. Exit
Enter an option: 4
Exiting the program...

## ER-Diagram:-
![image](https://github.com/vigneshchowdary/22122059-MDS273L-JAVA/assets/80962473/4e30af81-559f-46a0-9690-ff2aebf98c64)

