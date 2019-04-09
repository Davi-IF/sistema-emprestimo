package br.edu.ifce.emprestimo.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.emprestimo.model.Banco;
import br.edu.ifce.emprestimo.model.Transacao;

public class TodasTransacoes implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Banco b = new Banco();
		List<Transacao> lista = b.getTodasTransacoes();
		
		request.setAttribute("saldo", b.getSaldo());
		request.setAttribute("transacoes", lista);
		
		return "forward:transacoesTotais.jsp";
	}

}
