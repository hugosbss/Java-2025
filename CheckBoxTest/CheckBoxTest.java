package CheckBoxTest; // Define o pacote do projeto, organizando as classes dentro de um namespace.

import javax.swing.JFrame; // Importa JFrame, que representa a janela principal da interface gráfica.

public class CheckBoxTest {
    // Classe principal que contém o método main para iniciar o programa.
    public static void main(String[] args) {
        // Cria uma instância da classe CheckBoxFrame (uma janela personalizada com caixas de seleção).
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame(); 
        
        // Configura a operação padrão ao fechar a janela (encerra o programa).
        checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // Define o tamanho da janela principal como 275 pixels de largura e 100 pixels de altura.
        checkBoxFrame.setSize(275, 100); 
        
        // Torna a janela visível para o usuário.
        checkBoxFrame.setVisible(true); 
    }
}