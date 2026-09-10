class Example1{
public static void main(String [] args){
		int n=4;
		outerRec(1,n);
	}
public static void outerRec(int i, int n){
	innerRec(1,n);
	System.out.println();
	if(i==n) return;
	outerRec(++i,n);
	}
public static void innerRec(int i, int n){
	System.out.print("*");
	if(i==n) return;
	outerRec(++i,n);
	}

}