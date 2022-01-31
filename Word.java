package wordle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word {

    char[] chars = new char[5];
    List<Decoration> possibleDecorations = new ArrayList<>();

    public Word(String word) {
        try {
            int index = 0;
            for (char c : word.toCharArray()) {
                chars[index++] = c;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: " + word);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(chars);
    }

    public void addDecoration(Word word2) {
        Decoration decoration = new Decoration(this, word2);
        if (possibleDecorations.contains(decoration)) {
            possibleDecorations.get(
                    possibleDecorations.indexOf(decoration)
            ).frequency++;
        } else {
            possibleDecorations.add(decoration);
        }
    }
}

