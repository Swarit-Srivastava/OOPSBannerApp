
public class OOPSBannerAppUC6 {
    public static String getOPattern(int row) {
        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
        return O[row];
    }
    public static String getPPattern(int row) {
        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
        return P[row];
    }
    public static String getSPattern(int row) {
        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
        return S[row];
    }

    public static void main(String[] args) {
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    getOPattern(i),
                    getOPattern(i),
                    getPPattern(i),
                    getSPattern(i));
        }
        for (String line : banner) {
            System.out.println(line);
        }
    }
}