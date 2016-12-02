package main; 

import java.io.Console;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.postgresql.util.PSQLException;

import main.connection.DBConnection;
import main.util.CryptoPassword;

public class CreateUser {
	
	public static void main(String[] args){
		
		if(args == null || args.length < 1){
			System.out.println("Erro! Digite o seguinte comando: ");
			System.out.println("java -cp CreateUserOLX_SAC-1.0.0-SNAPSHOT-jar-with-dependencies.jar main.CreateUser login. ");
			System.out.println("Onde login é o nome do usuário. ");
			System.exit(1);
		}
		
		Console console = System.console();
	    if (console == null) {
	        System.out.println("Erro ao instanciar o Console.");
	        System.exit(0);
	    }
		
	    char passwordArray[] = console.readPassword("Digite a senha do usuário: ");
	    boolean isAdmin = console.readLine("O usuário "+args[0]+" é administrador? (S/N) ").equalsIgnoreCase("S");
	    
		Connection con = DBConnection.getConnection();
		
		StringBuilder sql = new StringBuilder();
		sql.append("insert into olx_sac.usuario_login (login, senha, admin) values (?, ?, ?) ");
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql.toString());
			
			ps.setString(1, args[0]);			
			ps.setString(2, CryptoPassword.convertStringToMd5(String.valueOf(passwordArray)));
			ps.setBoolean(3, isAdmin);
			
			ps.executeUpdate();
			
			System.out.println(String.format("Usuário %s cadastrado com sucesso!!!", args[0]));
			
		}
		catch(PSQLException e){
			if(e.getMessage().contains("duplicate key value")){
				System.out.println(String.format("O usuário %s já existe!!!", args[0]));
				e.printStackTrace();
			}
		}
		catch (SQLException e) {
			System.out.println("Erro com o banco de dados.");
			e.printStackTrace();
		}
		finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("Erro ao fechar o banco de dados.");
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
