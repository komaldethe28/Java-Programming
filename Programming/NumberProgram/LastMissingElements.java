import java.util.Scanner;
class LastMissingElements{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        for(int i=9; i>=0; i--){
            int temp= num;
            int count=0;
            while(temp!=0){
                int ld=temp%10;
                if(ld==i){
                    count++;
                }
                temp/=10;
            }
            if(count==0){
                System.out.println("last missing element is: "+i);
                break;
            }
        }
    }
}
