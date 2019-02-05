import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void colorIsValid() {
        Card testCard = new Card("c8");
        assertDoesNotThrow(() -> {
            assertEquals(true, testCard.validateCardColor(), "Test is failed");
            System.out.println("Test 1 is passed, colorValidation is working");
        });
    }

    @Test
    void getValueOfCard() {
        Card testCard = new Card("c8");
        assertDoesNotThrow(() -> {
            assertEquals(8, testCard.getValue(), "Test is failed");
            System.out.println("Test 2 is passed, getValue is working");
        });
    }

    @Test
    void colorValidationTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Card("w3");
            System.out.println("Test 3 : Failure");
        });
        System.out.println("Test 3 is passed, color validation is working");
    }

    @Test
    void cardValueIsLetter() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Card("cz");
            System.out.println("Test 4 : Failure");
        });
        System.out.println("Test 4 is passed, value validation is working");
    }

    @Test
    void cardValueIsHigh() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Card("c15");
            System.out.println("Test 5: Failure");
        });
        System.out.println("Test 5 is passed, value validation is working");
    }
}
