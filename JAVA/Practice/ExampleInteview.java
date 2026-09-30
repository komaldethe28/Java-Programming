class ExampleInteview{
public static void main(String[] args){
	int i=1 , num=1;

	outerloop:
	while(true){
		for(int j= 1; j<=i; j++){
			System.out.print(num++);
			if (num>1000) break outerloop;
			}
				System.out.print("             ");
				i++;
		}
	}
}