import java.util.HashMap;

public class Card {

    String cardCode;

    public Card(String cardCode) throws IllegalArgumentException {
        this.cardCode = cardCode;

        HashMap<String, Integer> alphabeticCardValue = new HashMap<>();
        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);

        if(validateCardColor()) {

            String cardValue = cardCode.substring(1).toUpperCase();
            Integer intCardValue;

            validateCardValue(cardCode, cardValue, alphabeticCardValue);
        }
    }

    public void validateCardValue(String cardCode, String cardValue, HashMap<String, Integer> values) {
        Integer intCardValue;
        if (values.get(cardCode.substring(1).toUpperCase()) == null) {
            // raises exception if cardValue is a letter, but not J/Q/K/A
            try{
                intCardValue = Integer.parseInt(cardValue);
            }catch (NumberFormatException e){
                throw new NumberFormatException();
            }
            if (intCardValue > 10) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }
            if (intCardValue < 2) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }

        }
    }

    public boolean validateCardColor() {
        String cardColor = this.cardCode.substring(0, 1).toUpperCase();
        String acceptedColors = "SCDH";
        if (!acceptedColors.contains(cardColor))
        {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }else{
            return true;
        }
    }

    public int getValue() {
        HashMap<String, Integer> alphabeticCardValue = new HashMap<>();
        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);

        String cardValue = cardCode.substring(1).toUpperCase();
        Integer intCardValue;

        if (alphabeticCardValue.get(cardCode.substring(1).toUpperCase()) == null) {
            intCardValue = Integer.parseInt(cardValue);
        } else {
            intCardValue = alphabeticCardValue.get(cardCode.substring(1).toUpperCase());
        }

        return intCardValue;
    }
}
