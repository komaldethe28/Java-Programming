import java.util.Scanner;
class PerfectSquare{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        boolean flag= false;
        for(int i=1;i<=num;i++){
            if(i*i==num){
                flag= true;
                break;
            }
        }
        if (flag) {
            System.out.println("its a perfect square");
        }else{
            System.out.println("its not a perfect square");
        }
    }
}