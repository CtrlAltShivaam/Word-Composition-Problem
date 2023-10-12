/* Made by Shivam Sharma (BWU/BTS/20/122) */
/*
 * Problem Statement
 * Write a program that:
 * 1. Reads provided files (Input_01.txt and Input_02.txt) containing alphabetically sorted words list (one word per line, no spaces, all lower case)
 * 2. Identifies & display below given data in logs/console/output file 
 *    longest compounded word
 *    second longest compounded word
 *    time taken to process the input file
 * 
 *  Note: A compounded word is one that can be constructed by combining (concatenating) shorter words also found in the same file
 */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        long startTime = System.currentTimeMillis();//For 3rd Output, we note the start time

        CompoundWordFinder finder = new CompoundWordFinder();//to create the object of CoumpoundwordFinder method
        
        List<String> words = new ArrayList<>();
        System.out.println("Enter the Filename of Target File:");
        String inputFile= sc.nextLine();
        sc.close();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String inputLine;
            while((inputLine = br.readLine())!=null){
                String word = inputLine.trim();
                finder.insertWord(word);
                words.add(word);
            }
        }catch (IOException e) {
            e.printStackTrace();
            return;
        }

        words.sort(Comparator.comparing(String::length).reversed());//To store the Words in descending order with respect of their length

        String longestCompoundWord = null;
        String secondLongestCompoundWord = null;

        //Longest and 2nd Longest compound word is stored
        for(String word: words){
            if (finder.isCompoundWord(word)) {
                if (longestCompoundWord == null) longestCompoundWord = word;
                else if (secondLongestCompoundWord == null) {
                    secondLongestCompoundWord = word;
                    break;
                }
            }
        }
        long endTime = System.currentTimeMillis();//End time of process is noted

        long elapsedTime = endTime - startTime;//We get the elpased time by subtracting end time by Start Time
        
        System.out.println("1. Longest Compound Word: " + longestCompoundWord);
        System.out.println("2. Second Longest Compound Word: " + secondLongestCompoundWord);
        System.out.println("3. Time taken to process the input file: " + elapsedTime + " milliseconds");
    }
}

class CompoundWordFinder{
    private Set<String> dictionary;

    public CompoundWordFinder(){
        dictionary = new HashSet<>();//So that whenever the function is called dictionary is created and initialised.
    }

    public void insertWord(String word){
        dictionary.add(word);//To add unique values to our dictionary
    }

    //To check if the word is a Compound Word or not using recursion.
    public boolean isCompoundWord(String word){
        for(int i=1;i<word.length();i++){
            String prefix = word.substring(0,i);
            String suffix = word.substring(i);

            if(dictionary.contains(prefix) && dictionary.contains(suffix) || isCompoundWord(suffix)) return true;
        }
        return false; 
    }
}
