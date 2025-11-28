class ArraysDemo {


    public static void display(String message, int[] array) {
        System.out.print(message + " ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {0, 0, 0, 0, 0};

        display("Original array:                ", array);

        for (int i = 0; i < array.length; i++) {
            array[i] = 8;
        }
        display("After filling with 8s:         ", array);

        array[2] = 6;
        array[4] = 3;
        display("After changing two values:     ", array);

        java.util.Arrays.sort(array);
        display("After sorting:                 ", array);
    }
}
