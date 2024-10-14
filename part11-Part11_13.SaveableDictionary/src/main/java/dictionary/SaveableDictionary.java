package dictionary;

import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> EntoFn;
    private Map<String, String> FntoEn;

    public SaveableDictionary() {
        this.EntoFn = new HashMap<>();
        this.FntoEn = new HashMap<>();
    }

    public void add(String words, String translation) {
        if (!EntoFn.containsKey(words)) {
            EntoFn.put(words, translation);
        }

        if (!FntoEn.containsKey(translation)) {
            FntoEn.put(translation, words);
        }
    }

    public String translate(String word) {
        if (EntoFn.containsKey(word)) {
            return EntoFn.get(word);
        } else {
            return FntoEn.get(word);
        }
    }

    public void delete(String word) {
        String key = "";
        String revKey = "";

        if (EntoFn.containsKey(word)) {
            revKey = EntoFn.get(word);
            key = word;

            EntoFn.remove(key);
            FntoEn.remove(revKey);
        } 

        if (FntoEn.containsKey(word)) {
            key = word;
            revKey = FntoEn.get(word);

            FntoEn.remove(key);
            FntoEn.remove(revKey);
        }

        
    }

}
