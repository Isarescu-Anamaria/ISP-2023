package isp.lab2.Exercise6WordGuess;
import java.util.Random;
import java.util.Scanner;

public class Exercise6WordGuess {

    /**
     * This method will return the number of occurrences of a character in a word
     * @param c
     * @param word
     * @return
     */
    
    public static int countOccurence(char c, char[] word) {
        
        Scanner scanner = new Scanner(System.in);
        int trynumber = 0;
        int occurencenumber = 0;
        int dim = word.length;
        char[] chguessed = new char[dim];
        int dimch = 0;
        int comparech;
        for(int i=0; i < dim; i++){
              
         do{
            System.out.print("Input a character: ");
            char readch = scanner.next().charAt(i);
            System.out.println("You have entered: "+readch);  
            if(readch == c){
                occurencenumber++;
            }
            trynumber++;
            comparech = Character.compare(readch,word[i]);
            if (comparech == 0){
                System.out.print("The character is in the word at" +i);
                chguessed[dimch] = readch;
                System.out.print("Guessed characters: ");
                for(int j = 0; j < dimch; j++){
                    System.out.print(chguessed[j] + " ");
                }
                dimch++;
                
            }
            else{
                System.out.print("The character is not in the word");
            }
         }while(comparech != 0);
              
        }
     System.out.print("The word is:" +word);
     System.out.print("The number of tries is:" +trynumber);
     return occurencenumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char[] word = new char[random.nextInt()];
        for(int i=0; i < word.length; i++){
        //65->122 is the range of all alphabetic characters in US ASCII
        int ch=random.nextInt(65,122);
     
        //exclude characters like [ ( and so on 
        if(ch>=91 && ch<=96){
            continue;
        }
     
        word[i]=(char)(ch);
        
        }
        System.out.print("Input a character: ");
        char c = scanner.next().charAt(0);
        int n = countOccurence(c,word);
        
    }

}
