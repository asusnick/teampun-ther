package teampun_ther;

public class Card {
    private Integer value;
    private Suit suit;

    public Card(Integer value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Integer getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }
}
