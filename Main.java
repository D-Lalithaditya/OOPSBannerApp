public class Main {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] banner = new String[5];

        banner[0] = String.join(" ",
                " OOO  ",
                " OOO  ",
                "PPPPP ",
                " SSSS "
        );

        banner[1] = String.join(" ",
                "O   O ",
                "O   O ",
                "P    P",
                "S     "
        );

        banner[2] = String.join(" ",
                "O   O ",
                "O   O ",
                "PPPPP ",
                " SSSS "
        );

        banner[3] = String.join(" ",
                "O   O ",
                "O   O ",
                "P     ",
                "     S"
        );

        banner[4] = String.join(" ",
                " OOO  ",
                " OOO  ",
                "P     ",
                " SSSS "
        );

        // Loop through array and print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}