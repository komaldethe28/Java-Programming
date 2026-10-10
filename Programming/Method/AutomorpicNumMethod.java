import java.util.Scanner;
class AutomorpicNumMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        int temp=num;
        boolean ans=isAutomorpic(num, temp);
        if(ans)
            System.out.println(temp+" is Automorpic Number");
        else
            System.out.println(temp+" is not a Automorpic Number");
    }
    public static boolean isAutomorpic(int num, int temp){
        int sq=num*num;
        
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        int devide=1;
        for (int i=1;i<=count; i++){
            devide*=10;
        }
        System.out.println("Sequence: "+sq);
        System.out.println("Devide: "+devide);

        int res=sq%devide;
        return res==temp;
        
    }
}