import javax.swing.*;

public class KullaniciForm extends JFrame{
    private JPanel KullaniciPanel;

    public KullaniciForm() {
        add(KullaniciPanel);
        setTitle("Kullanıcı Paneli");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
