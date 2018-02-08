
public class InTheFuture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num = minNum(4,5,1);
     System.out.println(num);
	}
	
	static int minNum(int A,int K,int P){	
		if(A>=K){
			return -1;
		}
		int a = A+P;
		int k =K;
		int num =1;
		while(k<=a){
			a = a+A;
			k=k+K;		
			num = num+1;
			
		}
		return num;
	}

}
