//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Operation add=new Add();
        add.add(3,5);
        add.show();
        Operation sub=new Subtract();
        sub.subtract(3,5);
        sub.show();
        Operation mul=new Multiply();
        mul.multiply(4,5);
        Operation d=new Divide();
        d.divide(4,5);

    }
}