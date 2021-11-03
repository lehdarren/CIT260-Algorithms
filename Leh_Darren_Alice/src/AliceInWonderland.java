/**
 * Programmer:	Darren Leh
 * Project:		Leh_Darren_AliceProject
 * Class:		CIT260
 * Purpose:		This project reduces the amount of words till all requirements are satisfied.
 * 
 */

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
public class AliceInWonderland {
	public static void main(String[] args) throws IOException{
		//declares file
		File file = new File("ALICES ADVENTURES IN WONDERLAND.txt");
				
		//declares scanner
		Scanner importFile = new Scanner(file);
		
		//declares arraylist
		ArrayList<String> words = new ArrayList<String>();
		String currentLine;
		StringTokenizer st;
		
		while (importFile.hasNext())
		{
			currentLine = importFile.nextLine();
			st = new StringTokenizer(currentLine, " \r\n\t',.:[]*-#?()!;/@’�﻿"); //tokenizes the current line, then imports to arraylist
			
			while (st.hasMoreTokens()) {
				words.add(st.nextToken());
			}
		}
		
		words = toLowercase(words); //the to lowercase method changes all words to lowercase
		words = removeNulls(words); //this method is repetitive because every method requires "" to be removed
		
		words = lessThanFourChars(words); //this method remove all words with less than four characters
		words = removeNulls(words);
		
		words = wordsWithNoNums(words); //this method removes words that have numbers
		words = removeNulls(words);
		
		Collections.sort(words); //sorts the arraylist
		
		words = removeStopwords(words); //removes all stop words
		words = removeNulls(words);
		
		words = removeDuplicates(words); //removes all duplicates
		words = removeNulls(words);
		
		double avgLength = averageLength(words); //calculates the average length
		
		displayWords(words, avgLength); //displays all information, including avg length, amt of words, and all words in col/row format
		
	}
	
	public static ArrayList<String> toLowercase(ArrayList<String> array) {
		
		String replacement;
		
		for (int i = 0; i < (array.size() - 1); i++) 
		{
			replacement = array.get(i).toLowerCase();
			array.set(i, replacement); //sets the replacement in the place of i
		}
		
		return array;
	}
	
	public static ArrayList<String> lessThanFourChars(ArrayList<String> array) {
		String[] words = array.toArray(new String[0]);
		
		for (int i = 0; i < (array.size() - 1); i++) 
		{
			if (words[i].length() < 4)
			{
				words[i] = ""; //changes any word less than 4 chars to null value
			}
		}
		
		array.clear(); //clears current arraylist, then adds the new array to the arraylist
	    array.addAll(Arrays.asList(words));
		
		return array;
	}
	
	public static ArrayList<String> wordsWithNoNums(ArrayList<String> array) {
		
		String[] words = array.toArray(new String[0]);
		String pattern = "[a-zA-Z]+";
		
		for (int i = 0; i < (array.size() - 1); i++) 
		{
			if (words[i].matches(pattern))
			{
				//blank space to represent nothing happening to the array
			}
			else
			{
				words[i] = ""; //if the current word doesn't match the pattern, changes to null value
			}
		}
		
		array.clear();
	    array.addAll(Arrays.asList(words));
		
		return array;
	}
	
	public static ArrayList<String> removeStopwords(ArrayList<String> array) {
		String[] stopwords = { "i", "me", "my", "myself", "we", "our", "ours", "ourselves", 
							   "you", "your", "yours", "yourself","yourselves", "he", "him",
							   "his", "himself", "she", "her", "hers", "herself", "it", "its", 
							   "itself", "they", "them", "their", "theirs", "themselves", "what", 
							   "which", "who", "whom", "this", "that", "these", "those", "am", 
							   "is", "are", "was", "were", "be", "been", "being", "have", "has", 
							   "had", "having", "do", "does", "did", "doing", "would", "should", 
							   "could", "ought", "i'm", "you're", "he's", "she's", "it's", "we're", 
							   "they're", "i've", "you've", "we've", "they've", "i'd", "you'd", 
							   "he'd", "she'd", "we'd", "they'd", "i'll", "you'll", "he'll", "she'll", 
							   "we'll", "they'll", "isn't", "aren't", "wasn't", "weren't", "hasn't", 
							   "haven't", "hadn't", "doesn't", "don't", "didn't", "won't", "wouldn't", 
							   "shan't", "shouldn't", "can't", "cannot", "couldn't", "mustn't", "let's", 
							   "that's", "who's", "what's", "here's", "there's", "when's", "where's", 
							   "why's", "how's", "a", "an", "the", "and", "but", "if", "or", "because", 
							   "as", "until", "while", "of", "at", "by", "for", "with", "about", "against", 
							   "between", "into", "through", "during", "before", "after", "above", "below", 
							   "to", "from", "up", "down", "in", "out", "on", "off", "over", "under", "again", 
							   "further", "then", "once", "here", "there", "when", "where", "why", "how", "all", 
							   "any", "both", "each", "few", "more", "most", "other", "some", "such", "no", "nor", 
							   "not", "only", "own", "same", "so", "than", "too", "very"};
		String[] words = array.toArray(new String[0]);
		
		for (int i = 0; i < (array.size() - 1); i++) 
		{
			for (int j = 0; j < (stopwords.length - 1); j++)
			{
				if (words[i].equalsIgnoreCase(stopwords[j])) //if the current word equals any of the stopwords
				{
					words[i] = ""; //changes value to null
				}
			}
		}
		
		array.clear();
	    array.addAll(Arrays.asList(words));
		
		
		return array;
	}
	
	public static ArrayList<String> removeDuplicates(ArrayList<String> array) {
		String[] words = array.toArray(new String[0]);
		String currentWord;
		
		for (int i = 0; i < (array.size() - 1); i++) 
		{
			currentWord = words[i];
			
			for (int j = (i + 1); j < (array.size() - 1); j++)
			{
				if (words[j].equals(currentWord)) //if they are exact duplicates, changes word to null
				{
					words[j] = "";
				}
			}
		}
		
		
		array.clear();
	    array.addAll(Arrays.asList(words));
	    
		return array;
	}
	
	public static double averageLength(ArrayList<String> array) {
		String[] words = array.toArray(new String[0]);
		String currentWord;
		double avgLength = 0;
		
		for (int i = 0; i < (array.size() - 1); i++) 
		{
			currentWord = words[i]; //puts current word into currentWord variable
			
			avgLength += currentWord.length(); //adds to the counter
		}
		
		avgLength = avgLength / array.size(); //avgLength is found by dividing itself by the size of the array
		
		return avgLength;
	}
	
	public static ArrayList<String> removeNulls(ArrayList<String> array) {
		
		String currentWord;
	    
	    for (int j = 0; j < (array.size() - 1); j++)
	    {
	    	currentWord = array.get(j);
	    	if (currentWord == "") //if the word is null
	    	{
	    		array.remove(j); //  it is removed
	    		j = 0;			//   then the for loop is reset to make sure ALL instances of null are removed
	    	}
	    }
		
		return array;
	}
	
	public static void displayWords(ArrayList<String> array, double avgLength) {
		DecimalFormat dform = new DecimalFormat("#.#");
		
		System.out.println("There are " + (array.size() + 1) + " words."); //displays amount of words
		System.out.println("The average length of words is: " + dform.format(avgLength)); //displays avgLength which is passed through the method parameters
		
		int numPages = (array.size() / 80) + 1; //finds number of pages
		String[][][] tempArray = new String[89][4][numPages]; //creates hard set tempArray that is 3D
		
		/*
		for (int page = 0; page <= numPages; page++)
		{
			System.out.println("Page " + (page + 1));
			System.out.println("--------------------------------------------------");
			
			
		}
		*/
		
		int counter = 0;
		
		try {
			for (int page = 0; page <= numPages; page++)
			{
				if (page == 4)
				{
					for (int cols = 0; cols < 4; cols++)
					{
						for (int rows = 0; rows < 5; rows++) 
						{
							tempArray[rows][cols][page] = array.get(counter); //inserts the data
							counter++;
						}
						counter++;
					}
					counter++;
				}
				else
				{
					for (int cols = 0; cols < 4; cols++)
					{
						for (int rows = 0; rows < 20; rows++) 
						{
							tempArray[rows][cols][page] = array.get(counter); //inserts the data
							counter++;
						}
						counter++;
					}
					counter++;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			
		}
		
		counter = 0;
		
		System.out.println("                 Page 1                       ");
		System.out.println("-----------------------------------------------");
		
		for (int page = 0; page <= numPages; page++)
		{
			if (page >= 4)
			{
				try {
					for (int rows = 0; rows < 5; rows++)
					{
						for (int cols = 0; cols < 3; cols++) 
						{
							System.out.print(tempArray[rows][cols][page] + "\t"); //displays the final page
							counter++;
						}
						counter++;

						System.out.println("");
					}
				} catch (IndexOutOfBoundsException e) {
					// TODO Auto-generated catch block
					System.out.println("Reached end of array");
				}
				counter++;
			}
			else
			{
				for (int rows = 0; rows < 20; rows++)
				{
					for (int cols = 0; cols < 4; cols++) 
					{
						System.out.print(tempArray[rows][cols][page] + "\t"); //displays all other pages
						counter++;
					}
					counter++;

					System.out.println("");
				}
				counter++;
				

				System.out.println("-----------------------------------------------");
				System.out.println("                 Page " + (page + 2) + "                       ");
				System.out.println("-----------------------------------------------");
				
			}
		}
		
		
	}

}
