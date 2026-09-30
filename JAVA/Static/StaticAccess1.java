//accessing static method inside any static member
//also accessing in innerClass's inner matheod
//for accessing innerlass's inner method we have to give className as a referenece
class StaticAccess1{
    static {
        System.out.println("Static block");
        m1();                     // Direct access
    }

    public static void main(String[] args) {
        System.out.println("main() start");
        m1();                     // Direct access
        InnerClass.m3();		  // innerClass ref to access method 
        System.out.println("main() ends");
    }

    public static void m1() {
        System.out.println("m1() static");
    }

    public static void m2() {
        System.out.println("m2() static");
        m1();                     // Direct access
    }

    // Static nested class
    public static class InnerClass {

        public static void m3() {
            System.out.println("m3() from static inner class");
            m1();                 // Outer class static method is Direct access
        }
    }
}