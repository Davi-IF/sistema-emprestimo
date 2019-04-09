package br.edu.ifce.emprestimo.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.emprestimo.model.Banco;
import br.edu.ifce.emprestimo.model.Cliente;

public class MostraCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idCliente = Integer.parseInt(request.getParameter("id"));
		String jsp = request.getParameter("jsp");
		
		Banco b = new Banco();
		Cliente c = b.getCliente(idCliente);
		
		request.setAttribute("cliente", c);
		request.setAttribute("saldo", b.getSaldo());
		
		return "forward:"+jsp;
	}

}
