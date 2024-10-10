import java.util.ArrayList;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand () {
        this.cards = new ArrayList<>();
    }

    public int getSum() {
        return this.cards.stream()
                    .mapToInt(card -> card.getValue())
                    .sum();
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

    @Override
    public int compareTo(Hand hand) {
        return this.getSum() - hand.getSum();            
    }

    public void sortBySuit() {
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        this.cards.stream()
                  .sorted(comparator)
                  .forEach(card -> System.out.println(card));
    }
}
