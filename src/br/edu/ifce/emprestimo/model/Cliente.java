package br.edu.ifce.emprestimo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int clienteId;
	private String nome;
	private String apelido;
	private String cpf;
	private String rg;
	private int idade;
	private double saldo = 0.0;
	
	private List<Transacao> transacoes = new ArrayList<Transacao>(); 
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String apelido, String rg, String cpf, int idade) {
		this.nome = nome;
		this.apelido = apelido;
		this.rg = rg;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	
	public void adicionarTransacao(Transacao t) {
		transacoes.add(t);
	}
	
	public List<Transacao> getTransacoes(){
		return this.transacoes;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void pagamento(Double valor) {
		// TODO Auto-generated method stub
		this.saldo -= valor;
	}

	public void apagaTransacoes() {
		// TODO Auto-generated method stub
		transacoes.clear();
	}
}
