
public class Recursion_Solutions_Q1_20 {

    // Q1
    static int sumQ1(int n) {
        if (n == 1) return 1;
        return n + sumQ1(n - 1);
    }

    // Q2
    static int mysteryQ2(int a, int b) {
        if (b == 0) return 0;
        return a + mysteryQ2(a, b - 1);
    }

    // Q3
    static int fQ3(int n) {
        if (n == 0) return 0;
        return n + fQ3(n - 2);
    }

    // Q4
    static void funQ4(int x) {
        if (x == 0) return;
        funQ4(x - 1);
        System.out.println(x);
    }

    // Q5
    static int factQ5(int n) {
        if (n == 0) return 1;
        return n * factQ5(n - 1);
    }

    // Q6
    static int fibQ6(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        return fibQ6(n - 1) + fibQ6(n - 2);
    }

    // Q7
    static int funQ7(int n) {
        if (n <= 1) return n;
        return funQ7(n - 1) + funQ7(n - 3);
    }

    // Q8: count calls - implemented with a wrapper that counts invocations
    static int counterQ8;
    static void funQ8(int n) {
        counterQ8++;
        if (n == 0) return;
        funQ8(n - 1);
        funQ8(n - 1);
    }

    // Q9
    static int sumDigitsQ9(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigitsQ9(n / 10);
    }

    // Q10
    static void reversePrintQ10(int n) {
        if (n == 0) return;
        System.out.println(n);
        reversePrintQ10(n - 1);
    }

    // Q11 same as Fibonacci
    static int fooQ11(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        return fooQ11(n - 1) + fooQ11(n - 2);
    }

    // Q12
    static int seriesQ12(int n) {
        if (n == 1) return 1;
        return n * seriesQ12(n - 1);
    }

    // Q13: count prints - implemented by executing function and counting prints
    static int printCountQ13;
    static void funQ13(int n) {
        if (n == 0) return;
        funQ13(n - 1);
        funQ13(n - 1);
        printCountQ13++; // simulate a print(n)
    }

    // Q14
    static int productOfDigitsQ14(int n) {
        if (n == 0) return 1;
        return (n % 10) * productOfDigitsQ14(n / 10);
    }

    // Q15
    static void fQ15(int x) {
        if (x < 1) return;
        fQ15(x / 2);
        System.out.println(x);
    }

    // Q16
    static int powerQ16(int x, int y) {
        if (y == 0) return 1;
        return x * powerQ16(x, y - 1);
    }

    // Q17
    static void countDownQ17(int n) {
        if (n == 0) return;
        System.out.println(n);
        countDownQ17(n - 1);
    }

    // Q18
    static int altSumQ18(int n) {
        if (n == 0) return 0;
        return n - altSumQ18(n - 1);
    }

    // Q19
    static int funQ19(int n) {
        if (n == 1) return 1;
        return n * funQ19(n - 1) + funQ19(n - 1);
    }

    // Q20
    static int doubleFactorialQ20(int n) {
        if (n <= 0) return 1;
        return n * doubleFactorialQ20(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("=== Q1-Q20: outputs and sample runs ===\n");

        // Q1
        System.out.println("Q1 sum(5) = " + sumQ1(5)); // 15

        // Q2
        System.out.println("Q2 mystery(3,4) = " + mysteryQ2(3, 4)); // 12

        // Q3
        System.out.println("Q3 f(6) = " + fQ3(6)); // 12

        // Q4
        System.out.println("Q4 fun(3) prints:");
        funQ4(3); // prints 1 2 3 each on new line

        // Q5
        System.out.println("Q5 fact(4) = " + factQ5(4)); // 24

        // Q6
        System.out.println("Q6 fib(6) = " + fibQ6(6)); // 8

        // Q7
        System.out.println("Q7 fun(5) = " + funQ7(5)); // 1

        // Q8
        counterQ8 = 0;
        funQ8(3); // count calls
        System.out.println("Q8 number of calls for fun(3) = " + counterQ8); // 7

        // Q9
        System.out.println("Q9 sumDigits(1234) = " + sumDigitsQ9(1234)); // 10

        // Q10
        System.out.println("Q10 reversePrint(3) prints:");
        reversePrintQ10(3); // prints 3 2 1

        // Q11
        System.out.println("Q11 foo(4) = " + fooQ11(4)); // 3

        // Q12
        System.out.println("Q12 series(5) = " + seriesQ12(5)); // 120

        // Q13
        printCountQ13 = 0;
        funQ13(2);
        System.out.println("Q13 number of times print called for fun(2) = " + printCountQ13); // 3

        // Q14
        System.out.println("Q14 productOfDigits(123) = " + productOfDigitsQ14(123)); // 6

        // Q15
        System.out.println("Q15 f(8) prints:");
        fQ15(8); // prints 1 2 4 8

        // Q16
        System.out.println("Q16 power(2,4) = " + powerQ16(2, 4)); // 16

        // Q17
        System.out.println("Q17 countDown(3) prints:");
        countDownQ17(3); // prints 3 2 1

        // Q18
        System.out.println("Q18 altSum(5) = " + altSumQ18(5)); // 3

        // Q19
        System.out.println("Q19 fun(3) = " + funQ19(3)); // 12

        // Q20
        System.out.println("Q20 doubleFactorial(5) = " + doubleFactorialQ20(5)); // 15
    }
}
