import java.util.Scanner;
class ProductOfDigit{
    public static void main(String [] args){
        System.out.println(digitProd(23,1));
    }
    public static int digitProd(int num, int prod){
        if(num==0){
            return prod;
        }
        return digitProd(num/10, prod*num%10);
    }
}