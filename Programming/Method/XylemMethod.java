import java.util.Scanner;
class XylemMethod{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        
        if(isXylem(num)) 
            System.out.println("Xylem Number") ;
        else
            System.out.println("not a Xylem Number"); 
    }
    public static boolean isXylem(int num){
        int ids=0;
        int ld=num%10;
        num/=10;
        while(num>9){
              int id=num%10;
              ids=ids+id;
              num/=10;
                      
        }
       int ods=ld+num;
       return ids==ods;        
    }
}