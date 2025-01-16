public class Main {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box integerBox = new Box();
        integerBox.setItem("String");
        integerBox.setItem(3);
        System.out.println(integerBox.getItem());
    }

}
