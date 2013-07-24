JCC = javac
JFLAGS = -g

default: simpager.class

simpager.class: simpager.java
	$(JCC) $(JFLAGS) simpager.java

clean: 
	$(RM) *.class
