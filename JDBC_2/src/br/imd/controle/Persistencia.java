package br.imd.controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.imd.modelo.Cliente;

public class Persistencia {
	private static Connection conn;
	private static PreparedStatement prstmt;
	private static Statement stmt;
	private static ResultSet rs;
	
	public Persistencia() throws SQLException{
		conn = Conexao.getConnection();
		conn.setAutoCommit(false);
	}
	
	public static void inserirCliente(Cliente cliente) throws SQLException{
		String sql = "insert into cliente values (default, ?, ?)";
		prstmt = Conexao.getConnection().prepareStatement(sql);
		
		prstmt.setString(1,  cliente.getNome());
		prstmt.setString(2, cliente.getCpf());
		prstmt.execute();
		conn.commit();
		System.out.println("Cliente " +	cliente.getNome()+ " cadastrado.");
		prstmt.close();

	}
	
	public static void consultarCliente(String cpf) throws SQLException{
		String sql = "select * from cliente where cpf = '" + cpf + "'";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			System.out.println("Id: " + rs.getInt("idcliente") + " "+
								rs.getString("nome") + " " + 
								rs.getString("cpf"));
		
		}
		rs.close();
		stmt.close();
	}

}
