package br.edu.ifce.emprestimo.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.emprestimo.model.Banco;
import br.edu.ifce.emprestimo.model.Cliente;

public class MatarCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Banco b = new Banco();
		Cliente c = b.getCliente(Integer.parseInt(request.getParameter("id")));
		
		b.matarCliente(c.getClienteId());	
		
		return "redirect:main?acao=ListaClientes";
	}

}
