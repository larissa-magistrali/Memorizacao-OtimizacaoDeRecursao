
public class RecursaoSemMemorizacao {
	public static void main(String[] args) {
		int tam = Integer.parseInt(args[0]);//tam maximo com o long = 29	
		System.out.println(Senhas(tam));
	}
	public static long Senhas(int n) {
		if(n<0)  {return 0;}
		if(n==0) {return 1;}
		return 3*ABE(n)+2*CD(n);
	}
	public static long ABE(int n) {
		if(n==1) {return 1;}
		return 3*ABE(n-1)+2*CD(n-1);
	}
	public static long CD(int n) {
		if(n==1) {return 1;}
		return 3*ABE(n-1)+CD(n-1);
	}
}
//-----------------------------OU--------------------------------
/*public class RecursaoSemMemorizacao {
	public static void main(String[] args) {
		int tam = 6;//Integer.parseInt(args[0]); --- 501037445
		System.out.println(Senhas(tam));
	}
	//ABCDE - CC DD
	public static long Senhas(int n) {
		if(n<0)  {return 0;}
		if(n==0) {return 1;}
		return A(n)+B(n)+C(n)+D(n)+E(n);
	}
	public static long A(int n) {
		if(n==1) {return 1;}
		return A(n-1)+B(n-1)+C(n-1)+D(n-1)+E(n-1);
	}
	public static long B(int n) {
		if(n==1) {return 1;}
		return A(n-1)+B(n-1)+C(n-1)+D(n-1)+E(n-1);
	}
	public static long C(int n) {
		if(n==1) {return 1;}
		return A(n-1)+B(n-1)+D(n-1)+E(n-1);
	}
	public static long D(int n) {
		if(n==1) {return 1;}
		return A(n-1)+B(n-1)+C(n-1)+E(n-1);
	}
	public static long E(int n) {
		if(n==1) {return 1;}
		return A(n-1)+B(n-1)+C(n-1)+D(n-1)+E(n-1);
	}
}*/
