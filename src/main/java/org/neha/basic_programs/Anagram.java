package org.neha.basic_programs;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "Bingo";
        String s2 = "Mango";

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<c1.length;i++){

            if(c1[i]!=c2[i]){
                System.out.println("Not Anagram");
                System.exit(0);
            }
        }

        if(c1.length!= c2.length){
            System.out.println("Not Anagram");
            System.exit(0);
        }
        System.out.println("yes");

    }
}
