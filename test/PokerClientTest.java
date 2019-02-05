import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {

    @Test
    void highestCardIsMine() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertDoesNotThrow(() ->{
            boolean otherCards = pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "s10");

            assertEquals(true, otherCards, "Test is failed");

        });
            System.out.println("Test is passed");
    }
    @Test
    void highestCardIsNotMine() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertDoesNotThrow(() ->{
            boolean otherCards = pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sk");

            assertEquals(false, otherCards, "Test is failed");

        });
        System.out.println("Test is passed");
    }
}