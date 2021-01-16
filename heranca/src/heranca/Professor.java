package heranca;

import javax.swing.JOptionPane;


public class Professor extends Pessoa {

    private String disciplina;
    private double salario;
    
    public void InserirProfessor(){
       InserePessoa();
        disciplina = JOptionPane.showInputDialog("Insira a disciplina do professor");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salario do professor"));
       
    }
    
    public void ImprimirProfessor(){
        ImprimePessoa();
        JOptionPane.showMessageDialog(null,"Disciplina do professor: " + disciplina);
        JOptionPane.showMessageDialog(null,"Salário do professor: " + salario);
        
        
    }
    
    
}
