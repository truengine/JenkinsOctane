public class Sample {
	public static void main(String[]args){

		int iters = 2;
		String bitters = "so sour!";

		goNow(iters, bitters);
	}
	public String goNow(int a, String bean){
		for(int i = 0; i < a; i++){
			System.out.println("This is " + bean + \n);
		}
		return 0;
	}
}