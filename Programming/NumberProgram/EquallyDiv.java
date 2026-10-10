//WAP to check whether umber will divide equally or not

import java.util.Scanner;
class EquallyDiv{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int count=0;
        while(num!=0){
        	count++;
        	num/=10;
        }
        if (count%2==0){
        	System.out.println("number is equally divisible");
        }
        else{
        	System.out.println("number is not equally divisible");
        }
    }
}