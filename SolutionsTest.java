import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SolutionsTest {

    @Test
    public void testEpicGame() {
        String input = "3 5 9\n";
        String expectedOutput = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Solutions.epicGame();
        
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testTram() {
        String input = "3\n0 5\n2 2\n4 0\n";
        String expectedOutput = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Solutions.tram();
        
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testAmusingJoke() {
        String input = "hello\nworld\nhelloworld\n";
        String expectedOutput = "YES\n";
        
        // Redirect System.in and System.out
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        // Run the solution
        Solutions.amusingJoke();

        // Assert and print diagnostic information
        assertEquals(expectedOutput, out.toString(), "Expected output differs from actual output. Check the input processing.");
    }
}
