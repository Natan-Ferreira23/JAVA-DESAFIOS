import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        JButton botaoAdicionar = new JButton("Adicionar nome");
        JButton botaoListar = new JButton("Listar nomes");
        JTextField nome = new JTextField("Digite seu nome ...",20);
        ListaNomes listaNomes = new ListaNomes();


        nome.setBounds(380,160, 220,30);
        tela.add(nome);
        botaoAdicionar.setBounds(380,210,220,30);
        botaoListar.setBounds(380,250,220,30);

        tela.add(botaoListar);
        tela.add(botaoAdicionar);

        tela.setSize(900,500);
        tela.setLayout(null);
        tela.setVisible(true);

        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String obj = nome.getText();
                listaNomes.adicionarNome(obj);
                nome.setText("");
                JOptionPane.showMessageDialog(null,"Produto inserido com sucesso !!!");
            }
        });

        botaoListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaNomes.listarNomes();
            }
        });
        }

    }

