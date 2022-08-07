import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter your amount ");

        float p= myObj.nextFloat(); // total amount



        Scanner myType=new Scanner(System.in);
        System.out.println("Enter duration in years");

        float t= myType.nextFloat(); //total time in years



        Scanner myRate=new Scanner(System.in);
        System.out.println("Enter rate of interest");

        float r= myType.nextFloat();//interest given by bank


        float i=(p*t*r/100);
        float net=(i+p); //for simple interest


        float x=(1+r/100);

        Scanner sc = new Scanner(System.in);
        float u = x;

        float y= (float) Math.pow(u, r);
        float z=(p*y);

        int choice;

        int simple = 1;
        int compound = 2;
        System.out.println("What type of interest?");
        System.out.println("1. simple");
        System.out.println("2. compound");


        Scanner keyboard = new Scanner(System.in);
        choice = keyboard.nextInt();

        if (choice == 1) {
            System.out.println("your interest is  " + i);
            System.out.println("your total balance is "+ net);
        }
        else if (choice == 2) {

        System.out.println("your interest is  " + (z-p));
        System.out.println("your total balance is "+ z);
        }





    }
}