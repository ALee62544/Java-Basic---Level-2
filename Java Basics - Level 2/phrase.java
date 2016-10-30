import java.util.Scanner;

     public class phrase
     {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
        
            //Question 1 - Ask a user to say a phrase and print amount of words
        
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
        
            k=k+1;
            
            System.out.println ("The number of words are " + k);
        
        } 
    }       
            