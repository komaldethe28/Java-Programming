class Factors{
    public static void main(String [] args){
        int num=12;
       fact(num,1);
    }
    public static void fact(int num,int i){
        if(i>num){
            return;
        }
        if(num%i==0){
            System.out.println(i);
        }
        fact(num, i+1);
    }
}