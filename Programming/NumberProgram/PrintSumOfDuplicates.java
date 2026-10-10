import java.util.Scanner;
class PrintSumOfDuplicates{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        for (int i = 0; i <= 9; i++) {
            int temp = num;
            int count = 0;
            int sum=0;
            while (temp > 0) {
                int ld = temp % 10;
                if (ld == i) {
                    count++;
                    sum+=ld;
                }
                temp /= 10;
            }
            if (count > 1) {
                System.out.println(i + " occurrence of digit is - " + count);
                System.out.println(" Sum of digit is - " + sum);
            }
        }   
    }
}
