package br.imd.visao;

import java.sql.SQLException;

import br.imd.controle.Persistencia;
import br.imd.modelo.Cliente;

public class Principal {
	static Persistencia persistencia;
	
	public static void main(String args[]) throws SQLException{
		persistencia = new Persistencia();
		
		Cliente c = new Cliente();
		c.setNome("Jessica Claire Biel");
		c.setCpf("344.123.678-99");
		
		persistencia.inserirCliente(c);
		
	}
}
