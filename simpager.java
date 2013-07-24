import java.util.*;

public class simpager {

	/**
	 * Main Function
	 * 
	 * This function reads a reference string from command line, followed by the number of frames in the next line and then reads commands
	 * that are really the page replacement algorithms to be applied.
	 * 
	 * The algorithms are:
	 * 
	 * FIFO - First in first out replacement algorithm
	 * LRU - Least recently used replacement algorithm
	 * OPT - Optimal replacement algorithm
	 * RAND - Random replacement algorithm
	 * 
	 * @param args						String array that contains command line arguments - is not used
	 * 
	 * Local variables:
	 * 
	 * reference_string		String		Reference string, read from the command line
	 * line					String		Refers to each line incoming from the command line
	 * frames				int			Number of frames, defined by user, comes from command line
	 * faults				int			Number of page faults
	 * scan					Scanner		Scanner used to read the arguments of the program
	 */

	public static void main(String[] args) {

		String reference_string, line;
		int frames, faults;

		Scanner scan = new Scanner(System.in);
		reference_string = scan.nextLine();
		frames = Integer.parseInt(scan.nextLine());

		System.out.println("Page Reference String:");
		System.out.println(reference_string);
		System.out.println("Number of Frames: " + frames);

		while (scan.hasNextLine()){
			
			faults = 0;
			line = scan.nextLine();
			
			if(line == null || line.length() == 0){
				break;
			}
			line = line.toUpperCase();
			if (line.equals("FIFO")){
				faults = fifo.fifo(reference_string, frames);
				System.out.println(line + ": " + faults);
			}
			else if(line.equals("LRU")){
				faults = lru.lru(reference_string, frames);
				System.out.println(line + ": " + faults);
			}
			else if(line.equals("OPT")){
				faults = opt.opt(reference_string, frames);
				System.out.println(line + ": " + faults);
			}
			else if(line.equals("RAND")){
				faults = rand.rand(reference_string, frames);
				System.out.println(line + ": " + faults);
			}
			else{
				System.out.println("Invalid command " + line);
			}
		}
	}
}
