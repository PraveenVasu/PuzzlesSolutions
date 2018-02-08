
public class ConsecutiveSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number = 15;
		int output = consecutive(number);
		System.out.println(output);

	}
	
	static int consecutive(long sum){
		int count = 0;
		long totalSum = (sum/2)+1;
		for(int i =1;i<totalSum;i++){
			int total = i;
			for(int j=i+1;j<totalSum;j++){
				
				total = total+j;
		
				if(total == sum){
					count = count+1;
					break;
				}
				if(total>sum){
				   break;
				}
			}
			if(total>sum){
				   break;
				}
		}
		
		return count;
	}

}
