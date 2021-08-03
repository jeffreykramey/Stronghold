package com.company;

import java.util.Arrays;

public class Main {

    public static void incrementLetters(char[] arrayA, int startIndex){
        //subtract 1 from startIndex to account for zero-indexing
        for(int i = startIndex - 1; i < arrayA.length; i++){
            //takes care of 'Z' cases and facilitates the wrap-around effect ('Z' -> 'A' instead of 'Z' -> '[')
            int charAsInt = arrayA[i] == 90 ? 65 : (arrayA[i] + 1);
            arrayA[i] = (char) charAsInt;
        }
    }

    public static void alphabetBarrel(char[] A, int[] B){
        for(int i : B) {
            incrementLetters(A, i);
        }
    }

    public static void main(String[] args) {
        char[] a1 = new char[] {'A', 'C', 'Z'};
        int[] b1 = new int[] {1, 3, 2};

        char[] a2 = new char[] {'A', 'A', 'A'};
        int[] b2 = new int[] {1, 1, 1, 1, 1, 3, 3};


        alphabetBarrel(a1,b1);
        alphabetBarrel(a2,b2);
        System.out.println(Arrays.equals(a1, new char[]{'B', 'E', 'C'}));
        System.out.println(Arrays.equals(a2, new char[]{'F', 'F', 'H'}));
    }
}
