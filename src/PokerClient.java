import java.util.ArrayList;
import java.util.List;

public class PokerClient {

    private List<Card> myCards = new ArrayList<>();

    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        fillUpHand(p1, p2, p3, p4, p5, myCards);
    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        Card hc = new Card("s2");
        List<Card> othersCards = new ArrayList<>();
        List<Card> myCards = this.myCards;
        fillUpHand(p1, p2, p3, p4, p5, othersCards);


        for (Card myCard : myCards) {
            for (Card othersCard : othersCards) {
                Card mc = myCard;
                Card oc = othersCard;
                if (oc.getValue() >= mc.getValue() && oc.getValue() >= hc.getValue()) {
                        hc = oc;
                } else {
                    if (mc.getValue() > hc.getValue()) {
                        hc = mc;
                    }
                }
            }
        }
        return myCards.contains(hc);
    }

    private void fillUpHand(String p1, String p2, String p3, String p4, String p5, List<Card> othersCards) {
        othersCards.add(new Card(p1.toUpperCase()));
        othersCards.add(new Card(p2.toUpperCase()));
        othersCards.add(new Card(p3.toUpperCase()));
        othersCards.add(new Card(p4.toUpperCase()));
        othersCards.add(new Card(p5.toUpperCase()));
    }

}