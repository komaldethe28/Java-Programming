import java.util.Scanner;
class SunnyNumMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        boolean ans=isSunny(num);
        if (ans) {
            System.out.println("its a sunny number");
        }else{
            System.out.println("its not a sunny number");
        }
    }
    public static boolean isSunny(int num){
        num+=1;
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