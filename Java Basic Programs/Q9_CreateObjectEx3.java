// using newInstance method

public class Q9_CreateObjectEx3 {

    void greetUser() {
        System.out.println("Hello How are you?");
    }

    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Q9_CreateObjectEx3");
            Q9_CreateObjectEx3 obj1 = (Q9_CreateObjectEx3) cls.newInstance();
            obj1.greetUser();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        }
    }
}
