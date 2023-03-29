// 13020210029 andi muaffivatul fiqra
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0017 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0017 obj = new Central0017();
        System.out.println("main");
        obj.aaa();
    }
}