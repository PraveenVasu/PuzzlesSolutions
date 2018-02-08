


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
		int totalWait = 0;		
		if(tickets[p]==0) {
			return totalWait;
		}
		for(int i =0;i<tickets.length;i++) {
			
			if(i<p) {
				if(tickets[i]<=tickets[p]) {
					totalWait =totalWait + tickets[i];
				}
			else {
				totalWait =totalWait+tickets[p];			
				}
		    }
			else if(i == p){
				totalWait = totalWait + tickets[p];
			}
			else {
				if(tickets[i] >= tickets[p]) {
					totalWait =totalWait+tickets[p]-1;
				}
				else{
					totalWait =totalWait+tickets[i];
				}
				
			}
		}	
		return totalWait;
	}

}
