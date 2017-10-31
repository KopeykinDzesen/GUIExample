import javax.swing.*;

public class Reader {

    int i;
    int k;
    String s1;
    String s2;

    public void scan() {
        s1 = JOptionPane.showInputDialog("Введите первое число:");
        s2 = JOptionPane.showInputDialog("Введите второе число:");
        i = Integer.parseInt(s1);
        k = Integer.parseInt(s2);
    }

    public void scan(int a, int b) {
        JOptionPane.showMessageDialog(null, "Теперь ваше первое число = " + a +
                "\nТеперь ваше второе число = " + b);
    }

}
