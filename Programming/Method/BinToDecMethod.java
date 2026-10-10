import java.util.Scanner;
class BinToDecMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        int ans = isDecimal(num);
        System.out.println(ans);
    }
    public static int isDecimal(int num){
        int dec=0;
        int ldigit=0, place=1; 

        while(num>0){
            ldigit=num%10;
            dec=dec+ldigit*place;
            num=num/10;
            place= place*2;
        }
        return dec;
    }
}