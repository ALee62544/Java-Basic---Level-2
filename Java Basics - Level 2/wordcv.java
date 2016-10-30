import java.util.Scanner;

     public class wordcv
     {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
               //Question 3 - Ask the user to enter a word and print out the vowels and constants
        
            System.out.println ("-------------------------------------------------");
        
            System.out.println ("Enter a word to find its constant and vowels");
            String wordcv = sc.nextLine();
        
            char a = 'a';
            char e = 'e';
            char i = 'i';
            char o = 'o';
            char u = 'u';
        
            char A = 'A';
            char E = 'E';
            char I = 'I';
            char O = 'O';
            char U = 'U';
            
            int vowels = 0;
            int consonants = 0;
        
            for (int x = 0; x < wordcv.length(); x++){
                if (wordcv.charAt(x) == a || wordcv.charAt(x) == e || wordcv.charAt(x) == i ||
                    wordcv.charAt(x) == o || wordcv.charAt(x) == u || wordcv.charAt(x) == A || 
                    wordcv.charAt(x) == E || wordcv.charAt(x) == I || wordcv.charAt(x) == O ||
                    wordcv.charAt(x) == U) {
                     vowels = vowels + 1;
                }
                else {
                     consonants = consonants + 1;
                }   
            }
            System.out.println("Vowel count = " + vowels);
            System.out.println("Consonants count = " + consonants);
            
    }
}
