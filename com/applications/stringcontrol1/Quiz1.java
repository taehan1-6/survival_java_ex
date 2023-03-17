package com.applications.stringcontrol1;

class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    // i번째 글자가 모음인지?
    public boolean isVowel(int i) {
        if (letters.substring(i, i + 1).equals("a")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("e")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("i")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("o")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("u")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("A")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("E")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("I")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("O")) {
            return true;
        } else if (letters.substring(i, i + 1).equals("U")) {
            return true;
        } else {
            return false;
        }
    }

    // i번째 글자가 자음인지?
    public boolean isConsonant(int i) {
        return !isVowel(i);
    }
}


public class Quiz1 {
    public static void main(String[] args) {
        Word word = new Word("axxixxxx");

        System.out.println(word.isConsonant(2));
    }

}
