package br.edu.ifce.emprestimo.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.emprestimo.model.Banco;
import br.edu.ifce.emprestimo.model.Cliente;

public class ApagarRegistros implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Banco b = new Banco();
		b.apagarTransacoes();
		
		List<Cliente> lista = b.getClientes();
		
		for(Cliente c : lista) {
			c.apagaTransacoes();
		}
		
		return "redirect:main?acao=ListaClientes";
	}

}
