package class12;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your username");
        String name= input.nextLine();
        System.out.println("Please enter your password");
        String password= input.nextLine();
        System.out.println("Please confirm your password");
        String confirm= input.nextLine();

        if(name.isEmpty() || password.isEmpty()){
            System.out.println("Username and Password cannot be empty");
        }else if (password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(name)){
            System.out.println("Password cannot contain username");
        }else if (!password.equals(confirm)){
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }
    }
}
