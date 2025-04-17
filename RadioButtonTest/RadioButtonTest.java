package RadioButtonTest; // Define o pacote do projeto, organizando as classes dentro de um namespace.

import javax.swing.JFrame; // Importa JFrame, que representa a janela principal da interface gráfica.

public class RadioButtonTest {
    // Classe principal que contém o método main para iniciar o programa.
    public static void main(String[] args) {
        // Cria uma instância da classe RadioButtonFrame (uma janela personalizada com botões de rádio).
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame(); 
        
        // Configura a operação padrão ao fechar a janela (encerra o programa).
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // Define o tamanho da janela principal como 300 pixels de largura e 100 pixels de altura.
        radioButtonFrame.setSize(300, 100); 
        
        // Torna a janela visível para o usuário.
        radioButtonFrame.setVisible(true); 
    }
}