package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beautify("Sample text", text -> "ABC" + text + "ABC");

        beautifier.beautify("Another sample text", String::toUpperCase);

        // Własny upiększacz: zamiana każdej litery na jej odpowiednik w alfabecie Morse'a
        beautifier.beautify("Hello World", text -> {
            StringBuilder morseText = new StringBuilder();
            for (char c : text.toCharArray()) {
                switch (Character.toLowerCase(c)) {
                    case 'a':
                        morseText.append(".- ");
                        break;
                    case 'b':
                        morseText.append("-... ");
                        break;
                    // Pozostałe przypadki alfabetu Morse'a

                    default:
                        morseText.append(c).append(" ");
                        break;
                }
            }
            return morseText.toString();
        });

        // Własny upiększacz: odwrócenie kolejności znaków w tekście
        beautifier.beautify("Reverse me", text -> new StringBuilder(text).reverse().toString());
    }
}