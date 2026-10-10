import java.util.Scanner;
class PronicMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        boolean ans=isPronic(num);
        if (ans) {
            System.out.println("its a pronic number");
        }else{
            System.out.println("its not a pronic number");
        }
    }
    public static boolean isPronic(int num){
        boolean flag=false;
        for(int i=1;i<=num;i++){
            if(i * (i+1)==num){
                flag= true;
                break;
            }
        }
        return flag;
    }
}