
public class FindTheWinner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] andrea = {1,2,3};
		int[] maria = {2,1,3};
		String s = "even";
		String res = winner(andrea,maria,s);
		System.out.println(res);

	}
	
	static String winner(int[] andrea,int[] maria,String s){
		int a = 0;
		int m = 0;
		for(int i=0;i<andrea.length;i++){
			if(s.equalsIgnoreCase("even")){
			if(i%2 ==0){	
			a = a +(andrea[i]-maria[i]);
			m = m+(maria[i]-andrea[i]);
			}
			}else{
				if(i%3 ==0){	
					a = a +(andrea[i]-maria[i]);
					m = m+(maria[i]-andrea[i]);
					}
				
			}
		}
		
		if(a>m){
			return "Andrea";
		}
		else{
			return "Maria";
		}
	}

}
