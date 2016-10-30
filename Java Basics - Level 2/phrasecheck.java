import java.util.Scanner;

     public class phrasecheck
     {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
        
            //Question 4 - Extend any question to check whether the user enters an empty string
        
            System.out.println ("-------------------------------------------------");
        
            System.out.println ("Enter any saying/quote of your own choice");
            String phrase = sc.nextLine();
        
            String data[];int k=0;
        
            data = phrase.split("");
            for(int i=0;i<data.length;i++){
                if(data[i].equals(" ")){
                    k++;
                }
            }
        
            if (phrase.isEmpty()){
               System.out.println ("Please enter a string with characters");
            } else { 
                k=k+1;
                System.out.println ("The number of words are " + k);
            }
            
            // ISSUES: Does not consider spaces only for an empty string
            
        }
    }
            