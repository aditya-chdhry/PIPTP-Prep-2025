public class main {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int x = add(add(2, 3), 4);
        System.out.println(x);
    }
}

//2
public class Main {
    public static int square(int x) {
        return x * x;
    }
    public static void main(String[] args) {
        int res = square(square(2));
        System.out.println(res);
    }
}



//3
public class Main {
    public static int foo(int x) {
        if (x == 0) return 1;
        return x * foo(x - 1);
    }
    public static void main(String[] args) {
        System.out.println(foo(4));
    }
}

//4
public class Main {
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int result = mul(add(1, 2), add(2, 3));
        System.out.println(result);
    }
}

//5
public class Main {
    public static int f(int x) {
        return x + 1;
    }
    public static void main(String[] args) {
        int a = f(f(f(1)));
        System.out.println(a);
    }
}

//6
public class Main {
    public static int f(int a) {
        if (a == 1) return 1;
        return a + f(a - 1);
    }
    public static void main(String[] args) {
        int x = f(3);
        System.out.println(x);
    }
}


//7
public class Main {
    public static int mystery(int x) {
        if (x == 0) return 1;
        return 2 * mystery(x - 1);
    }
    public static void main(String[] args) {
        System.out.println(mystery(4));
    }
}


//8
public class Main {
    public static int process(int x) {
        return x * 2;
    }
    public static void main(String[] args) {
        int x = 3;
        int y = process(process(x));
        System.out.println(y);
    }
}


//9
public class Main {
    public static int call(int x) {
        return x + 2;
    }
    public static void main(String[] args) {
        int result = call(call(call(0)));
        System.out.println(result);
    }
}

//10
public class Main {
    public static int calc(int x) {
        return x * x + 1;
    }
    public static void main(String[] args) {
        System.out.println(calc(2) + calc(3));
    }
}

//11
public class Main {
    public static int f(int x) {
        return x % 2 == 0 ? x : f(x - 1);
    }
    public static void main(String[] args) {
        System.out.println(f(7));
    }
}


//12
public class Main {
    public static int f(int a) {
        return a + 1;
    }
    public static int g(int a) {
        return f(a) * 2;
    }
    public static void main(String[] args) {
        System.out.println(g(3));
    }
}


//13
public class Main {
    public static int funA(int n) {
        if (n <= 0) return 0;
        return n + funB(n - 1);
    }
    public static int funB(int n) {
        if (n <= 0) return 0;
        return n + funA(n / 2);
    }
    public static void main(String[] args) {
        System.out.println(funA(4));
    }
}


//14
public class Main {
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(6));
    }
}

