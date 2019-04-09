package br.edu.ifce.emprestimo.acao;

import java.io.IOException;
import java.util.List;
import br.edu.ifce.emprestimo.model.Cliente;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.emprestimo.model.Banco;

public class ListaClientes implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Banco b = new Banco();
		List<Cliente> lista = b.getClientes();
		
		request.setAttribute("saldo", b.getSaldo());
		request.setAttribute("clientes", lista);
		
		return "forward:listaClientes.jsp";
	}

}
