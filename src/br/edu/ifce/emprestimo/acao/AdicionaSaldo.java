package br.edu.ifce.emprestimo.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.emprestimo.model.Banco;

public class AdicionaSaldo implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Banco b = new Banco();
		try {
			
			String valor = request.getParameter("saldo");
			b.adicionarSaldo(Double.parseDouble(valor));
			
			return "redirect:main?acao=ListaClientes";
		} catch (NumberFormatException | NullPointerException e) {
			return "forward:adicionaSaldo.jsp";
		}
		
	}

}
