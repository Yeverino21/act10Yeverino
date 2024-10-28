import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//Emmanuel Yeverino al03063530
public class myWindow extends JFrame {
    private JPanel miPanel;
    private JTextField cajaNombre;
    private JButton botonSaludar;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JPanel numeros;
    private JPanel textfieldnumeros;
    private JButton btnSumar;
    private JTextField txtResultado;
    private JButton btnResta;
    private JButton btndiv;
    private JButton btnmulti;


    public myWindow() {
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = cajaNombre.getText();
                JOptionPane.showMessageDialog(miPanel, "Holaa " + n + " Estamos listos para hacer operaciones");
            }
        });
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum1.setBackground(Color.CYAN);
            }
        });
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum1.setBackground(Color.white);
            }
        });
        txtNum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum2.setBackground(Color.CYAN);
            }
        });
        txtNum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum2.setBackground(Color.WHITE);
            }
        });
        cajaNombre.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cajaNombre.setBackground(Color.CYAN);
            }
        });
        cajaNombre.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                cajaNombre.setBackground(Color.white);
            }
        });
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double suma;
                suma = a + b;
                txtResultado.setText("La suma total es: " + String.valueOf(suma));
            }
        });
        txtResultado.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtResultado.setBackground(Color.RED);
            }
        });
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double resta;
                resta = a - b;
                txtResultado.setText("La resta de los numeros es: " + String.valueOf(resta));
            }
        });
        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double div;
                div = a / b;
                txtResultado.setText("La división de los numeros es: " + String.valueOf(div));
            }
        });
        btnmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtNum1.getText());
                double b = Double.parseDouble(txtNum2.getText());
                double mult;
                mult = a * b;
                txtResultado.setText("La multiplación de los numeros es: " + String.valueOf(mult));
            }
        });
    }

    public static void main(String[] args) {
        myWindow v = new myWindow(); //creamos el obejto de la ventana

        v.setContentPane(v.miPanel); //ayuda al programar a que se mueste el JPanel dentro del JFrame
        v.setSize(500,500);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //constate para cerrar el programa

    }
}
