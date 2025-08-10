

public class Recursion_and_Scope_and_Return_Solutions_Q1_50 {



    // Q36
    static int addQ36(int a, int b) { return a + b; }

    // Q37
    static int squareQ37(int x) { return x * x; }

    // Q38
    static int fooQ38(int x) { if (x == 0) return 1; return x * fooQ38(x - 1); }

    // Q39
    static int mulQ39(int a, int b) { return a * b; }
    static int addQ39(int a, int b) { return a + b; }

    // Q40
    static int fQ40(int x) { return x + 1; }

    // Q41
    static int fQ41(int a) { if (a == 1) return 1; return a + fQ41(a - 1); }

    // Q42
    static int mysteryQ42(int x) { if (x == 0) return 1; return 2 * mysteryQ42(x - 1); }

    // Q43
    static int processQ43(int x) { return x * 2; }

    // Q44
    static int callQ44(int x) { return x + 2; }

    // Q45
    static int calcQ45(int x) { return x * x + 1; }

    // Q46
    static int fQ46(int x) { return x % 2 == 0 ? x : fQ46(x - 1); }

    // Q47
    static int fQ47(int a) { return a + 1; }
    static int gQ47(int a) { return fQ47(a) * 2; }

    // Q48
    static int decideQ48(int a) { if (a > 5) return 10; return 5; }

    // Q49
    static int funAQ49(int n) { if (n <= 0) return 0; return n + funBQ49(n - 1); }
    static int funBQ49(int n) { if (n <= 0) return 0; return n + funAQ49(n / 2); }

    // Q50
    static boolean isEvenQ50(int x) { return x % 2 == 0; }

    public static void main(String[] args) {
        // Q36
        System.out.println("Q36: " + addQ36(addQ36(2, 3), 4));

        // Q37
        System.out.println("Q37: " + squareQ37(squareQ37(2)));

        // Q38
        System.out.println("Q38: " + fooQ38(4));

        // Q39
        System.out.println("Q39: " + mulQ39(addQ39(1, 2), addQ39(2, 3)));

        // Q40
        System.out.println("Q40: " + fQ40(fQ40(fQ40(1))));

        // Q41
        System.out.println("Q41: " + fQ41(3));

        // Q42
        System.out.println("Q42: " + mysteryQ42(4));

        // Q43
        int x43 = 3;
        System.out.println("Q43: " + processQ43(processQ43(x43)));

        // Q44
        System.out.println("Q44: " + callQ44(callQ44(callQ44(0))));

        // Q45
        System.out.println("Q45: " + (calcQ45(2) + calcQ45(3)));

        // Q46
        System.out.println("Q46: " + fQ46(7));

        // Q47
        System.out.println("Q47: " + gQ47(3));

        // Q48
        System.out.println("Q48: " + (decideQ48(3) + decideQ48(6)));

        // Q49
        System.out.println("Q49: " + funAQ49(4));

        // Q50
        System.out.println("Q50: " + isEvenQ50(6));
    }
}
