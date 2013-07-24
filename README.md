#Simulation of Page Replacement Strategies

##Contents of Directory
####Makefile:
File that compiles the .java source codes and creates the simpager executable
####README:
File specifying contents of directory and solutions to problems.
####simpager.java:
Main program that reads reference string, number of frames and replacement algorithms and displays number of page faults per replacement algorithm.
####fifo.java:
.java file that contains the first in first out algorithm
####findMax.java:
.java file that contains the findMax function to find index of maximum number in an array
####findOptimal.java:
.java file that contains the findOptimal function that finds index of optimal frame to be swapped
####isInFrames.java:
.java file with the function that checks if value is in frames or not
####lru.java:
.java file that contains the least recently used algorithm
####opt.java:
.java file that contains the optimal algorithm
####rand.java:
.java file that contains the random algorithm

##Solution to problems:
Program reads from command line, as soon as reference string and # of frames is input, it echoes them out. Because it uses a scanner and readLine(), as soon as the algorithm command is sent on the command line, the program executes it and displays the result automatically. To exit the program, the user needs to input either a ctrl-d or press enter to send an empty string. Not too much problem, program probably took around 6-7 hours to write. Since the array is first initialized with -1 in its frames, it is not advised to have a -1 in the reference string, since it might change the results.
