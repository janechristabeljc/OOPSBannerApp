/**
 * OOPSBannerApp
 *
 * UC3: Render OOPS as Banner using String.join()
 *
 * @author Jane Christabel
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };

        String[] P = {
            " ***** ",
            " *   * ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };

        String[] S = {
            "  ***  ",
            " *   * ",
            " *     ",
            "  ***  ",
            "     * ",
            " *   * ",
            "  ***  "
        };

        // Using String.join instead of +
        for (int i = 0; i < 7; i++) {
            System.out.println(
                String.join("   ", O[i], O[i], P[i], S[i])
            );
        }
    }
}
