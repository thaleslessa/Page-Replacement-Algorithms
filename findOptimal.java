import java.util.StringTokenizer;


public class findOptimal {
	
	/**
	 * Find optimal index Function
	 * 
	 * This function reads in the reference string, the number of values that were read (values to skip), and the frames
	 * as well as the number of frames. It then analyzes the rest of the reference string and sees which of the current
	 * values in the frames will be used last. After this analysis, the function returns the index of such element.
	 * 
	 * @param rest						String that contains a copy of the reference string
	 * @param frames					Integer containing the number of frames (user defined)
	 * @param count						Integer count (basically a pointer) of how many values were already read in the reference string
	 * @param array						Integer array that contains the frames
	 * @return							Returns integer index of the optimal frame to be swapped
	 * 
	 * Local Variables:
	 * 
	 * nxt					int[]		Array that will eventually contain the value of how far is the value from being used again
	 * val					int			Value that comes when iterating through the reference string
	 * i					int			Loop iteration variable
	 * j					int			Loop iteration variable
	 * count2				int			Count of how far the current value is from being used
	 * idx					int			Index of optimal frame to be swapped
	 */
	
	static int findOptimal(String rest, int frames, int count, int[] array) {
		int[] nxt = new int [frames];
		int val;
		
		for (int i = 0; i<frames; i++){
			nxt[i] = 10000;
		}
		
		for (int i = 0; i<frames; i++){
			int count2 = 0;
			StringTokenizer tok = new StringTokenizer(rest);
			
			for (int j = 0; j<count;j++){
				tok.nextToken();
			}
			
			while(tok.hasMoreTokens()){
				val = Integer.parseInt(tok.nextToken());
				
				if(val == array[i]){
					nxt[i] = count2;
					break;
				}
				count2++;
			}
		}

		int idx = findMax.findMax(nxt);
		
		return idx;
	}
}
