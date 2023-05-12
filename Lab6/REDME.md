Create a Student class, that will store the details of the Student, below mentioned are the attributes of a student.

Reg. No.

Name

Email

Phone

Class

Department

The Student class will have the following methods:

A constructor to initialize the values of the Student

A method to print the Details of the Student.

A method (named 'toString()) that convert the student details to string, and can be used to write the student details to file.

In the main-method class, create an array of Student Class to hold maximum details of 100 Students.

In the menu-driven program, the menu options will have

Add a student

Adds the details of 1 student to the array of Student.

Search for a student

Search for the details of a student from the array of Student.

Searching can be done with Name or Register Number.

Update the details of a student

Update the student details based on the search based on name or register number.

Display all students

Displays the details of all students.

Save the details of each student in a file, with the student name as filename.

Note: Make use of functions to implement the menu options.

## Output:-

=============MENU===============
1.ADD A STUDENT
2.SEARCH STUDENT
3.UPDATE THE DETAIL OF STUDENT
4.DISPLAY ALL STUDENTS
=================================
Choose any one: 1
NAME: Vignesh
EMAIL: vignesh@gmail.com
PHONE: 741852963
REG. NO.: 22122059
CLASS: mscdsa
DEPARTMENT: ds 
Enter new file name: file is not exist...
The system cannot find the path specified

=============MENU===============
1.ADD A STUDENT
2.SEARCH STUDENT
3.UPDATE THE DETAIL OF STUDENT
4.DISPLAY ALL STUDENTS
=================================
Choose any one: 2

=============================SEARCH STUDENT=============================
ENTER REG. NO.: 22122059
====================================================================================
NAME       EMAIL                              PHONE        REG.NO.        DEPARTMENT
------------------------------------------------------------------------------------

========================================================================================

=============MENU===============
1.ADD A STUDENT
2.SEARCH STUDENT
3.UPDATE THE DETAIL OF STUDENT
4.DISPLAY ALL STUDENTS
=================================
Choose any one: 3
ENTER REG.NO.:22122059
        1.NAME
        2.EMAIL
        3.PHONE
        4.REG. NO.
        5.CLASS
        6.DEPARTMENT
What you want to Update:
1
Enter Name:vicky'
?NAME UPDATETED !!

=============MENU===============
1.ADD A STUDENT
2.SEARCH STUDENT
3.UPDATE THE DETAIL OF STUDENT
4.DISPLAY ALL STUDENTS
=================================
Choose any one: 4
====================================================================================
NAME       EMAIL                              PHONE        REG.NO.        DEPARTMENT
------------------------------------------------------------------------------------
1   vicky'     vignesh@gmail.com                  741852963    22122059       ds
=========================================================================

=============MENU===============
1.ADD A STUDENT
2.SEARCH STUDENT
3.UPDATE THE DETAIL OF STUDENT
4.DISPLAY ALL STUDENTS
=================================

ER-Diagram:-
![image](https://github.com/vigneshchowdary/22122059-MDS273L-JAVA/assets/80962473/a18ca5c1-45e2-4f12-89a5-6840382b1c33)

