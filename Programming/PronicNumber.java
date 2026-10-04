import java.util.Scanner;
class PronicNumber{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
		boolean flag=false;

        for(int i=1;i<=num;i++){
            if(i * (i+1)==num){
                flag= true;
                break;
            }
        }
        if (flag) {
            System.out.println("its a pronic number");
        }else{
            System.out.println("its not a pronic number");
        }
    }
}