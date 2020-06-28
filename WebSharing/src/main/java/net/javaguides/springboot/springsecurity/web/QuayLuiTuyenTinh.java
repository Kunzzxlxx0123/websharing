import java.util.Queue;


public class QuayLuiTuyenTinh {
	final static int N = 3;
	final static int M = 10;
	static int A[] = new int[N+1];
	static int M_tren = -1;
	static int M_duoi = 1;
	static int f = 0;
	static int count = 0;
	
	static void print(){
		for(int i = 1; i < A.length; i++){
			if(A[i] <= A[i+1]){
				System.out.print(A[i]+ " ");
			}
			
		}
	}
	
	static void TRY(int i){
		if(i == N){
			M_tren = M_duoi = M - f;
		} else {
			M_tren = M - f - (N -i);
			M_duoi = 1;
		}
			
			for(int v = M_duoi; v <= M_tren; v++){
				A[i] = v;
				f = f + v;
				if(i == N){
					print();
					count++;
					System.out.println();
				} else TRY(i+1);
				f -= v;
			}
			
	}
	
	public static void main(String[] args) {
		TRY(1);
		System.out.println(count);
	}
}
