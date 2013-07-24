import java.util.StringTokenizer;

public class fifo {

	/**
	 * First In First Out page replacement algorithm
	 * 
	 * This algorithm swaps pages based on the order in which they were added to the frames,
	 * it basically has a pointer that points to the next spot after an element was added,
	 * acting basically like a circular queue. 
	 * 
	 * @param reference_string			Reference string, is used to put values into the frames
	 * @param frames					Integer containing the number of frames (user defined)
	 * @return							Returns faults, which is the integer containing the number of page faults
	 * 
	 * Local Variables:
	 * faults		int				Contains number of page faults
	 * array		int[]			Array of frames where values will be added
	 * i			int				Loop iteration variable
	 * pointer		int				Pointer to index where value will be input in array
	 * tok			StringTokenizer	Tokenizer that separates reference string element by element
	 * value		int				Element in the reference string to be added to array
	 */
	
	public static int fifo(String reference_string, int frames) {
		int faults = 0;

		int[] array = new int [frames];

		for(int i = 0; i < frames; i++){			//fill frames with -1, because they are
			array[i] = -1;							//are first initialized with 0 and that alters
		}											//the result

		int pointer = 0;

		StringTokenizer tok = new StringTokenizer(reference_string);

		while(tok.hasMoreTokens()){
			int value = Integer.parseInt(tok.nextToken());

			if (!(isInFrames.isInFrames(value, frames, array))){
				faults++;				//increase count of faults
				array[pointer] = value;
				pointer = (pointer+1)%frames;		//move the pointer up in the queue
			}
		}
		return faults;
	}
	
}
