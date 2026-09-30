import java.util.Scanner;
class TwistedPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev=0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            while(num>0){
                rev=rev*10+num%10;
                num/=10;
            }
            System.out.println(rev);

            int countRev = 0;
            for (int i = 1; i <= rev; i++) {
                if (rev % i == 0) {
                    countRev++;
                }
            }

            if(countRev==2){
                System.out.println("its Twisted Prime number");
            }
            else{
                System.out.println("is not Twisted Prime number");
            }
        } 
        else {
            System.out.print("invalid number");
        }
    }
}