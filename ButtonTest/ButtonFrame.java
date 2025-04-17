package ButtonTest;

import java.awt.FlowLayout; // Importa o layout FlowLayout que organiza componentes em linha.
import java.awt.event.ActionListener; // Importa a interface para escutar eventos de ação.
import java.awt.event.ActionEvent; // Importa a classe usada para representar eventos de ação.
import javax.swing.JFrame; // Importa JFrame, que representa a janela principal da interface gráfica.
import javax.swing.JButton; // Importa JButton para criar botões.
import javax.swing.Icon; // Importa a interface Icon usada para manipular imagens.
import javax.swing.ImageIcon; // Importa ImageIcon para carregar e exibir imagens.
import javax.swing.JOptionPane; // Importa JOptionPane para mostrar diálogos de mensagens.

public class ButtonFrame extends JFrame {
    // Declara o botão simples com texto.
    private JButton simplesJButton;

    // Declara o botão elaborado com texto e ícone.
    private JButton elaboradoJButton;

    // Construtor da classe ButtonFrame.
    public ButtonFrame() {
        super("Testando botões"); // Configura o título da janela principal.
        setLayout(new FlowLayout()); // Define o layout como FlowLayout.

        // Cria um botão simples com texto.
        simplesJButton = new JButton("Botão simples");

        // Adiciona o botão simples à janela principal (JFrame).
        add(simplesJButton);

        // Carrega dois ícones para o botão elaborado.
        Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));

        // Cria um botão elaborado com texto e o ícone "bug1".
        elaboradoJButton = new JButton("Botão elaborado", bug1);

        // Define o ícone "bug2" para ser exibido quando o mouse estiver sobre o botão.
        elaboradoJButton.setRolloverIcon(bug2);

        // Adiciona o botão elaborado à janela principal (JFrame).
        add(elaboradoJButton);

        // Instancia um manipulador de eventos para lidar com cliques de botão.
        ButtonHandler handler = new ButtonHandler();

        // Conecta o manipulador de eventos ao botão elaborado.
        elaboradoJButton.addActionListener(handler);

        // Conecta o manipulador de eventos ao botão simples.
        simplesJButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener { // Classe interna que implementa ActionListener para lidar com eventos de botão.

        public void actionPerformed(ActionEvent event) {  // metodo chamado quando o botão é pressionado.
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format( // Exibe uma caixa de diálogo com a mensagem formatada.
                    "Você precionou: %s", event.getActionCommand())); // Obtém o comando de ação do evento e exibe na caixa de diálogo.
        }
    }
}