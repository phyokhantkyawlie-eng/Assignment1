package controlflow;

public class ProgramFive {

    public static void main(String[] args) {

        int i = 1;

        while (i < 5) {

            System.out.println(
                    "Level " + i +
                    " gives total power = " + (i + 100)
            );

            i++;

        }

    }

}