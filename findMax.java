public class findMax {
	
	/**
	 * Find maximum value in array Function
	 * 
	 * This function basically reads an array and returns the index of the biggest number in the array
	 * 
	 * @param arr						Integer array containing the values in which the maximum one has to be returned
	 * @return							Returns idx, which is the index of the where the biggest value is in the array
	 * 
	 * Local Variables:
	 * 
	 * idx					int			Index of maximum value in array
	 * maxValue				int			Maximum value in array
	 * i					int			Loop iteration variable
	 */
	
	static int findMax(int[] arr) {
		int idx = 0, maxValue = 0;

		for (int i = 0; i < arr.length; i++){
			if(arr[i] > maxValue){
				maxValue = arr[i];
				idx = i;
			}
		}
		return idx;
	}
}
