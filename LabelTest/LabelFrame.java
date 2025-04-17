package LabelTest; // Define o pacote do projeto, organizando a classe em um namespace.

import java.awt.FlowLayout; // Importa FlowLayout para organizar os componentes dentro do JFrame.
import javax.swing.JFrame; // Importa JFrame, que representa a janela principal da interface gráfica.
import javax.swing.JLabel; // Importa JLabel, usado para exibir texto ou imagens no frame.
import javax.swing.SwingConstants; // Importa constantes para alinhar texto dentro de componentes.
import javax.swing.Icon; // Importa a interface Icon, usada para manipular imagens.
import javax.swing.ImageIcon; // Importa ImageIcon, usada para carregar e exibir imagens.

public class LabelFrame extends JFrame { // Define a classe LabelFrame, que herda as funcionalidades de JFrame.
    private JLabel label1; // Declara label1, que será um JLabel contendo apenas texto.
    private JLabel label2; // Declara label2, que será um JLabel contendo texto e um ícone.
    private JLabel label3; // Declara label3, que será um JLabel contendo texto e ícone alinhados.

    // Construtor da classe LabelFrame
    public LabelFrame() {
        super("Testando JLabel"); // Configura o título da janela principal (JFrame).
        setLayout(new FlowLayout()); // Define o layout como FlowLayout (organiza componentes em linha).
        setLocation(200, 400); // Define a posição da janela no monitor (200px da esquerda e 400px do topo).

        label1 = new JLabel("Label com texto"); // Cria label1 com texto simples.
        label1.setToolTipText("Este é o label1"); // Define o texto da dica exibida quando o mouse passa sobre label1.
        add(label1); // Adiciona label1 à janela JFrame.

        Icon bug = new ImageIcon(getClass().getResource("bug1.GIF")); // Carrega a imagem "bug1.GIF" como um ícone.

        label2 = new JLabel("Label com texto e icone", bug, SwingConstants.LEFT); // Cria label2 com texto e ícone alinhado à esquerda.
        label2.setToolTipText("Este é o label2"); // Define o texto da dica exibida quando o mouse passa sobre label2.
        add(label2); // Adiciona label2 à janela JFrame.

        label3 = new JLabel(); // Cria label3 vazio (sem texto ou ícone inicialmente).
        label3.setText("Label com icone e texto na parte inferior"); // Define o texto de label3.
        label3.setIcon(bug); // Adiciona o ícone carregado anteriormente ao label3.
        label3.setHorizontalTextPosition(SwingConstants.CENTER); // Alinha o texto horizontalmente no centro do JLabel.
        label3.setVerticalTextPosition(SwingConstants.BOTTOM); // Alinha o texto verticalmente abaixo do ícone no JLabel.
        label3.setToolTipText("Este é o label3"); // Define o texto da dica exibida quando o mouse passa sobre label3.
        add(label3); // Adiciona label3 à janela JFrame.
    }
}