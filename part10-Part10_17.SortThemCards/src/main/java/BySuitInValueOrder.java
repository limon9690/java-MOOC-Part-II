import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{

        @Override
    public int compare(Card c1, Card c2) {
        // First compare suits by their ordinal value
        int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        
        // If suits are the same, compare by value
        if (suitComparison == 0) {
            return c1.getValue() - c2.getValue();
        }
        
        // Otherwise, return the result of the suit comparison
        return suitComparison;
    }

}
