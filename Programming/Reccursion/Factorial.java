class Factorial{
    public static void main(String [] args){
        System.out.println(fact(5,1));
    }
    public static int fact(int num, int factorial){
        if(num==1){
            return factorial;
        }
        return fact(num-1, factorial*num);
    }
}