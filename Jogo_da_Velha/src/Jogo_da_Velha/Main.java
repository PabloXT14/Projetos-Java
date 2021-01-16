package Jogo_da_Velha;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main extends JFrame{
    
    JButton[] bt = new JButton[9];//vetor de botões do jogo
    boolean xo = false;
    boolean[] click = new boolean[9];
    JLabel placar = new JLabel("Placar de Vitórias");
    JLabel px = new JLabel("X = 0");
    JLabel po = new JLabel("O = 0");
    JLabel empate = new JLabel("Empates = 0");
    int PX = 0;
    int PO = 0;
    int nempate = 0;
    JButton novo = new JButton("Novo Jogo");
    JButton zerar = new JButton("Zerar Placar");
    
    
    
    public static void main(String[] args){
        new Main();
        
    }
    
    public Main()
    {
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(3);//fecha quando clicar no X
        setLayout(null);//nos que iremos definir o layout da janela
        setBounds(350, 100, 720, 500);//localização e tamanho da janela
        //posição do placar
        add(placar);
        add(px);
        add(po);
        add(empate);
        placar.setBounds(530, 5, 300, 30);
        px.setBounds(565, 35, 100, 30);
        po.setBounds(565, 65, 100, 30);
        empate.setBounds(565, 95, 150, 30);

        //adicionando botões de novo e zerar
        add(novo);
        add(zerar);
        novo.setBounds(530, 125, 120, 30);
        zerar.setBounds(530, 160, 120, 30);
        
        novo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
        
        zerar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            PX = 0;
            PO = 0;
            nempate = 0;
            atualizar();
            }
        });
           
        
        int cont = 0;
        for(int i = 0; i <3; i++)
        {
            for(int j = 0; j <3; j++)
            {
                bt[cont] = new JButton();
                add(bt[cont]);
                bt[cont].setBounds((100*i) + 200, (100*j) + 80, 95, 95);
                bt[cont].setFont(new Font("Arial",Font.BOLD, 40) );
                cont++;
            }
        }
        
        //conferindo se já clicou
        for(int i = 0; i < 9; i++)
        {
           click[i] = false; 
        }
        
        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(click[0] == false){
                   click[0] = true;
                   mudar(bt[0]);   
               }
                
            }
        });
        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(click[1] == false){
                   click[1] = true;
                   mudar(bt[1]);   
               }
                
            }
        });
        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(click[2] == false){
                   click[2] = true;
                   mudar(bt[2]);   
               }
                
            }
        });
        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(click[3] == false){
                   click[3] = true;
                   mudar(bt[3]);   
               }
                
            }
        });
        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(click[4] == false){
                   click[4] = true;
                   mudar(bt[4]);   
               }
                
            }
        });
        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(click[5] == false){
                   click[5] = true;
                   mudar(bt[5]);   
               }
                
            }
        });
        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(click[6] == false){
                   click[6] = true;
                   mudar(bt[6]);   
               }
                
            }
        });
        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(click[7] == false){
                   click[7] = true;
                   mudar(bt[7]);   
               }
                
            }
        });
        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(click[8] == false){
                   click[8] = true;
                   mudar(bt[8]);   
               }
                
            }
        });
        
    }
    
    public void mudar(JButton btn)
    {
        if(xo)
        {
            btn.setText("O");
            xo = false;
        }
        else
        {
            btn.setText("X");
            xo = true;
        }
        
        ganhou();
    }
    
    public void atualizar()
    {
        px.setText("X = "+PX);
        po.setText("O = "+PO);
        empate.setText("Empates = "+nempate);
    }
    
    
    
    public void ganhou()
    {
        int cont = 0;
        for(int i = 0; i < 9; i++)
        {
            if(click[i] == true)
            {
                cont++;
            }
        }
        
        
        if((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X") 
            || (bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X")
            || (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")
            || (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")
            || (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")
            || (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X")
            || (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X")
            || (bt[2].getText() == "X" && bt[4].getText() == "X" && bt[6].getText() == "X") )
        {
            JOptionPane.showMessageDialog(null,"X ganhou");
            PX++;
            atualizar();
            limpar();
            
        }
        else if((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O") 
            || (bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O")
            || (bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O")
            || (bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O")
            || (bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O")
            || (bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O")
            || (bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O")
            || (bt[2].getText() == "O" && bt[4].getText() == "O" && bt[6].getText() == "O") )
        {
            JOptionPane.showMessageDialog(null,"O ganhou");
            PO++;
            atualizar();
            limpar();
            
        }
        else if(cont == 9)
        {
            JOptionPane.showMessageDialog(null,"Empate");
            nempate++;
            atualizar();
            limpar();
        }
    }
    
    public void limpar()
    {
        for(int i = 0; i < 9; i++)
        {
            bt[i].setText("");
            click[i] = false;
            xo = false;//para sempre que iniciar novo jogo começe com o X
        }
    }
    
}
