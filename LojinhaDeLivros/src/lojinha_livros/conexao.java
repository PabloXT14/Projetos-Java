package lojinha_livros;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class conexao {
    
public static Connection con = null;
    
    
public conexao()
{
    
}

public static void conectar() throws ClassNotFoundException, SQLException {
    
   System.out.println("Conectando ao Banco de dados...");
    
   try{
       
    Class.forName("com.mysql.jdbc.Driver");
    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/livros","root","root");
    System.out.println("Conectado");   
              
   }catch(ClassNotFoundException ex){
       System.out.println("Classe não encontrada, adicione o driver a biblioteca");
       Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
       
   }catch(SQLException e){
       System.out.println(e);
       throw new RuntimeException(e);
   }
    
}

}
