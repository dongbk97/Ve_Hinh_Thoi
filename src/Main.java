
public class Main {
	public static void inString(int n) {
		String[] a = new String[n];
		for (int m = 0; m < n; m++) {
			a[m] = " *";
			System.out.print(a[m]);
		}

	}

	public static void inString2(int n) {
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = "  ";
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
		}
	}

	public static int[] daoNguoc(int[] a) {
		int[] b = new int[a.length];
		int g = a.length;
		for (int i = 0; i < g; i++) {
			b[i] = a[g - i - 1];
		}
		return b;
	}

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for (i = 0, j = 10; i <= 10 && j >= 0; i++, j--) {

			inString2(j);
			inString(i);
			inString(i);
			inString2(j);
			System.out.println();
// Test git 
		}
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		for (i = 0, j = 10; i <= 10 && j >= 0; i++, j--) {
			inString2(i);
			inString(j);
			inString(j);
			inString2(i);
			System.out.println();
		}
	}
}
