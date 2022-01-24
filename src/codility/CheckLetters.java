/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Amon.Sabul
 */
public class CheckLetters {

    public static boolean isStringOnlyAlphabet(String str) {
        return ((!str.equals(""))
                && (str != null)
                && (str.chars().allMatch(Character::isDigit)));
    }

    public static void main(String args[]) {

        // create an instance of LinkedHashMap
        LinkedHashMap<Integer, String> lhm;
        lhm = new LinkedHashMap<Integer, String>();

        // insert element in LinkedHashMap
        lhm.put(100, "Amit");

        // insert first null key
        lhm.put(null, "Ajay");
        lhm.put(101, "Vijay");
        lhm.put(102, "Rahul");
        lhm.put(103, "Rahul");
        // insert second null key
        // which replace first null key value
        lhm.put(null, "Anuj");
        // insert duplicate
        // which replace first 102 key value
     //   lhm.put(102, "Saurav");
        // iterate and print the key/value pairs
        lhm.entrySet().stream().forEach((m) -> {
            System.out.println(m.getKey() + " "
                    + m.getValue());
        });
    }
}
