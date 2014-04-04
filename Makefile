JAVAC=javac
JAVA=java

all:
	$(JAVAC) -target 1.1 -source 1.2 javaversions/Java11.java
	$(JAVAC) -target 1.2 -source 1.2 javaversions/Java12.java
	$(JAVAC) -target 1.3 -source 1.3 javaversions/Java13.java
	$(JAVAC) -target 1.4 -source 1.4 javaversions/Java14.java
	$(JAVAC) -target 1.5 -source 1.5 javaversions/Java15.java
	$(JAVAC) -target 1.6 -source 1.6 javaversions/Java16.java
	$(JAVAC) Main.java
	$(JAVA) Main
