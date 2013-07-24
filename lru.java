import java.util.StringTokenizer;

public class lru {
	
	/**
	 * Least Recently Used page replacement algorithm
	 * 
	 * This function adds values to the frames and if it needs to swap, it maintains a count of how recent the frames were used,
	 * based on the age of the it swaps the frames. In this case, the oldest element is removed.
	 * 
	 * @param reference_string			Reference string, is used to put values into the frames
	 * @param frames					Integer containing the number of frames (user defined)
	 * @return							Returns faults, which is the integer containing the number of page faults
	 * 
	 * Local Variables:
	 * faults		int				Contains number of page faults
	 * array		int[]			Array of frames where values will be added
	 * age			int[]			Array with the ages of frames (oldest = next to be replaced)
	 * i			int				Loop iteration variable
	 * tok			StringTokenizer	Tokenizer that separates reference string element by element
	 * value		int				Element in the reference string to be added to array
	 * index		int				Index of oldest element, to be replaced 
	 */

	static int lru(String reference_string, int frames) {
		int faults = 0;
		int[] array = new int [frames];
		int[] age = new int [frames];

		for(int i = 0; i < frames; i++){			//fill frames with -1, because they are
			array[i] = -1;							//are first initialized with 0 and that alters		
													//the result
			age[i] = 0;								//and set age to 0, since it was just used		
		}

		StringTokenizer tok = new StringTokenizer(reference_string);

		while(tok.hasMoreTokens()){

			for (int i = 0; i < frames; i++){
				age[i]++;
			}

			int value = Integer.parseInt(tok.nextToken());

			if (!(isInFrames.isInFrames(value, frames, array))){
				faults++;
				int index = findMax.findMax(age);
				array[index] = value;
				age[index] = 0;
			}
			else{
				for (int i = 0; i < frames; i++){
					if (array[i] == value){
						age[i] = 0;
					}
				}
			}
		}
		return faults;
	}
	
}
