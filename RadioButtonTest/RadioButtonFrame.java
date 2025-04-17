package RadioButtonTest; // Define o pacote do projeto, organizando as classes dentro de um namespace.

import java.awt.FlowLayout; // Importa FlowLayout para organizar os componentes em linha dentro do JFrame.
import java.awt.Font; // Importa Font para manipular estilos de fonte como negrito e itálico.
import java.awt.event.ItemListener; // Importa a interface que escuta mudanças de estado em componentes (ItemEvent).
import java.awt.event.ItemEvent; // Importa a classe que representa o evento de mudança de estado.
import javax.swing.JFrame; // Importa JFrame, que representa a janela principal da interface gráfica.
import javax.swing.JTextField; // Importa JTextField, usado para criar caixas de texto.
import javax.swing.JRadioButton; // Importa JRadioButton, usado para criar botões de rádio.
import javax.swing.ButtonGroup; // Importa ButtonGroup para agrupar botões de rádio e garantir exclusividade de seleção.

public class RadioButtonFrame extends JFrame { 
    // Classe que representa o frame principal com botões de rádio e mudanças de estilo de fonte.

    private JTextField textField; // Campo de texto que exibe e aplica estilos de fonte.
    private Font plainFont; // Fonte padrão (sem estilo).
    private Font boldFont; // Fonte em negrito.
    private Font italicFont; // Fonte em itálico.
    private Font boldItalicFont; // Fonte em negrito e itálico.
    private JRadioButton plainJRadioButton; // Botão de rádio para fonte padrão.
    private JRadioButton boldJRadioButton; // Botão de rádio para fonte em negrito.
    private JRadioButton italicJRadioButton; // Botão de rádio para fonte em itálico.
    private JRadioButton boldItalicJRadioButton; // Botão de rádio para fonte em negrito e itálico.
    private ButtonGroup radioGroup; // Agrupamento de botões de rádio.

    public RadioButtonFrame() { 
        // Construtor para inicializar o frame e configurar os componentes.

        super("RadioButton Teste"); // Define o título do JFrame.

        setLayout(new FlowLayout()); // Configura o layout como FlowLayout para organizar componentes em linha.

        // Cria o campo de texto e define o texto inicial com uma largura de 25 caracteres.
        textField = new JTextField("Ver a alteração do estilo da fonte", 25); 
        add(textField); // Adiciona o campo de texto ao JFrame.

        // Cria botões de rádio com textos e configurações iniciais.
        plainJRadioButton = new JRadioButton("simples", true); // Botão de rádio selecionado inicialmente.
        boldJRadioButton = new JRadioButton("Negrito", false); // Botão de rádio para fonte em negrito.
        italicJRadioButton = new JRadioButton("Itálico", false); // Botão de rádio para fonte em itálico.
        boldItalicJRadioButton = new JRadioButton("Negrito/Itálico", false); // Botão de rádio para fonte em negrito e itálico.
        
        // Adiciona os botões de rádio ao JFrame.
        add(plainJRadioButton); 
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);

        // Agrupa os botões de rádio para garantir que apenas um esteja selecionado por vez.
        radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);

        // Define as fontes para cada estilo.
        plainFont = new Font("Serif", Font.PLAIN, 14); // Fonte padrão.
        boldFont = new Font("Serif", Font.BOLD, 14); // Fonte em negrito.
        italicFont = new Font("Serif", Font.ITALIC, 14); // Fonte em itálico.
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14); // Fonte em negrito e itálico.

        textField.setFont(plainFont); // Aplica a fonte padrão ao campo de texto.

        // Registra manipuladores de eventos para os botões de rádio.
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont)); 
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
    }

    private class RadioButtonHandler implements ItemListener { 
        // Classe interna privada que implementa a interface ItemListener para tratar eventos.

        private Font font; // Fonte associada ao botão de rádio.

        public RadioButtonHandler(Font f) { 
            // Construtor que recebe a fonte correspondente ao botão de rádio.
            font = f; 
        }

        public void itemStateChanged(ItemEvent event) { 
            // Método chamado automaticamente quando o estado de um botão de rádio muda.
            textField.setFont(font); // Atualiza o estilo de fonte do campo de texto conforme o botão selecionado.
        }
    }
}