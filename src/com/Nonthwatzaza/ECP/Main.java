package com.Nonthwatzaza.ECP;

import java.util.Scanner;
// By Nonthwat zaza ECP2N/61
public class Main {
    public static void main(String[] args)
    {
        int Num;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("input cash : ");
        Num = keyboard.nextInt();
        int cash = Num;
        int bookPrice = 180;
        int foodPrice = 20;
        int sodaPrice = 7;

        if (cash>bookPrice)
        {cash -= bookPrice;
        System.out.println("your have been buy book :remaining money =" +cash);}
        else{ System.out.println("not enough money to buy book :remaining money =" +cash);
        }
        // buyor not buy book
        if (cash>foodPrice)
        {cash -= foodPrice;
        System.out.println("your have been buy food :remaining money =" +cash);}
        else { System.out.println("not enough money to buy food :remaining money =" +cash);
        }
        // buyor not buy food
        if (cash>sodaPrice)
        {cash -= sodaPrice;
        System.out.println("your have been buy soda :remaining money =" +cash);}
        else { System.out.println("not enough money to buy soda :remaining money =" +cash);
        }
        // buyor not buy soda
        System.out.println("remaining money =" +cash);
    }
}
