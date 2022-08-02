/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Vent
 */
public class CheckBox {
JCheckBox primeira, segunda, terceira, quarta, quinta;
    JLabel vazio;
    
    public CheckBox() {
        super("Exemplo de um JCheckBox");
        Container tela = getContentPane();
        tela.setLayout(null);
        JLabel rotulo = new JLabel("Quais suas linguagens favoritas? ");
        
        rotulo.setBounds(40,30,200,20);
        primeira = new JCheckBox("Java");
        primeira.setMnemonic(KeyEvent.VK_J);
        primeira.setBounds(40,60,60,20);
        segunda = new JCheckBox("C++");
        segunda.setMnemonic(KeyEvent.VK_C);
        segunda.setBounds(100,60,60,20);
        terceira = new JCheckBox("Delphi");
        terceira.setMnemonic(KeyEvent.VK_D);
        terceira.setBounds(160,60,60,20);
        quarta = new JCheckBox("Visual Basic");
        quarta.setMnemonic(KeyEvent.VK_V);
        quarta.setBounds(230,60,100,20);
        quinta = new JCheckBox("Python");
        quinta.setMnemonic(KeyEvent.VK_P);
        quinta.setBounds(335,60,70,20);
        JButton botao = new JButton("Exibir");
        botao.setBounds(200,150,100,20);
        vazio = new JLabel("");
        primeira.setSelected(false); //inicia a caixa de seleção marcada
        primeira.setForeground(Color.blue); //Alterando a cor da letra JCheckBox
        vazio.setBounds(100,200,600,20);
        botao.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String escolhas = "";
                    if (primeira.isSelected() ==true)
                        escolhas = escolhas + primeira.getText();
                    if (segunda.isSelected() ==true)
                        escolhas = escolhas +" "+segunda.getText();
                    if (terceira.isSelected() ==true)
                        escolhas = escolhas +" "+terceira.getText();
                    if (quarta.isSelected() ==true)
                        escolhas = escolhas +" "+quarta.getText();
                    if (quinta.isSelected() ==true)
                        escolhas = escolhas+" "+quinta.getText();
                    
                    vazio.setText("Você escolheu: "+escolhas);
                }
            });
        
        tela.add(rotulo);
        tela.add(primeira);
        tela.add(segunda);
        tela.add(terceira);
        tela.add(quarta);
        tela.add(quinta);
        tela.add(botao);
        tela.add(vazio);
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main (String args[]) {
        CheckBox app = new CheckBox();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
