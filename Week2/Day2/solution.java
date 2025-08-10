
public class Recursion_and_Scope_Solutions_Q1_35 {



    // Q21: pass-by-value with primitive
    static void modifyQ21(int x) {
        x = x + 10;
    }

    // Q22: pass-by-reference with arrays
    static void updateQ22(int[] arr, int i) {
        arr[i] = arr[i] + 5;
    }

    // Q23: local variable shadows outer variable
    static int xQ23 = 100;
    static void checkQ23() {
        int xQ23 = 50; // shadows outer
        System.out.println(xQ23);
    }

    // Q24: modifying global (class-level) variable
    static int aQ24 = 10;
    static void testQ24() {
        aQ24 = aQ24 + 5;
    }

    // Q25: function returns modified value
    static int modifyQ25(int x) {
        x = x * 2;
        return x;
    }

    // Q26: local modification doesn't affect caller's primitive
    static void demoQ26(int x) {
        x = x + 1;
        System.out.println(x);
    }

    // Q27: same as Q26
    static void addQ27(int val) {
        val = val + 10;
    }

    // Q28: separate local variables y and z
    static int funQ28(int x) {
        int y = x + 10;
        return y;
    }

    // Q29: closure-like scope simulation in Java via nested method calls
    static void innerQ29(int x) {
        System.out.println(x);
    }
    static void outerQ29() {
        int x = 2;
        innerQ29(x);
    }



    // Q31: increment function
    static int incrementQ31(int x) {
        x = x + 1;
        return x;
    }

    // Q32: local scope doesn't modify outer x
    static int xQ32 = 10;
    static void changeQ32() {
        int xQ32 = Recursion_and_Scope_Solutions_Q1_35.xQ32 + 5; // local variable, doesn't affect class var
    }

    // Q33: local variable assignment in function scope
    static int valQ33 = 2;
    static int mulQ33() {
        int val = valQ33 * 2; // local var, no change to static valQ33
        return val;
    }

    // Q34: recursive update until condition met
    static int recUpdateQ34(int a) {
        if (a > 10) return a;
        return recUpdateQ34(a + 2);
    }

    // Q35: swap without temp using arithmetic
    static void fQ35(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        // Q21
        int a21 = 5;
        modifyQ21(a21);
        System.out.println("Q21: " + a21);

        // Q22
        int[] arr22 = {1, 2, 3};
        updateQ22(arr22, 1);
        System.out.println("Q22: " + arr22[1]);

        // Q23
        checkQ23();
        System.out.println("Q23: " + xQ23);

        // Q24
        testQ24();
        System.out.println("Q24: " + aQ24);

        // Q25
        int x25 = 4;
        x25 = modifyQ25(x25);
        System.out.println("Q25: " + x25);

        // Q26
        int x26 = 5;
        demoQ26(x26);
        System.out.println("Q26: " + x26);

        // Q27
        int a27 = 3;
        addQ27(a27);
        System.out.println("Q27: " + a27);

        // Q28
        int y28 = 5;
        int z28 = funQ28(y28);
        System.out.println("Q28: " + y28 + " " + z28);

        // Q29
        outerQ29();

        // Q31
        int a31 = incrementQ31(2);
        int b31 = incrementQ31(a31);
        System.out.println("Q31: " + b31);

        // Q32
        changeQ32();
        System.out.println("Q32: " + xQ32);

        // Q33
        System.out.println("Q33: " + mulQ33());

        // Q34
        System.out.println("Q34: " + recUpdateQ34(4));

        // Q35
        int x35 = 3, y35 = 5;
        fQ35(x35, y35);
        System.out.println("Q35: " + x35 + " " + y35);
    }
}
