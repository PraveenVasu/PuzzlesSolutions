

import java.util.*;
public class BalancedOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[] expr = {"<<>","<>>>>"};
	    int[] maxReplc = {1,2};
	 int[] result = 	balancedOrNot(expr,maxReplc);
	 System.out.println(Arrays.toString(result));
	}	
	static int[] balancedOrNot(String[] expressions,int[] maxReplacements){
		int[] result = new int[maxReplacements.length];
	    for(int i=0;i<expressions.length;i++){
	        int count = 0;
	        int totalCount = 0;
	        Stack<Character> s = new Stack<Character>();
	        String ex = expressions[i];
	        for(int j=0;j<ex.length();j++){
	            
	        	if(ex.charAt(j)=='<'){
	        		s.push('>');
	        	}else{
	        		if(s.size()>0){
	        			if(s.pop() != '>'){
	        				count = count +1;
	        			}
	        		}
	        		else{
	        			count = count+1;
	        		}
	        	}        	            
	        }
	        totalCount = s.size()+count;
	        if(totalCount <= maxReplacements[i]){
	        	 result[i] = 1;
	        }else{
	        result[i] = 0;
	        }
	        
	    }
	    return result;
	}

}
