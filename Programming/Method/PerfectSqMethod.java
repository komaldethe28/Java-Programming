import java.util.Scanner;
class PerfectSqMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        boolean ans= isPerfectSq(num);
        if (ans) {
            System.out.println("its a perfect square");
        }else{
            System.out.println("its not a perfect square");
        }
    }
    public static boolean isPerfectSq(int num ){
        boolean flag= false;
        for(int i=1;i<=num;i++){
            if(i*i==num){
                flag= true;
                break;
            }
        }
        return flag;
    }
}
