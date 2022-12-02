import org.example.TestMain;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TaxesTests {
    TestMain sut;

    @BeforeEach
    public void init() {
        System.out.println("Test started");
        sut = new TestMain();
    }

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("Test completed");
        sut = null;
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("Tests completed. All is good");
    }


    @ParameterizedTest
    @MethodSource("source")
    public void test_taxEarningsSixPerCents(int a, int b) {
        int result = sut.taxEarningsSixPerCents(a);
        assertEquals(result, b);
    }
    @Test
    public void test1_taxEarningsSixPerCents() {
        int a = 10_000, expected = 600;
        int result = sut.taxEarningsSixPerCents(a);
        assertNotNull(result);
    }
    @Test
    public void test_notEquals() {
        int a = 500, b = 100;
        boolean result = sut.notEquals(a, b);
        assertTrue(result);
    }


    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of(500, 30), Arguments.of(10_000, 600));
    }
}