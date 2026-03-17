/**
 * OOPS Banner App
 * UC7: Store Character Pattern in a Class
 * Demonstrates use of Inner Static Class to store character patterns
 */
public class OOPSBannerApp {
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7];
    }
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {
            String[] pattern = getCharacterPattern(patterns, ch);

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        printBanner("OOPS", patterns);
    }
}