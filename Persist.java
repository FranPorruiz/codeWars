class Persist {
    public static int persistence(long n) {
        long accumulative = 1, number;
        int operations = 0;

        while (n > 9) {
            for (int i = 1; i < n; i *= 10) {
                number = (n % (i * 10)) / i;
                accumulative *= number;
            }
            n = accumulative;
            accumulative = 1;
            operations++;
        }
        ;

        return operations;
    }
}