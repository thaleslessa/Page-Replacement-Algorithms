public class isInFrames {
	
	/**
	 * Check if value is in frames Function
	 * 
	 * This function reads in a value and the array with the frames and checks if the value is in the frames or not
	 * 
	 * @param value						Integer value that is being compared to see if is already in the frames
	 * @param frames					Integer containing the number of frames (user defined)
	 * @param array						Integer array that contains the frames
	 * @return							Returns true/false if the value is already in the frames or not
	 * 
	 * Local Variables:
	 * 
	 * i					int			Loop iteration variable
	 */

	static boolean isInFrames(int value, int frames, int[] array) {

		for (int i = 0; i < frames; i++){
			if (array[i] == value){
				return true;
			}
		}
		return false;
	}
	
}
