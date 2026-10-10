class PerfectNum{
    public static void main(String [] args){
        System.out.println(isPerfect(28,0,1));
    }
    public static boolean isPerfect(int num, int sum, int i){
        if(num/2<i){
            return num==sum;
        }
        if(num%i==0){
            sum+=i;
        }
        return isPerfect(num, sum, i+1);
    }
}