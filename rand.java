import java.util.Random;
import java.util.StringTokenizer;

public class rand {
	
	/**
	 * Random page replacement algorithm
	 * 
	 * This function reads the reference string and adds values to the queue (frames). After it fills the frames,
	 * it checks if the value is in the frames. If it's not, the value coming in is swapped in a random frame
	 * inside the queue.
	 * 
	 * @param reference_string			Reference string, is used to put values into the frames
	 * @param frames					Integer containing the number of frames (user defined)
	 * @return							Returns faults, which is the integer containing the number of page faults
	 * 
	 * Local Variables:
	 * 
	 * faults		int				Contains number of page faults
	 * rdm			Random			Randomizes a number, so index of array is completely random
	 * array		int[]			Array of frames where values will be added
	 * i			int				Loop iteration variable
	 * pointer		int				Pointer to index where value will be input in array
	 * tok			StringTokenizer	Tokenizer that separates reference string element by element
	 * value		int				Element in the reference string to be added to array
	 */
	
	static int rand(String reference_string, int frames) {
		int faults = 0;

		Random rdm = new Random();

		int[] array = new int [frames];

		for(int i = 0; i < frames; i++){			//fill frames with -1, because they are
			array[i] = -1;							//are first initialized with 0 and that alters
		}											//the result

		int pointer = rdm.nextInt(frames);

		StringTokenizer tok = new StringTokenizer(reference_string);

		while(tok.hasMoreTokens()){
			int value = Integer.parseInt(tok.nextToken());

			if (!(isInFrames.isInFrames(value, frames, array))){
				faults++;
				array[pointer] = value;
				pointer = rdm.nextInt(frames);
			}
		}
		return faults;
	}
}
