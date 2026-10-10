import java.util.Scanner;
class CountDigit{
    public static void main(String [] args){
        System.out.println(count(125553,0));
    }
    public static int count(int num, int count){
        if(num==0){
            return count;
        }
        return count(num/10, ++count);   //count++ wrong here
    }
}