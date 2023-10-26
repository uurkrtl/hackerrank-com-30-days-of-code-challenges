import challenges.Day2Operators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day2OperatorsTest {
    @Test
    void TestmealsTotalCost(){
        Day2Operators operators = new Day2Operators();
        int totalCost = operators.mealsTotalCost(12.00,20,8);
        Assertions.assertEquals(15,totalCost);
    }
}
