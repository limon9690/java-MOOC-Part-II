import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> directory;

    public DictionaryOfManyTranslations() {
        this.directory = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.directory.putIfAbsent(word, new ArrayList<>());

        this.directory.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (!this.directory.containsKey(word)) {
            return new ArrayList<>();
        }
        
        return this.directory.get(word);
    }

    public void remove(String word) {
        this.directory.remove(word);
    }

}
