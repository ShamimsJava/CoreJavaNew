package Alphabet;

public class AlphabetPrint {

    public static void main(String[] args) {
        char[] s = new char[26];
        for (int i = 0; i < 26; i++) {
            s[i] = (char) ('A' + i);
        }
        System.out.println(s);
    }
}
