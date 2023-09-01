import java.util.Arrays;

class SumParts {

    public static int[] sumParts(int[] ls) {
        if (ls.length == 0) {
            int[] sumParts = new int[1];
            sumParts[0] = 0;
            return sumParts;
        }
        int[] sumParts = new int[ls.length + 1];
        int index = 0;
        int sum = 0;
        System.out.println(ls.length);

        for (int i = ls.length; i > 0; i--) {
            System.out.println("First for" + i);

            for (int j = 0; j < i; j++) {
                System.out.println("Second for" + i);

                sum += ls[j];
                System.out.println("Suma simple" + sum);
            }
            sumParts[index] = sum;
            index++;
            sum = 0;

        }
        System.out.println(Arrays.toString(sumParts));

        return sumParts;
    }
}

public class SumofParts {

}
