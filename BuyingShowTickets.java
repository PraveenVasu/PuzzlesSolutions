


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
		/*while(tickets[p] > 0 ){
			if(count == tickets.length){
				count =0;
			}
			if(tickets[count] != 0 ) {
				tickets[count]--;
				total = total+1;
			};
			if(tickets[p] == 0) {
				break;
			}
			count = count+1;
		}
		return total;*/
		
		if(tickets[p]==0) {
			return total;
		}
		
		for(int i =0;i<tickets.length;i++) {
			
			if(i<p) {
			if(tickets[i]<=tickets[p]) {
				total +=tickets[i];
			}
			else {
				total +=tickets[p];
				
			}
		}
			else {
				if(tickets[i] == tickets[p]) {
					total +=tickets[p];
				}
				else if(tickets[i] < tickets[p]) {
					total +=tickets[i];
				}
				else {
					total +=tickets[p]-1;
					
				}
			}
		}
		
		
		return total;
	}

}
