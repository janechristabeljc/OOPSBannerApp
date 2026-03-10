import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static class BannerLetter {
        String[] pattern;

        BannerLetter(String[] pattern) {
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, BannerLetter> bannerMap = new HashMap<>();

        bannerMap.put('O', new BannerLetter(new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        }));

        bannerMap.put('P', new BannerLetter(new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        }));

        bannerMap.put('S', new BannerLetter(new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        }));

        String text = "OOPS";

        for (int row = 0; row < 5; row++) {
            for (char c : text.toCharArray()) {
                System.out.print(bannerMap.get(c).pattern[row] + "  ");
            }
            System.out.println();
        }
    }
}