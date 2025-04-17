package CheckBoxTest; // Define o pacote do projeto, organizando as classes dentro de um namespace.

import java.awt.FlowLayout; // Importa FlowLayout para organizar os componentes em linha dentro do JFrame.
import java.awt.Font; // Importa Font para manipular estilos de fonte como negrito e itálico.
import java.awt.event.ItemListener; // Importa a interface que escuta mudanças de estado em componentes (ItemEvent).
import java.awt.event.ItemEvent; // Importa a classe que representa o evento de mudança de estado.
import javax.swing.JFrame; // Importa JFrame, que representa a janela principal da interface gráfica.
import javax.swing.JTextField; // Importa JTextField, usado para criar caixas de texto.
import javax.swing.JCheckBox; // Importa JCheckBox, usado para criar caixas de seleção.

public class CheckBoxFrame extends JFrame { 
    // Classe principal que representa um frame com caixas de texto e caixas de seleção.

    private JTextField textField; // Declara um campo de texto para exibir e alterar estilos de fonte.
    private JCheckBox boldJCheckBox; // Declara uma caixa de seleção para aplicar estilo negrito.
    private JCheckBox italicJCheckBox; // Declara uma caixa de seleção para aplicar estilo itálico.

    public CheckBoxFrame() { 
        // Construtor para inicializar o frame e configurar os componentes.

        super("JCheckBox Teste"); // Define o título da janela principal.

        setLayout(new FlowLayout()); // Configura o layout como FlowLayout para organizar componentes em linha.

        // Cria um campo de texto com espaço para 20 caracteres e texto inicial.
        textField = new JTextField("Ver a alteração do estilo da fonte", 20); 
        textField.setFont(new Font("Serif", Font.PLAIN, 14)); // Define a fonte padrão como serifada e tamanho 14.
        add(textField); // Adiciona o campo de texto ao JFrame.

        // Cria uma caixa de seleção com o texto "Negrito".
        boldJCheckBox = new JCheckBox("Negrito"); 
        add(boldJCheckBox); // Adiciona a caixa de seleção de negrito ao JFrame.

        // Cria uma caixa de seleção com o texto "Itálico".
        italicJCheckBox = new JCheckBox("Itálico"); 
        add(italicJCheckBox); // Adiciona a caixa de seleção de itálico ao JFrame.

        // Registra um manipulador de eventos para escutar as mudanças de estado das caixas de seleção.
        CheckBoxHandler handler = new CheckBoxHandler(); 
        boldJCheckBox.addItemListener(handler); // Conecta o manipulador ao checkbox de negrito.
        italicJCheckBox.addItemListener(handler); // Conecta o manipulador ao checkbox de itálico.
    }

    private class CheckBoxHandler implements ItemListener { 
        // Classe interna privada que implementa a interface ItemListener para tratar eventos de mudança de estado.

        public void itemStateChanged(ItemEvent event) { 
            // Método chamado automaticamente quando o estado de uma caixa de seleção muda.

            Font font = null; // Declara um objeto Font para aplicar o estilo.

            // Aplica estilos conforme o estado das caixas de seleção.
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) 
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14); // Negrito e Itálico.
            else if (boldJCheckBox.isSelected()) 
                font = new Font("Serif", Font.BOLD, 14); // Apenas Negrito.
            else if (italicJCheckBox.isSelected()) 
                font = new Font("Serif", Font.ITALIC, 14); // Apenas Itálico.
            else 
                font = new Font("Serif", Font.PLAIN, 14); // Fonte padrão (sem estilo).

            textField.setFont(font); // Atualiza o estilo da fonte no campo de texto.
        }
    }
}