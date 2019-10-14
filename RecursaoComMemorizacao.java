
public class RecursaoComMemorizacao {
	static int tam;
	static long v1[];
	static long v2[];
	
	public static void main(String[] args) {
		tam = Integer.parseInt(args[0]); //tam maximo com o long = 29	
		v1 = new long [tam+1];
		v1[0]=1;
		v1[1]=1;
		v2 = new long [tam+1];
		v2[0]=1;
		v2[1]=1;		
		System.out.println(Senhas(tam));
	}
	public static long Senhas(int n) {
		if(n<0)  {return 0;}
		if(n==0) {return 1;}
		return 3*ABE(n)+2*CD(n);
	}
	public static long ABE(int n) {
		if(v1[n]>0){return v1[n];}
		long resp = 3*ABE(n-1)+2*CD(n-1);
		v1[n]=resp;
		return resp;
	}
	public static long CD(int n) {
		if(v2[n]>0){return v2[n];}
		long resp = 3*ABE(n-1)+CD(n-1);
		v2[n]=resp;
		return resp;
	}
}
//-----------------------------OU--------------------------------
/*public class RecursaoComMemorizacao {
	static int tam=0;
	static long v1[];
	static long v2[];
	public static void main(String[] args) {
		tam = 15;// longeger.parselong(args[0]);
		v1 = new long [tam+1];
		v1[0]=1;
		v1[1]=1;
		v2 = new long [tam+1];
		v2[0]=1;
		v2[1]=1;
		System.out.println(Senhas(tam));
	}
	public static long Senhas(int n) {
		if(n<0)  {return 0;}
		if(n==0) {return 1;}
		return A(n)+B(n)+C(n)+D(n)+E(n);
	}	
	public static long A(int n) {
		if(v1[n]>0){return v1[n];}
		long resp = A(n-1)+B(n-1)+C(n-1)+D(n-1)+E(n-1);
		v1[n]=resp;
		return resp;
	}
	public static long B(int n) {
		if(v1[n]>0){return v1[n];}
		long resp = A(n-1)+B(n-1)+C(n-1)+D(n-1)+E(n-1);
		v1[n]=resp;
		return resp;
	}
	public static long E(int n) {
		if(v1[n]>0){return v1[n];}
		long resp = A(n-1)+B(n-1)+C(n-1)+D(n-1)+E(n-1);
		v1[n]=resp;
		return resp;
	}	
	public static long C(int n) {
		if(v2[n]>0){return v2[n];}
		long resp = A(n-1)+B(n-1)+D(n-1)+E(n-1);
		v2[n]=resp;
		return resp;
	}	
	public static long D(int n) {
		if(v2[n]>0){return v2[n];}
		long resp = A(n-1)+B(n-1)+C(n-1)+E(n-1);
		v2[n]=resp;
		return resp;
	}
}*/
