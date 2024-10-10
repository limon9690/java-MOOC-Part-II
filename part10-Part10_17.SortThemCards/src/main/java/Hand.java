import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand () {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        cards.stream()
             .forEach(card -> System.out.println(card));
    }

    public void sort() {
        cards.stream()
             .sorted()
             .forEach(c -> System.out.println(c));
    }
}
