package com.company;

import java.util.Random;
import java.util.Scanner;


public class Dicegame {

    public static void main(String args[]) {

        Random r = new Random();
        int score = 0;
        String userResponse=" ";
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Welcome! Let's Play Roll Dice!");

     do {
         int num1 = 1 + r.nextInt(6);
         int num2 = 1 + r.nextInt(6);
         System.out.println("your dices are" + num1 + "and" + num2);

         if (num1 == 1 && num2 == 1) {
             score = score + 25;
             System.out.println("your score" + score);

         } else if (num1 == 1 && num2 > 1 || num1 > 1 && num2 == 1) {
             score = score + 0;
             System.out.println("your score" + score);

         } else if (num1 > 1 && num2 > 1) {
             score = score + num1 + num2;
             System.out.println("your score" + score);

             System.out.println("Do you still want to play?");
             userResponse = Keyboard.nextLine();

         }
         }while (userResponse.equalsIgnoreCase("Y") && score < 100) ;


         System.out.println("You have scored over 100.Thank you for playing");
         System.out.println("Roll again No?");


     }
        }














