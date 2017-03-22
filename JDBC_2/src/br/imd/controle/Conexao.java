package br.imd.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static String url = "jdbc:postgresql://localhost/jdbc2";
	public static String user = "aecio";
	public static String pass = "123";
	private static Connection conexao;
	
	public static Connection getConnection() throws SQLException{
		if (conexao == null){
			conexao = openConnection();
		}
		return conexao;
	}
	public static Connection openConnection() throws SQLException{
		try{
			conexao = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexao estabelecida");
		} catch (Exception e){
			System.out.println("Erro!");
		}
		return conexao;
	}
	
}
