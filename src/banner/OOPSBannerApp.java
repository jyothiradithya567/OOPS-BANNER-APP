package banner;

class BannerPattern {

    public static String[] getOOPSBanner() {
        return new String[] {
            "  ****    ****   *****    **** ",
            " *    *  *    *  *    *  *     ",
            " *    *  *    *  *****    ***  ",
            " *    *  *    *  *           *",
            "  ****    ****   *       ****  "
        };
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {
        for (String line : BannerPattern.getOOPSBanner()) {
            System.out.println(line);
        }
    }
}