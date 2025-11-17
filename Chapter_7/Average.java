import java.util.Arrays;

class Average {

    public static void main(String[] a) {
        int[] responseTimes = {100, 200, 150, 300};

        int count = 0;
        double sum = responseTimes[0]; 

        System.out.println("Input");
        System.out.println("responseTimes = " + Arrays.toString(responseTimes));
        System.out.println("\nOutput");
        
        // PROCESS
        for (int i = 1; i < responseTimes.length; i++) {
            double average = sum / i;
            if (responseTimes[i] > average) {
                count++;
            }
            sum += responseTimes[i];
        }

        System.out.println(count); // Expected output: 2

        // EXPLANATION SECTION
        System.out.println("\nExplanation");

        sum = responseTimes[0];
        count = 0;

        System.out.println("- Day 0: " + responseTimes[0] + " (no previous days, skip)");

        for (int i = 1; i < responseTimes.length; i++) {

            double average = sum / i;
            String prev = getPrevElements(responseTimes, i);

            if (responseTimes[i] > average) {
                count++;

                // Last day prints Return
                if (i == responseTimes.length - 1) {
                    System.out.println("- Day " + i + ": " + responseTimes[i] +
                        " > average(" + prev + ") = " + (int)average +
                        " \u2192 count = " + count + " Return");
                } else {
                    System.out.println("- Day " + i + ": " + responseTimes[i] +
                        " > average(" + prev + ") = " + (int)average +
                        " -> count = " + count);
                }

            } else {
                System.out.println("- Day " + i + ": " + responseTimes[i] +
                    " vs average(" + prev + ") = " + (int)average +
                    " -> not greater -> count = " + count);
            }

            sum += responseTimes[i];
        }
    }

    private static String getPrevElements(int[] arr, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < end; i++) {
            sb.append(arr[i]);
            if (i < end - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
