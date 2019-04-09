package br.edu.ifce.emprestimo.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.emprestimo.model.Banco;
import br.edu.ifce.emprestimo.model.Cliente;

public class AlteraCliente implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String apelido = request.getParameter("apelido");
		String rg = request.getParameter("rg");
		String cpf = request.getParameter("cpf");
		int idade = Integer.parseInt(request.getParameter("idade"));
		
		Banco b = new Banco();
		Cliente c = b.getCliente(id);
		
		c.setApelido(apelido);
		c.setCpf(cpf);
		c.setIdade(idade);
		c.setNome(nome);
		c.setRg(rg);
		
		return "redirect:main?acao=ListaClientes";
	}

}
