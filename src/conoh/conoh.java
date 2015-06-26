package conoh;

public class conoh {
	public static void test (int a, int b){
		try{
		int c = a/b;
		System.out.println("Hasil bagi:" +c);
		int[] Arr = {1,2,3,4,5};
		Arr[10] = 11;
		}catch (ArithmeticException ae){
			System.out.println("terdapat pembagian dengan 0");
			System.out.println(ae);
		}catch (ArrayIndexOutOfBoundsException obe){
			System.out.println("Indeks di luar rentang");
			System.out.println(obe);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test (4, 0);
		System.out.println();
		test (12,4);
	}

}
