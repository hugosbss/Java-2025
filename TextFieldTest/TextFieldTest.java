package TextFieldTest; // Define o pacote do projeto, organizando a classe em um namespace.

import javax.swing.JFrame; // Importa JFrame, que representa a janela principal da interface gráfica.

public class TextFieldTest { 
    // Classe principal que contém o método main para executar o programa.

    public static void main(String[] args) {
        // Cria uma instância da classe TextFieldFrame (uma janela personalizada).
        TextFieldFrame textFieldFrame = new TextFieldFrame(); 
        
        // Configura a operação padrão ao fechar a janela (encerra o programa).
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // Define o tamanho da janela principal como 350 pixels de largura e 100 pixels de altura.
        textFieldFrame.setSize(350, 100); 
        
        // Torna a janela visível para o usuário.
        textFieldFrame.setVisible(true); 
        
        // Configura a posição da janela na tela (200 pixels à esquerda e 300 pixels do topo da tela).
        textFieldFrame.setLocation(200, 300); 
    }
}