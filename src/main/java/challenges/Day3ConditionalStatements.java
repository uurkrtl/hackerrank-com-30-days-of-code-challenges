package challenges;

public class Day3ConditionalStatements {
    public String oddEven(int number){
        String message="Not Weird";
        if ((number%2)==1 || (number>=6 && number<=20)) message = "Weird";
        return message;
    }
}
