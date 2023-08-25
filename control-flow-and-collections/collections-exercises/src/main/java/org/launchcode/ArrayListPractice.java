package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
           public static void main(String[] args) {
            String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
            ArrayList<String> wordList = new ArrayList<>(Arrays.asList(str.split(" ")));
            System.out.println(wordList);
//            wordList.add("apple");
//            wordList.add("banana");
//            wordList.add("cherry");
//            wordList.add("grape");
//            wordList.add("kiwi");
//            wordList.add("lemon");
//            wordList.add("palm");

            printWordsWithFiveLetters(wordList);
        }
        public static void printWordsWithFiveLetters(ArrayList<String> words) {
            Scanner inputNumber = new Scanner(System.in);
            System.out.println("Enter a number 1 to 7: ");
            int num = inputNumber.nextInt();
            for (String word : words) {
                if (word.length() == num) {
                    System.out.println(word);
                }
            }

    }
    }
       /* public static sumEven(ArrayList<Integer> arr){
        int total = 0;
        for (int integer : arr) {
        if(integer % 2 == 0){
            total += integer;
            }
        }
        return total;

    }*/

