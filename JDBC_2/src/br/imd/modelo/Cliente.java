package br.imd.modelo;

public class Cliente {

	private int cliente;
	private String nome;
	private String cpf;
	
	public Cliente(int cliente, String nome, String cpf) {
		super();
		this.cliente = cliente;
		this.nome = nome;
		this.cpf = cpf;
	}

	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
