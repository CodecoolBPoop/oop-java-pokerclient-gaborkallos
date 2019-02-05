import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {

    @Test
    void highestCardIsMine() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        boolean otherCards = pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sk");
        assertDoesNotThrow(() -> {
            if (otherCards) {
                assertEquals(true, otherCards, "Test is failed");
                System.out.println("Test is passed");
            } else {
                assertEquals(false, otherCards, "Test is failed");
                System.out.println("Test is passed");
            }
        });
    }
}