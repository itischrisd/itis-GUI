package s25692.gui.oop.LABO02.singers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Spiewak {

    private static int liczbaSpiewakow = 0;
    private final String name;
    private final int nrSpiewaka;

    public Spiewak(String name) {
        this.name = name;
        nrSpiewaka = ++liczbaSpiewakow;
    }

    public static Spiewak najglosniejChar(Spiewak[] sp) {
        Spiewak tempSpiewak = sp[0];
        int longestLiterki = 0;

        for (Spiewak spiewak : sp) {
            int countLiterek = 0;
            for (char literka : spiewak.spiewaj().toCharArray()) {
                if (literka >= 'A' & literka <= 'Z')
                    countLiterek++;
            }
            if (countLiterek > longestLiterki) {
                longestLiterki = countLiterek;
                tempSpiewak = spiewak;
            }
        }

        return tempSpiewak;
    }

    public static Spiewak najgloseniejRegExp(Spiewak[] sp) {
        Spiewak tempSpiewak = sp[1];
        Pattern pattern = Pattern.compile("[A-Z]");
        String longestLetters = "";

        for (Spiewak spiewak : sp) {
            Matcher matcher = pattern.matcher(spiewak.spiewaj());
            StringBuilder currentLetters = new StringBuilder();
            while (matcher.find())
                currentLetters.append(matcher.group());
            if (currentLetters.length() > longestLetters.length()) {
                longestLetters = currentLetters.toString();
                tempSpiewak = spiewak;
            }
        }

        return tempSpiewak;
    }

    ;

    public abstract String spiewaj();

    @Override
    public String toString() {
        return "(" + nrSpiewaka + ") " + name + ": " + spiewaj();
    }
}
