package homework4;

import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three number");
        double num1,num2,num3;
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();


        if (num1>num2 && num1>num3){
            System.out.println("The largest number is "+ num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("The largest number is "+ num2);
        }else {
            System.out.println("The largest number is "+ num3);
        }
    }
}
