package challenges;

import java.util.Scanner;

public class Day6LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        char[] charachters=null;
        String word="";
        String evenWord="";
        String oddWord="";
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.nextLine();
        while (testCase>0){
            word = scanner.nextLine();
            charachters = null;
            charachters = word.toCharArray();
            testCase--;
            for (int j=0; j<charachters.length;j++){
                if(j%2==0){
                    evenWord+=charachters[j];
                }else{
                    oddWord+=charachters[j];
                }
            }
            System.out.println(evenWord + " " + oddWord);
            evenWord = "";
            oddWord = "";
        }
    }
}
