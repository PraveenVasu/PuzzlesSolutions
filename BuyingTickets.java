


public class BuyingShowTickets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tickets = {2,6,3,4,5};
		int p = 2;
		long time = waitingTime(tickets, p);
		System.out.println(time);

	}
	
	static long waitingTime(int[] tickets,int p){
		
		int count = 0;
		int total = 0;
		int negCount = 0;
		while(tickets[p] !=0){
			if(count == tickets.length){
				count =0;
			}
			tickets[count] = tickets[count]-1;
			if(tickets[count] <0){
				negCount = negCount+1;
			}
			count = count+1;
			total = total+1;
			
			
		}
		
		return total-negCount;
	}

}
