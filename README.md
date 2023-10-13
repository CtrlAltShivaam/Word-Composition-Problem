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

## Design Decisions + Approach Taken

The Compound Word Finder program was designed with the primary goal of efficiently identifying the longest and second-longest compounded words in a list of alphabetically sorted words. Key design decisions include:
1. Using a HashSet for fast word lookup, employing a recursive algorithm to detect compounded words, 
2. Sorting words by length for improved efficiency, providing user-friendly console output, and 
3. Ensuring ease of use by prompting the user to enter the target input file's filename. 

These design choices aim to strike a balance between performance, accessibility, and thorough analysis of compounded words, making the program a practical tool for various applications.

## Algortithm Used

Steps:

1. Create a CompoundWordFinder object to manage the dictionary of words.

2. Read the user-specified input file from the provided data, storing words in a list and inserting them into the dictionary.

3. Sort the list of words by length in descending order.

4. Initialize variables for the longest and second longest compound words (both initially null).

5. Iterate through the sorted list of words:

6. Check if a word is a compound word using the isCompoundWord method.
    * If it's a compound word:
    * If the longest compound word is null, set it to the current word.
    * If the second longest compound word is null, set it to the current word and exit the loop.
    * Record the end time of the process.

7. Calculate the elapsed time (end time - start time).

8. Print the results to the console:
    * The longest compound word:
    * The second longest compound word:
    * The time taken to process the input file (in milliseconds):



