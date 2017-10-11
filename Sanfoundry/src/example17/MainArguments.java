package example17;

public class MainArguments {

    public static void main(String[] args) {

        String[][] argument = new String[2][2];

        int x;

        argument[0] = args;

        x = argument[0].length;

        for (int y = 0; y < x; y++) {
            System.out.print(" " + argument[0][y]);
        }

    }
}
