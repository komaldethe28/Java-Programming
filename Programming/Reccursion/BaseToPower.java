import java.util.Scanner;
class  BaseToPower{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        int base=sc.nextInt();
        System.out.print("Enter power: ");
        int power=sc.nextInt();
        System.out.println(powerIs(base,power,1));
    }
    public static int powerIs(int base,int power,int res){
        if(power==0){
            return res;
        }
        return powerIs(base,power-1, res*base);
    }
}