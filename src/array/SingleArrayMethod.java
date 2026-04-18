package array;

import java.util.Arrays;

public class SingleArrayMethod {

    public static void main(String[] args) {

        String[] vehicles = {"Tesla", "Toyota", "Honda", "Ford", "Mazda"};

        boolean found = Arrays.asList(vehicles).contains("Nissan");

        System.out.println(found);


        int[] values = {5, 10, 15, 20, 25};

        int[] copiedValues = new int[5];

        System.arraycopy(values, 0, copiedValues, 0, 4);

        System.out.println(Arrays.toString(copiedValues));


        String[] originalWords = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Eta", "Theta"};

        String[] selectedWords = Arrays.copyOfRange(originalWords, 2, 6);

        System.out.println(Arrays.toString(selectedWords));
    }
}