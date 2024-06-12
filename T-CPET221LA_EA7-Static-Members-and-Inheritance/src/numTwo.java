// The parent class has a private integer variable privateNum.
// Create a method wherein you can set and get the value of the variable using a child class.
public class numTwo {
    public static void main(String[] args) {
    Child obj = new Child();

    obj.setPrivateNum(7);
    System.out.println(obj.getPrivateNum());
    }
}
