import java.util.Scanner;
class DecToBinMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        int ans = isBinary(num);
        System.out.println(ans);
    }
    public static int isBinary(int num){
        int bin=0;
        int ldigit=0, place=1; 

        while(num>0){
            ldigit=num%2;
            bin=bin+ldigit*place;
            num=num/2;
            place= place*10;
        }
        return bin;
    }
}