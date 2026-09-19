import java.util.Scanner;
class XylemNum{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();

         int ids=0;
        int ld=num%10;
        num/=10;
        while(num>9){
              int id=num%10;
              ids=ids+id;
              num/=10;
                      
        }
       int ods=ld+num;

        if(ids==ods) 
            System.out.println("XylemNum") ;
        else
            System.out.println("not a XylemNum");   
        
    }
}