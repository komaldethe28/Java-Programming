import java.util.Scanner;
class Reverse{
    public static void main(String [] args){
        System.out.println(rev(123,0));
    }
    public static int rev(int num, int rev){
        if(num==0){
            return rev;
        }
        return rev(num/10, rev*10+num%10);
    }
}