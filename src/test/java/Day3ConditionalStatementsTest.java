import challenges.Day3ConditionalStatements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day3ConditionalStatementsTest {
    @Test
    void givenOddNumberOrRangeOf6To20_whenoOddEven_thenReturnWeird(){
        Day3ConditionalStatements day3ConditionalStatements = new Day3ConditionalStatements();
        String expected = "Weird";
        String actual = day3ConditionalStatements.oddEven(3);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void givenEvenNumberOrRangeOf2To5ORangeOfOrGreaterThan_whenoOddEven_thenReturnNotWeird(){
        Day3ConditionalStatements day3ConditionalStatements = new Day3ConditionalStatements();
        String expected = "Not Weird";
        String actual = day3ConditionalStatements.oddEven(24);
        Assertions.assertEquals(expected,actual);
    }
}