import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class miVentana  extends JFrame{
    private JPanel miPanel;
    private JTextField cajaNombre;
    private JButton botonSaludar;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSumar;
    private JTextField txtresultado;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;

    public miVentana() {
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(miPanel,"Hola! " + cajaNombre.getText());
            }
        });
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum1.setBackground(Color.yellow);
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
                txtNum2.setBackground(Color.yellow);
            }
        });
        txtNum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum2.setBackground(Color.white);
            }
        });
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtNum1.getText());
                    double b = Double.parseDouble(txtNum2.getText());
                    double suma;
                    suma = a +b;
                    //JOptionPane.showMessageDialog(miPanel,suma);
                    txtresultado.setText(String.valueOf("La suma de "+ a + " + " + b+ " es: " + suma));
                }catch (Exception NumberFormatException){
                    JOptionPane.showMessageDialog(miPanel,"No pongas letras");
                }

            }
        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtNum1.getText());
                    double b = Double.parseDouble(txtNum2.getText());
                    double resta;
                    resta = a - b;
                    //JOptionPane.showMessageDialog(miPanel,suma);
                    txtresultado.setText(String.valueOf("La resta de "+ a + " - " + b+ " es: " +resta));
                }catch (Exception NumberFormatException){
                    JOptionPane.showMessageDialog(miPanel,"No pongas letras");
                }
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtNum1.getText());
                    double b = Double.parseDouble(txtNum2.getText());
                    double multiplicacion;
                    multiplicacion = a*b;
                    //JOptionPane.showMessageDialog(miPanel,suma);
                    txtresultado.setText(String.valueOf("La multiplicacion de "+ a + " * " + b + " es: " +multiplicacion));
                }catch (Exception NumberFormatException){
                    JOptionPane.showMessageDialog(miPanel,"No pongas letras");
                }
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtNum1.getText());
                    double b = Double.parseDouble(txtNum2.getText());
                    double dividr;
                    dividr = a/b;
                    //JOptionPane.showMessageDialog(miPanel,suma);
                    txtresultado.setText(String.valueOf("La division de "+ a + "/" + b+ " es: " +dividr));
                }catch (Exception NumberFormatException){
                    JOptionPane.showMessageDialog(miPanel,"No pongas letras");
                }
            }
        });
    }

    public static void main(String[] args) {
        miVentana v = new miVentana();
        v.setContentPane(v.miPanel);
        v.setSize(500, 500);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
