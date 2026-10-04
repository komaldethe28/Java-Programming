import java.util.Scanner;
class SunnyNumber{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        num=num+1;

        boolean flag= false;
        for(int i=1;i<=num;i++){
            if(i*i==num){
                flag= true;
                break;
            }
        }
        if (flag) {
            System.out.println("its a sunny number");
        }else{
            System.out.println("its not a sunny number");
        }
    }
}