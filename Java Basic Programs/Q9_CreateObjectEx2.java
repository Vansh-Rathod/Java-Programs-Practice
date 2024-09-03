// using clone method

public class Q9_CreateObjectEx2 implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // invokes the clone() method of the super class
        return super.clone();
    }

    void printHey() {
        System.out.println("Hey There!");
    }

    public static void main(String[] args) {
        Q9_CreateObjectEx2 obj1 = new Q9_CreateObjectEx2();
        try {
            Q9_CreateObjectEx2 obj2 = (Q9_CreateObjectEx2) obj1.clone();
            obj2.printHey();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
