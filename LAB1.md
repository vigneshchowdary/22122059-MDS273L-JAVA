QUESTION:
Write a Java Program that will collect an employee's basic details that fall into different data types and displays them.
After the details have been displayed, with the help of conditional statements, check if the gender of the employee is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.
Assume that you can divide the states among India into different regions (North, South, Central, East, and West). If the employee is from the southern part of India, with the help of a switch statement, it should display "The Employee is from the southern states of India; Preferable work location is in <state>", along with the basic details.
Identify if the employee belongs to the top MNC Companies (Facebook, Google, Microsoft, Samsung, IBM, Apple); if so, print a message "The employee is working in Top MNC Companies".

Note: Your program should be neatly organized, with appropriate comments, variable names, proper input output formatting, and necessary validations.

----------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("........Enter Employees Detail.......");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("age: ");
        int age = sc.nextInt();

        System.out.print("gender (m/f): ");

        sc.nextLine();
        char gender = sc.nextLine().charAt(0);

        System.out.print("state: ");
        String state = sc.nextLine();

        System.out.print("Enter Employee company name: ");
        String company = sc.nextLine();

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (gender == 'm') {
            System.out.println("Gender: MALE");
        } else if (gender == 'f') {
            System.out.println("Gender: FEMALE");
        }
        switch (state) {

            case "Jammu & Kashmir":
            case "Himachal Pradesh":
            case "Punjab":
            case "Uttarakhand":
            case "Haryana":
            case "Delhi":
            case "Rajasthan":
            case "Uttar Pradesh":
            case "UT Chandigarh":
                System.out.print("The Employee is from the northern states of India; Preferable work state is in "
                        + state);
                break;

            case "Andhra Pradesh":
            case "Karnataka":
            case "Kerala":
            case "Tamil Nadu":
            case "Telangana":
                System.out.print("The Employee is from the Southern states of India; Preferable work state is in "
                        + state);
                break;

            case "Arunachal Pradesh":
            case "Assam":
            case "Manipur":
            case "Meghalaya":
            case "Mizoram":
            case "Nagaland":
            case "Sikkim":
            case "Tripura":
                System.out.print(
                        "The Employee is from the east states of India; Preferable work state is in " + state);
                break;

            case "Goa":
            case "Gujarat":
            case "Maharashtra":
            case "Daman":
            case "Diu":
            case "Dadra Nagar Haveli":
                System.out.print(
                        "The Employee is from the western states of India; Preferable work state is in " + state);
                break;

        }

        String[] topMncCompanies = { "Facebook", "Google", "Microsoft", "Samsung", "IBM", "Apple" };
        String MNC = "";

        for (String mnc : topMncCompanies) {
            if (company.equalsIgnoreCase(mnc)) {
                MNC = mnc;
                break;
            }

        }

        if (MNC.equalsIgnoreCase("Facebook") ||
                MNC.equalsIgnoreCase("Google") ||
                MNC.equalsIgnoreCase("Samsung") ||
                MNC.equalsIgnoreCase("Microsoft") ||
                MNC.equalsIgnoreCase("IBM") ||
                MNC.equalsIgnoreCase("Apple")) {
            System.out.println("The employee is working in Top MNC Companies");
        } else {
            System.out.println("The company is " + company);
        }

    }

    // String[] north_states = {"Jammu & Kashmir", "Himachal Pradesh", "Punjab",
    // "Uttarakhand", "Haryana", "Delhi", "Rajasthan", "Uttar Pradesh","UT
    // Chandigarh"};
    // String[] southern_states = {"Andhra Pradesh", "Karnataka", "Kerala", "Tamil
    // Nadu", "Telangana"};
    // String[] eastern_states = {"Arunachal Pradesh", "Assam", "Manipur",
    // "Meghalaya", "Mizoram", "Nagaland", "Sikkim", "Tripura"};
    // String[] west_states = {"Goa", "Gujarat", "Maharashtra", "Daman", "Diu",
    // "Dadra Nagar Haveli"};

}
