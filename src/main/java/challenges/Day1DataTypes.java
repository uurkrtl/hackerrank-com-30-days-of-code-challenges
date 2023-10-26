package challenges;

public class Day1DataTypes {
    void print(int input1, double input2, String input3){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        /* Declare second integer, double, and String variables. */
        int i2 = 0;
        double d2 = 0.0;
        String s2 = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2=input1;
        d2=input2;
        s2=input3;
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d2);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+s2);
    }
}