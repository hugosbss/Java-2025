package TextFieldTest; // Define o pacote do projeto, organizando as classes dentro de um namespace.

import java.awt.FlowLayout; // Importa FlowLayout para organizar os componentes em linha dentro do JFrame.
import java.awt.event.ActionListener; // Importa a interface que escuta e trata eventos de ação.
import java.awt.event.ActionEvent; // Importa a classe que representa um evento de ação, como pressionar Enter.
import javax.swing.JFrame; // Importa JFrame, que representa a janela principal da interface gráfica.
import javax.swing.JTextField; // Importa JTextField, usado para criar caixas de texto.
import javax.swing.JPasswordField; // Importa JPasswordField, usado para criar campos de senha (texto oculto).
import javax.swing.JOptionPane; // Importa JOptionPane, usado para exibir mensagens de diálogo.

public class TextFieldFrame extends JFrame { 
    // Classe principal que representa um frame (janela) com campos de texto e senha.

    private JTextField textField1; // Cria uma caixa de texto simples.
    private JTextField textField2; // Cria uma caixa de texto com um valor padrão.
    private JTextField textField3; // Cria uma caixa de texto com texto fixo.
    private JPasswordField passwordField; // Cria uma caixa de texto de senha (texto oculto).

    public TextFieldFrame() { 
        // Construtor para inicializar o frame e configurar os componentes.

        super("Testando JTextField e o JPasswordField"); // Define o título do JFrame.

        setLayout(new FlowLayout()); // Configura o layout como FlowLayout, alinhando componentes em linha.

        // Cria a caixa de texto com 15 colunas.
        textField1 = new JTextField(15); 
        add(textField1); // Adiciona textField1 ao JFrame.

        // Cria a caixa de texto com um texto padrão.
        textField2 = new JTextField("Digite aqui"); 
        add(textField2); // Adiciona textField2 ao JFrame.

        // Cria a caixa de texto com texto fixo e 10 colunas.
        textField3 = new JTextField("texto fixo", 10); 
        textField3.setEditable(false); // Desativa a edição no textField3.
        add(textField3); // Adiciona textField3 ao JFrame.

        // Cria uma caixa de texto de senha com um texto padrão.
        passwordField = new JPasswordField("texto senha oculto"); 
        add(passwordField); // Adiciona passwordField ao JFrame.

        // Registra um manipulador de eventos para os campos de texto e senha.
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler); // Conecta o manipulador ao textField1.
        textField2.addActionListener(handler); // Conecta o manipulador ao textField2.
        textField3.addActionListener(handler); // Conecta o manipulador ao textField3.
        passwordField.addActionListener(handler); // Conecta o manipulador ao passwordField.
    }

    // Classe interna privada que implementa a interface ActionListener para tratar eventos.
    private class TextFieldHandler implements ActionListener { 

        public void actionPerformed(ActionEvent event) { 
            // Método chamado automaticamente quando um evento (pressionar Enter) acontece.

            String conteudotexto = ""; // Inicializa a string para exibir o conteúdo.

            // Verifica qual campo de texto acionou o evento e captura o texto associado.
            if (event.getSource() == textField1) 
                conteudotexto = String.format("caixa de texto 1: %s", event.getActionCommand());

            else if (event.getSource() == textField2) 
                conteudotexto = String.format("caixa de texto 2: %s", event.getActionCommand());

            else if (event.getSource() == textField3) 
                conteudotexto = String.format("caixa de texto 3: %s", event.getActionCommand());

            else if (event.getSource() == passwordField) 
                conteudotexto = String.format("caixa de senha: %s", event.getActionCommand());

            // Exibe o conteúdo capturado em uma janela de diálogo.
            JOptionPane.showMessageDialog(null, conteudotexto); 
        }
    }
}