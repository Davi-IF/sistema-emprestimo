package br.edu.ifce.emprestimo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static double saldoPlutolomeu = 0.0;
	private static Integer idClientes = 1;
	
	private static List<Cliente> clientes = new ArrayList<Cliente>();
	private static List<Transacao> todasTransacaos = new ArrayList<Transacao>();

	static {
		Cliente c = new Cliente("João da Silva", "João", "000", "000", 21);
		clientes.add(c);
		idClientes++;
		saldoPlutolomeu += 10000;
	}

	public void adicionarSaldo(double valor) {
		saldoPlutolomeu += valor;
	}

	public void emprestimo(double valor) {
		saldoPlutolomeu -= valor;
	}

	public double getSaldo() {
		return saldoPlutolomeu;
	}

	public void apagarTransacoes() {
		todasTransacaos.clear();
	}

	public void addCliente(Cliente c) {
		c.setClienteId(idClientes);
		clientes.add(c);
		idClientes++;
	}

	public void addTransacao(Transacao t) {
		todasTransacaos.add(t);
		Cliente c = this.getCliente(t.getClienteId());
		c.adicionarTransacao(t);
	}

	public Cliente getCliente(int idCliente) {
		for(Cliente c : clientes) {
			if(c.getClienteId() == idCliente) {
				return c;
			}
		}
		
		return null;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Transacao> getTodasTransacoes() {
		// TODO Auto-generated method stub
		return todasTransacaos;
	}

	public void recebimento(Double valor) {
		// TODO Auto-generated method stub
		this.saldoPlutolomeu += valor;
	}

	public void matarCliente(int i) {
		// TODO Auto-generated method stub
		Iterator<Cliente> it = clientes.iterator();

		while (it.hasNext()) {
			Cliente emp = it.next();

			if (emp.getClienteId() == i) {
				it.remove();
			}
		}
		
		limparRegistros(i);
	}

	private void limparRegistros(int i) {
		// TODO Auto-generated method stub
		Iterator<Transacao> it = todasTransacaos.iterator();
		
		while(it.hasNext()){
			Transacao t = it.next();
			
			if(t.getClienteId() == i) {
				it.remove();;
			}
		}
	}

}
