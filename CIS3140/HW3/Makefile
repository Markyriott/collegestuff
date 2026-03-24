all: HelloWorld.jar

HelloWorld.jar: HelloWorld.class HW3.class
	jar cfe HelloWorld.jar HW3 HW3.class HelloWorld.class

HW3.class HelloWorld.class:
	javac HW3.java HelloWorld.java

run:
	java -jar HelloWorld.jar

clean: 
	rm -f HW3.class HelloWorld.class HelloWorld.jar
