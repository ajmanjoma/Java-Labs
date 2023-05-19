# Java Labs

Welcome to Java Labs, where we explore the power and versatility of the Java programming language. Java is a multi-platform, object-oriented, and network-centric language that serves as a robust platform for various applications. Whether you're building mobile apps, enterprise software, big data applications, or server-side technologies, Java has got you covered.

## Step 1: Install Java Development Kit (JDK)

To compile and run Java programs, you need to have the Java Development Kit (JDK) installed on your system. The JDK includes the Java compiler, which is essential for turning your Java code into executable programs. Here's how you can check if JDK is already installed:

```shell
$ javac --version
```

If JDK is not installed, you can install it on Ubuntu using the default package available:

```shell
$ sudo apt install default-jdk
```

## Step 2: Compile Java Programs in Linux

Once you have JDK installed, you can start compiling your Java programs. Assuming you have a Java program file named `file_name.java`, you can use various text editors like Nano, Vim, Vi, or the graphical text editor Gedit to write your Java code.

To compile the Java program, open the terminal and navigate to the directory where your Java file is located. Then execute the following command:

```shell
$ javac file_name.java
```

This will compile the Java source code into bytecode and generate the corresponding class file.

## Step 3: Run Java Programs

After successfully compiling your Java program, you can run it using the Java Virtual Machine (JVM). Unlike the compilation step, you only need to specify the class name without the ".class" extension. Use the `java` command to execute the Java program:

```shell
$ java class_name
```

Replace `class_name` with the name of your main class containing the `public static void main(String[] args)` method.

Now you're ready to explore the wonders of Java and unleash your creativity through programming!

Feel free to experiment, write more Java programs, and expand your knowledge in this versatile language. Enjoy your Java coding journey in our Java Labs!

Please note that the instructions provided here are specifically for Linux environments. The process may vary slightly on other operating systems.
