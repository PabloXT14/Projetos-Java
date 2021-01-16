package heranca;

import javax.swing.JOptionPane;


public class Aluno extends Pessoa{
    
    private int ra;
    private double  nota;
    
    
    public Aluno() {
    }

    public Aluno(int ra, double nota) {
        this.ra = ra;
        this.nota = nota;
    }
    
    
    
    

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public void InsereAluno(){
      InserePessoa();
      do{
      ra = Integer.parseInt(JOptionPane.showInputDialog("Insira o RA do aluno"));
      }while((ra<24000) || (ra>27000));
      
      nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota do aluno"));
        
     
    }
    
    public void ImprimirAluno(){
        
        ImprimePessoa();
        JOptionPane.showMessageDialog(null,"RA do aluno: " + ra);
        JOptionPane.showMessageDialog(null,"Nota do aluno: " + nota);
        
        
    }
    
    
}
