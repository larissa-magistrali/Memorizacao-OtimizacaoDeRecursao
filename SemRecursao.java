
public class SemRecursao {
	public static void main(String[] args) {
		int tam=Integer.parseInt(args[0]); 
		long v[][] = new long [3][tam+1]; 
		v[0][0]=0;
		v[0][1]=1;
		v[1][0]=0;
		v[1][1]=1;
		v[2][0]=0;
		v[2][1]=5;
		for(int i=2;i<=tam;i++) {
			v[0][i]=3*v[0][i-1]+2*v[1][i-1];
			v[1][i]=3*v[0][i-1]+  v[1][i-1];
			v[2][i]=3*v[0][i]  +2*v[1][i];
		}
		System.out.println(v[2][tam]);
	}
}
