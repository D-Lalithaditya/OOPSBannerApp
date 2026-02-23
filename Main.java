public class Main {

    // Static helper method for O
    public static String[] getOPattern() {
        return new String[]{
                " OOO  ",
                "O   O ",
                "O   O ",
                "O   O ",
                " OOO  "
        };
    }

    // Static helper method for P
    public static String[] getPPattern() {
        return new String[]{
                "PPPPP ",
                "P    P",
                "PPPPP ",
                "P     ",
                "P     "
        };
    }

    // Static helper method for S
    public static String[] getSPattern() {
        return new String[]{
                " SSSS ",
                "S     ",
                " SSSS ",
                "     S",
                " SSSS "
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Assemble banner lines
        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = String.join(" ",
                    o[i],
                    o[i],
                    p[i],
                    s[i]
            );
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}