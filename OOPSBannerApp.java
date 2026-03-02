public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    static String[] getOPattern() {
        return new String[] {
            " ***** ",
            "**   **",
            "**   **",
            "**   **",
            "**   **",
            "**   **",
            " ***** "
        };
    }

    static String[] getPPattern() {
        return new String[] {
            "****** ",
            "**   **",
            "**   **",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        };
    }

    static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "**     ",
            "**     ",
            " ***** ",
            "     **",
            "     **",
            " ***** "
        };
    }
}