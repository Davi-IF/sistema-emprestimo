package br.edu.ifce.emprestimo.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.emprestimo.model.Banco;
import br.edu.ifce.emprestimo.model.Cliente;

public class AdicionaCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			Cliente c = new Cliente();
			Banco b = new Banco();
			
			c.setNome(request.getParameter("nome"));
			c.setApelido(request.getParameter("apelido"));
			c.setRg(request.getParameter("rg"));
			c.setCpf(request.getParameter("cpf"));
			c.setIdade(Integer.parseInt(request.getParameter("idade")));	
			
			b.addCliente(c);
			
			return "redirect:main?acao=ListaClientes";
		} catch (NumberFormatException | NullPointerException e) {
			
			return "forward:formCadastroCliente.jsp";
		}
	}

}
