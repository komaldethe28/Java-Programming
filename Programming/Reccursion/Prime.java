class Prime{
    public static void main(String [] args){
        System.out.println(isPrime(13,2));
    }
    public static boolean isPrime(int num, int i){
        if(i==num){
            return true;
        }
        if(num<=1){
            return false;
        }
        
        if(num%i==0){
            return false;
        }
        return isPrime(num, i+1);
    }
}