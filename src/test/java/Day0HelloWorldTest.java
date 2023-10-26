import challenges.Day0HelloWorld;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Day0HelloWorldTest {
    @Test
    void testMain(){
        Day0HelloWorld day0HelloWorld = new Day0HelloWorld();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        day0HelloWorld.print();

        String expectedOutput  = "Hello, World.\nWelcome to 30 Days of Code!";
        Assertions.assertEquals(expectedOutput,outContent.toString());
    }
}
