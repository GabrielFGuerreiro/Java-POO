package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import business.Horario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Container;

public class Formulario
{
    private JFrame form;
    private JLabel lblHora, lblMinuto, lbl2p;
    private JButton btnIncrementaHora, btnDecrementaHora, btnIncrementaMinuto, btnDecrementaMinuto;
    private Horario horario;

    public Formulario(Horario ObjHorario)
    {
        inicializaComponentes();
        this.horario = ObjHorario;
    }
    
    public void inicializaComponentes()
    {
        form = new JFrame("Horário");
        form.setBounds(450, 150, 550, 450);
        form.setLayout(null);

        Container painelDeConteudo = form.getContentPane();
        Font fonte1 = new Font("Arial", Font.BOLD, 30);

        //Hora
        lblHora = new JLabel("00");
        lblHora.setBounds(225, 80, 200, 200);
        lblHora.setFont(fonte1);
        painelDeConteudo.add(lblHora);
        
        //Aumenta hora
        btnIncrementaHora = new JButton();
        btnIncrementaHora.setBounds(170, 160, 20, 20);
        painelDeConteudo.add(btnIncrementaHora);
        btnIncrementaHora.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //Controle para a hora não ultrapassar 24
                if(horario.getHora().getUnidade() < 24)
                    horario.getHora().incrementaUnidade(1);
                else
                    horario.getHora().setUnidade(24);

                lblHora.setText(String.valueOf(horario.getHora().getUnidade()));
            }
        });

        //Diminui hora
        btnDecrementaHora = new JButton();
        btnDecrementaHora.setBounds(170, 180, 20, 20);
        painelDeConteudo.add(btnDecrementaHora);
        btnDecrementaHora.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                horario.getHora().decrementaUnidade(1);
                lblHora.setText(String.valueOf(horario.getHora().getUnidade()));
            }
        });


        //Minuto
        lblMinuto = new JLabel("00");
        lblMinuto.setBounds(275, 80, 200, 200);
        lblMinuto.setFont(fonte1);
        painelDeConteudo.add(lblMinuto);

        //Aumenta minuto
        btnIncrementaMinuto = new JButton();
        btnIncrementaMinuto.setBounds(340, 160, 20, 20);
        painelDeConteudo.add(btnIncrementaMinuto);
        btnIncrementaMinuto.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                horario.getMinuto().incrementaUnidade(1);
                lblMinuto.setText(String.valueOf(horario.getMinuto().getUnidade()));
            }
        });

        //Diminui minuto
        btnDecrementaMinuto = new JButton();
        btnDecrementaMinuto.setBounds(340, 180, 20, 20);
        painelDeConteudo.add(btnDecrementaMinuto);
        btnDecrementaMinuto.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                horario.getMinuto().decrementaUnidade(1);
                lblMinuto.setText(String.valueOf(horario.getMinuto().getUnidade()));
            }
        });

        //Dois pontos
        lbl2p = new JLabel(":");
        lbl2p.setBounds(260, 80, 200, 200);
        lbl2p.setFont(fonte1);
        painelDeConteudo.add(lbl2p);

        form.setVisible(true);
    }   
}
