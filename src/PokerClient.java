import java.util.ArrayList;
import java.util.List;

public class PokerClient {

    public List<Card> myCards = new ArrayList<>();

    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        myCards.add(new Card(p1.toUpperCase()));
        myCards.add(new Card(p2.toUpperCase()));
        myCards.add(new Card(p3.toUpperCase()));
        myCards.add(new Card(p4.toUpperCase()));
        myCards.add(new Card(p5.toUpperCase()));
    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        Card hc = new Card("s2");
        List<Card> othersCard = new ArrayList<>();
        List<Card> myCards = this.myCards;
        othersCard.add(new Card(p1.toUpperCase()));
        othersCard.add(new Card(p2.toUpperCase()));
        othersCard.add(new Card(p3.toUpperCase()));
        othersCard.add(new Card(p4.toUpperCase()));
        othersCard.add(new Card(p5.toUpperCase()));


        for (int i = 0; i < othersCard.size(); i++) {
            Card mc = myCards.get(i);
            for (int j = 0; j < othersCard.size(); j++) {
                Card oc = othersCard.get(j);
                if (oc.getValue() >= mc.getValue()) {
                    if (oc.getValue() >= hc.getValue()) {
                        hc = oc;
                    }
                } else {
                    if (mc.getValue() > hc.getValue()) {
                        hc = mc;
                    }
                }
            }
        }

        return myCards.contains(hc);
    }

}