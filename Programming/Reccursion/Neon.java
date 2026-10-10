class Neon{
    public static void main(String[] args){
    int num=9;
    int sq=num*num;
        boolean op=isNeon(num,sq,0);
        if(op){
            System.out.println("Neon number");
        }else{
            System.out.println("Not neon number");
        }
    }
    public static boolean isNeon(int num,int sq,int sum){
        if(sq==0){
            return num==sum;
        }
        return isNeon(num,sq/10,sum+sq%10);
    }
}