interface Math{
	int add(int a, int b);
	int square(int num);
}
class DemoMath{
	public static void main(String[] args) {
		MathImp obj= new DemoMath().new MathImp();
		System.out.println(obj.add(10,10));
		System.out.println(obj.square(5));
	}

	class MathImp implements Math{
		public int add(int a, int b){
			return a+b;
		}
		public int square(int num){
			return num*num;
		}
	}
}