package br.edu.ifce.emprestimo.model;

public class Transacao {
	
	private static int contadorDeTransacao = 0;
	private int clienteId;
	private String clienteNome;
	private String tipo;
	private double valor;
	
	public Transacao() {
		contadorDeTransacao++;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getClienteNome() {
		return clienteNome;
	}
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	public static void setContadorDeTransacao(int contadorDeTransacao) {
		Transacao.contadorDeTransacao = contadorDeTransacao;
	}
	public int getContadorDeTransacao() {
		return contadorDeTransacao;
	}
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
