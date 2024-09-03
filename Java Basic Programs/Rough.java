class Dog {
    void printHello() {
        System.out.println("Hello There!");
    }
}

public class Rough {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        if(d1.equals(d2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
