import java.util.*;

public class OOPSBanner_UC8 {

    // Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Function to initialize patterns
    public static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Function to print banner
    public static void printBanner(String word) {

        for (int row = 0; row < 5; row++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);
                System.out.print(pattern[row] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        String bannerWord = "OOPS";

        printBanner(bannerWord);
    }
}