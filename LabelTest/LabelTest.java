package LabelTest;

import javax.swing.JFrame; // Janela principal

public class LabelTest {

    public static void main(String[] args) {
    LabelFrame labelFrame = new LabelFrame(); // cria um Label LabelFrame
    labelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); // encerra o programa quando fechar a janela
    labelFrame.setSize( 260, 180 ); // define tamanho frame
    labelFrame.setVisible( true ); // exibe frame
    }
}