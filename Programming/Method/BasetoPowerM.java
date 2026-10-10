import java.util.Scanner;
class BasetoPowerM{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        System.out.print("Enter a power:");
        int power= sc.nextInt();

        int ans=Power(num, power);
        System.out.println(ans);
        
    }

    public static int Power(int num, int power){
        int res=1;
        for(int i=1; i<=power; i++){
            res=res*num;
        }
        return res;
    }
}
