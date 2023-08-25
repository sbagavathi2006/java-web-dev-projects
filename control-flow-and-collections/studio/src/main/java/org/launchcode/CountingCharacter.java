package org.launchcode;
import java.util.Scanner;
import java.util.HashMap;

public class CountingCharacter {
    public static void main(String[] args) {
//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";

        System.out.println("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        //create new HashMap to put chars and counts in
        HashMap<Character, Integer> countChar = new HashMap<>();

        //make the sentence case-insensitive and turn the sentence into an array of chars
        char[] charactersInString = quote.toLowerCase().toCharArray();

        //iterate through each character c in the array of characters
        for (char c : charactersInString) {

            //Character.isLetter() checks if the character is a letter no matter the case
            if (Character.isLetter(c)){

                //checks if character is already in the HashMap as a key then count needs to be updated, returns true if the map contains the key and false if not
                if (countChar.containsKey(c)) {

                    //if char is present in the HashMap this will 'get' the value(count) and store it in the variable count
                    int count = countChar.get(c);

                    //updates the value of c by one in the HashMap if another char of that type was found
                    //and assigns the new value to the key c in the HashMap updating the count
                    countChar.put(c, count + 1);
                    //if only found once it is simply the char and 1 value
                } else {
                    countChar.put(c, 1);
                }
            }
        }
        //iterates through each key (char) in the set of keys of the HashMap. countChar.keySet() retrieves the set of all keys present in the map
        for (char c : countChar.keySet()){
            //for each c this retrieves its corresponding value (count) from countChar using get and assign it to count
            int count = countChar.get(c);
            System.out.println(c + ":" + count);
        }

    }
}

        //System.out.println(Arrays.toString(charactersInString));
        //System.out.println(charactersInString[0]);

//    for (int i=0; i<str.length(); i++){
//
//        char findStr = charactersInStringDup[i];
//        int total = 0;
//        for(int j=0; j<str.length(); j++) {
//            if (findStr == charactersInStringDup[j]) {
//                total += 1;
//            }
//        }
//        System.out.println(charactersInStringDup[i] + ": " + total);
//    }



