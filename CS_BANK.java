/*
CS_BANK System
----------------
This program represents a banking system called CS_BANK.
It allows three types of users:
- Admin: View customer balances, transfer between accounts, disable and restore accounts, 
delete accounts, and modify customer data.

- Employee: Disable and restore accounts, create a customer account, 
and delete accounts upon customer request.

- Customer: Create an account, deposit funds, transfer funds, view the balance, 
withdraw funds, suspend accounts, and delete accounts.

Program Mechanism:
The program begins by requesting the user type (administrator, employee, customer).
It then requests the username and password to verify each user's access.
After logging in, each user can use their own privileges.

Login information:
ADMIN_USER_NAME = ADMIN123
EMPLOYEE_USER_NAME = EMPLOYEE123
CUSTOMER_USER_NAME = CUSTOMER123
ADMIN_PASSWORD = A1010
EMPLOYEE_PASSWORD = E1010
CUSTOMER_PASSWORD = C1010
*/

import java.util.Scanner;

public class CS_BANK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int systemUser;
        boolean isValidUser = false;

        // the accounts
        final String ADMIN_USER_NAME = "ADMIN123";
        final String EMPLOYEE_USER_NAME = "EMPLOYEE123";
        final String CUSTOMER_USER_NAME = "CUSTOMER123";
        final String ADMIN_PASSWORD = "A1010";
        final String EMPLOYEE_PASSWORD = "E1010";
        final String CUSTOMER_PASSWORD = "C1010";

        // Welcome message
        System.out.println();
        System.out.println("Welcome to CS_BANK.");
        System.out.println("Are you an admin, employee, or customer?");
        System.out.println("Choose 1 for admin");
        System.out.println("Choose 2 for employee");
        System.out.println("Choose 3 for customer");

        // Specify user type
        do { 
            System.out.print("Enter Your Choice : ");
            systemUser = input.nextInt();

            if (systemUser == 1) {
                System.out.println();
                System.out.println("You are an admin!");
                System.out.print("Enter your username: ");
                String username = input.next();
                System.out.print("Enter your password: ");
                String password = input.next();

                if (username.equals(ADMIN_USER_NAME) && password.equals(ADMIN_PASSWORD)) {
                    System.out.println("Login successful!");
                    System.out.println("Welcome Admin.");
                    isValidUser = true;
                                
                


                    // Admin CODE




                
                } else {
                    System.out.println("Invalid admin credentials, try again.");
                }
            } 
            else if (systemUser == 2) {
                System.out.println();
                System.out.println("You are an employee!");
                System.out.print("Enter your username: ");
                String username = input.next();
                System.out.print("Enter your password: ");
                String password = input.next();

                if (username.equals(EMPLOYEE_USER_NAME) && password.equals(EMPLOYEE_PASSWORD)) {
                    System.out.println("Login successful!");
                    System.out.println("Welcome Employee.");
                    isValidUser = true;
                
                


                    // Employee CODE





                } else {
                    System.out.println("Invalid employee credentials, try again.");
                }
            }
            else if (systemUser == 3) {
                System.out.println();
                System.out.println("You are a customer!");
                System.out.print("Enter your username: ");
                String username = input.next();
                System.out.print("Enter your password: ");
                String password = input.next();

                if (username.equals(CUSTOMER_USER_NAME) && password.equals(CUSTOMER_PASSWORD)) {
                    System.out.println("Login successful!");
                    System.out.println("Welcome Customer.");
                    isValidUser = true;




                    // Customer CODE





                } else {
                    System.out.println("Invalid customer credentials, try again.");
                }
            }
            else {
                System.out.println("");
                System.out.println("Invalid choice, please select 1, 2, or 3.");
            }
        } while (!isValidUser);
    }
}



