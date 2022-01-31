package wordle;

import java.util.Arrays;

public class Decoration {

    char[] chars = new char[5];
    int frequency = 1;

    public Decoration(Word word, Word word2) {
        for (int i = 0; i < 5; i++) {
            if (word2.chars[i] == word.chars[i]) {
                chars[i] = 'Y';
            } else if (Arrays.toString(word.chars).contains(String.valueOf(word2.chars[i]))) {
                chars[i] = 'M';
            } else {
                chars[i] = 'N';
            }
        }
    }

    public Decoration(String string) {
        chars = string.toCharArray();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Decoration that = (Decoration) o;
        return Arrays.equals(chars, that.chars);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(chars);
    }

    @Override
    public String toString() {
        return Arrays.toString(chars);
    }
}
