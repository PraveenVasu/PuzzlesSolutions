import java.util.Arrays;


public class Psychometric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {4,8,7};
		int[] lowerLimits = {2,4};
		int[] upperLimits = {8,4};
          int[] jobOffers = jobOffers(scores,lowerLimits,upperLimits);
          System.out.println(Arrays.toString(jobOffers));
	}
  static int[] jobOffers(int[] scores,int[] lowerLimits,int[] upperLimits){
	  int[] result = new int[lowerLimits.length];
	  		
	        for(int i=0;i<lowerLimits.length;i++){
	        	int count =0;
	        	for(int j=0;j<scores.length;j++){
	        		
	        		if(scores[j] >=lowerLimits[i] && scores[j]<=upperLimits[i]){
	        			
	        			count = count+1;
	        		}
	        		if(j==scores.length-1){
	        			result[i] = count;
	        		}
	        	}
	        	
	        	
	        }
	  
	  return result;
  }
}
