package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> EntoFn;
    private Map<String, String> FntoEn;
    private String file;

    public SaveableDictionary() {
        this.EntoFn = new HashMap<>();
        this.FntoEn = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.EntoFn = new HashMap<>();
        this.FntoEn = new HashMap<>();
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String key : this.EntoFn.keySet()) {
                writer.println(key + ":" + this.EntoFn.get(key));
            }
            writer.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(new File(this.file));
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                String key = parts[0];
                String revKey = parts[1];

                add(key, revKey);
            }

            reader.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
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
    if (EntoFn.containsKey(word)) {
        String revKey = EntoFn.get(word);
        EntoFn.remove(word);
        FntoEn.remove(revKey); // Ensure the reverse entry is also removed
    } else if (FntoEn.containsKey(word)) {
        String key = FntoEn.get(word);
        FntoEn.remove(word);
        EntoFn.remove(key); // Ensure the original entry is also removed
    }
}

}
