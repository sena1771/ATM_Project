package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String user_name,password;
        int right=3;
        int choose;
        int money=2100;

        Scanner inp=new Scanner(System.in);

        while(right>0) {
            System.out.print("\nUsername: ");
            user_name= inp.nextLine();
            System.out.print("\nPassword: ");
            password= inp.nextLine();

            if (user_name.equals("sena12345") && password.equals("senae")) {
                System.out.print("Welcome to the Bank of Sena ");


                 System.out.print("1-Deposit\n" +
                         "2-Withdrawal\n" +
                         "3-Balance Information\n" +
                         "4-Sign out");

                 System.out.print("Please choose a number for your process");
                 choose = inp.nextInt();
                 switch (choose) {
                     case 1:
                         System.out.print("Amount of money you wanna deposit: ");
                         int deposit = inp.nextInt();
                         money += deposit;
                         break;
                     case 2:
                         System.out.print("Amount of money you wanna withdrawal: ");
                         int withdrawal = inp.nextInt();
                         if (money < withdrawal) {
                             System.out.print("Amount of money is not enough for withdrawing process");
                             break;
                         } else {
                             money -= withdrawal;

                         break; }
                     case 3:
                         System.out.print(" Current amount of money: " + money);
                         break;
                     case 4:
                         System.out.print("Thank you for preferring the Bank of Sena. Have a nice day. ");
                         break;
                     default:
                         System.out.println("Try Again");
                         break;


                 } }


         else{

            right--;


            System.out.print(" Wrong username or password. Please try again. \n");

        if(right==0){
        System.out.print("Your account has blocked. Please connect with authorized one ");
    }
else{
    System.out.print("Remaining right: "+right);
    }
}
    }
 } }
