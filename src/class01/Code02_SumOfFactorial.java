package class01;

public class Code02_SumOfFactorial {

	public static long f1(int N) {
		long ans = 0;
		for (int i = 1; i <= N; i++) {
			ans += factorial(i);
		}
		return ans;
	}

	public static long factorial(int N) {
		long ans = 1;
		for (int i = 1; i <= N; i++) {
			ans *= i;
		}
		return ans;
	}

	public static long f2(int N) {
		long ans = 0;
		long cur = 1;
		for (int i = 1; i <= N; i++) {
			cur = cur * i;
			ans += cur;
		}
		return ans;
	}

	public static long f3(int N){
		long a=0;
		long b=1;
		for ( int i=1;i<=N;i++){
			b=b*i;
			a+=b;
		}
		return a;

	}

	public static void main(String[] args) {
		int N = 10;
		System.out.println(f1(N));
		System.out.println(f2(N));
		System.out.println(factorial(N));
	}

}
