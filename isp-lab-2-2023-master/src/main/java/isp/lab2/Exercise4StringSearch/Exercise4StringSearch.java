package isp.lab2.Exercise4StringSearch;

import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        
        // separă șirul de caractere utilizând virgula drept separator
        
        String[] tokens = input.split(",");
        int index = 0;
         for (String token : tokens) {
            if(token.contains(substring)){
                index++;
            }
        }
        int dim = index;
        String[] vectorStrings = new String[dim];
        int i = 0;
        
        for (String token : tokens) {
            if(token.contains(substring)){
                //create vector of char
                vectorStrings[i] = token;
                i++;
            }
        }
        
            return vectorStrings;
        
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
