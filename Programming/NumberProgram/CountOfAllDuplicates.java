import java.util.Scanner;
class CountOfAllDuplicates{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

        int countDup=0;
        for (int i = 0; i <= 9; i++) {
            int temp = num;
            int count = 0;

            while (temp > 0) {
                int ld = temp % 10;
                if (ld == i) {
                    count++;
                }

                temp /= 10;
            }

            if (count > 1) {
                countDup++;
                System.out.println(i + " occurrence of digit is - " + count);
                
            }
        }
System.out.print("Count of all duplicates is :- "+countDup);
    }
}
