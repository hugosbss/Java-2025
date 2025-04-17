package ButtonTest; // Define o pacote do projeto, organizando a classe em um namespace.

import javax.swing.*; // Importa classes do pacote Swing para criar interfaces gráficas.

public class ButtonTest {
    public static void main(String[] args) {
        // Instancia um objeto ButtonFrame para criar a janela principal.
        ButtonFrame buttonFrame = new ButtonFrame(); 
        
        // Configura a operação padrão ao fechar a janela (encerra o programa).
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Define o tamanho da janela principal como 320 pixels de largura e 120 pixels de altura.
        buttonFrame.setSize(320, 120); 
        
        // Torna a janela visível.
        buttonFrame.setVisible(true); 
    }
}