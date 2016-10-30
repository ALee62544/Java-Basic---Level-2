import java.util.Scanner;

     public class wordreversed
     {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            //Question 2 - Using a loop, print out the characters in reverse from a string
        
            System.out.println ("-------------------------------------------------");
        
            System.out.println ("Enter a word of your choice to be reversed");
            String word = sc.nextLine();
        
            System.out.println ("Your original word is " + word);
            System.out.println ("Your word reversed is " + new StringBuilder(word).reverse().toString());
        
            //Loop method
        
            System.out.println ("-------------------------------------------------");
        
            System.out.println ("Enter a word of your choice to be reversed (loop)");
            String word1 = sc.nextLine();
        
            for (int i = 0; i < word1.length(); i++) {
                char word1reversed = (word1.charAt(word1.length() - i - 1));
                System.out.println(word1reversed);
            }
        }
    }
    