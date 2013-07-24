import java.util.StringTokenizer;

public class opt {
	
	/**
	 * Optimal page replacement algorithm
	 * 
	 * This function reads in values from the reference string and uses the findOptimal function to check what is the
	 * best frame to be swapped. With the index of the element (return value from findOptimal) it then swaps and does it
	 * until the reference string is over.
	 * 
	 * @param reference_string			Reference string, is used to put values into the frames
	 * @param frames					Integer containing the number of frames (user defined)
	 * @return							Returns faults, which is the integer containing the number of page faults
	 * 
	 * Local Variables:
	 * faults		int				Contains number of page faults
	 * count		int				Counts number of values were already checked in the reference string
	 * array		int[]			Array of frames where values will be added
	 * i			int				Loop iteration variable
	 * tok			StringTokenizer	Tokenizer that separates reference string element by element
	 * value		int				Element in the reference string to be added to array
	 * rest			String			Copy of the reference string
	 * idx			int				Index of optimal frame to be swapped
	 */
	
	static int opt(String reference_string, int frames) {
		int faults = 0;
		int count = 0;
		int[] array = new int [frames];

		for(int i = 0; i < frames; i++){			//fill frames with -1, because they are
			array[i] = -1;							//are first initialized with 0 and that alters
		}											//the result

		StringTokenizer tok = new StringTokenizer(reference_string);

		while(tok.hasMoreTokens()){
			int value = Integer.parseInt(tok.nextToken());
			count++;

			if (!(isInFrames.isInFrames(value, frames, array))){
				faults++;

				String rest = reference_string + "";

				int idx = findOptimal.findOptimal(rest, frames, count, array);

				array[idx] = value;
			}
		}
		return faults;
	}
}
