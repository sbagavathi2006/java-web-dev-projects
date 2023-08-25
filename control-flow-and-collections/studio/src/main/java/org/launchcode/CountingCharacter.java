package org.launchcode;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacter {
public static void  main(String[] args) {
    String str = "apple r";
    char[] charactersInString = str.toCharArray();
    //char[] charInStringNew;
    HashMap<Character, Integer> countChar  = new HashMap<>();
   for(char i : charactersInString ){
       if(countChar.containsKey(i)){
           int total = countChar.get(i);
           countChar.put(i,total+1);
       } else {
           countChar.put(i,1);
       }
   }
   for (char countKey: countChar.keySet()){
       int count = countChar.get(countKey);
       System.out.println(countKey + ": "+ count);
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



