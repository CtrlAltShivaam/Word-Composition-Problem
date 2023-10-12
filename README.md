# Word Composition Problem

This Java program, developed by Shivam Sharma (BWU/BTS/20/122), is designed to read two provided text files, "Input_01.txt" and "Input_02.txt," each containing alphabetically sorted lists of words, with one word per line and in all lowercase. The program identifies and displays the following information:

1. The longest compounded word from the input files.
2. The second longest compounded word from the input files.
3. The time taken to process the input file.

## Program Overview

The main program, `Main.java`, reads user input to specify the target input file containing the word list. It uses a `CompoundWordFinder` class to process the data and determine the longest and second longest compounded words.

The core logic for identifying compounded words is based on a recursive approach. It checks if a word can be constructed by concatenating shorter words also found in the same file.

## Execution Steps

To execute the program, follow these steps:

1. Ensure you have Java installed on your system.

2. Compile the program using the following command:
```
javac Main.java
```
3. Run the program:
```
java Main
```

4. Enter the filename of the target input file when prompted.

5. The program will display the longest compounded word, the second longest compounded word, and the time taken to process the input file.

## Design Decisions

The Compound Word Finder program was designed with the primary goal of efficiently identifying the longest and second-longest compounded words in a list of alphabetically sorted words. Key design decisions include using a HashSet for fast word lookup, employing a recursive algorithm to detect compounded words, sorting words by length for improved efficiency, providing user-friendly console output, and ensuring ease of use by prompting the user to enter the target input file's filename. These design choices aim to strike a balance between performance, accessibility, and thorough analysis of compounded words, making the program a practical tool for various applications.



