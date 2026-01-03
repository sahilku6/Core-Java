package playinWithObject;

public class MethodChaning {

    MethodChaning m1() {
        return this;
    }

    MethodChaning m2() {
        return this;
    }

    MethodChaning m3() {
        return this;
    }

    MethodChaning m4() {
        return this;
    }

    MethodChaning m5() {
        return this;
    }

    public static void main(String[] args) {
        MethodChaning d1 = new MethodChaning();

        MethodChaning obj = d1.m1();
        System.out.println(obj);

        MethodChaning obj2 = d1.m1().m2();
        System.out.println(obj2);

        MethodChaning obj3 = d1.m1().m2().m3().m4();
        System.out.println(obj3);
    }
}

