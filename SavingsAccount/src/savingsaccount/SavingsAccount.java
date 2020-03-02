package savingsaccount;

/******************************************************************************
 * SavingsAccount.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program calculates the value of a savings account as it grows
 *****************************************************************************/

import java.util.Scanner;

public class SavingsAccount {

    public static void main(String[] args) 
    {
        //Declarations
        Scanner stdIn = new Scanner(System.in);     
        Account savingsAccount = new Account(); //new instance of Account class
        int cycles;                             //number of times to compound interest
        double interestRate;                    //user input interest rate
        double balance;                         //user input starting balance
        //Input - get the needed data
        System.out.println("Ch 6 Account by JC Boyd\n");
        System.out.print("Enter the starting balance for this Savings Account: ");
        balance = stdIn.nextDouble();
        System.out.println("Interest rate: to enter 2.5%, type 2.5");
        System.out.print("Please enter the interest rate for this account: ");
        interestRate = stdIn.nextDouble();
        System.out.print("Enter the number of cycles to grow this Savings Account: ");
        cycles = stdIn.nextInt();
        //Processing - set those values in the account object
        savingsAccount.setInterestRate(interestRate);
        savingsAccount.setBalance(balance);
        //Processing - grow the account
        savingsAccount.growAccount(cycles);
        System.out.printf("After %d cycles, the account is worth $%-,10.2f\n",
                cycles, savingsAccount.getBalance());
    } //end main

} //end class SavingsAccount
