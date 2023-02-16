
public class GitDemo1 {

	public static void main(String[] args) {

		int num1 = 10;

		int finalResult = getSum(num1);
		System.out.println("final result  >  " + finalResult);
	}

	private static int getSum(int num1) {
		System.out.println("num1  > " + num1);
		int num2 = 5;
		System.out.println(num2);
		int num3 = num1 + num2;
		getAdd(num3);
		return num1;
	}

	private static void getAdd(int num3) {
		int result = num3 + 50;
		System.out.println(result);
	}
}
