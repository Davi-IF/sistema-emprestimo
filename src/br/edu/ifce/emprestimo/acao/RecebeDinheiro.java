package br.edu.ifce.emprestimo.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifce.emprestimo.model.Banco;
import br.edu.ifce.emprestimo.model.Cliente;
import br.edu.ifce.emprestimo.model.Transacao;

public class RecebeDinheiro implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Banco b = new Banco();
		Cliente c = b.getCliente(Integer.parseInt(request.getParameter("id")));
		Transacao t = new Transacao();
		
		Double valor = Double.parseDouble(request.getParameter("valor"));
		
		t.setValor(valor);
		t.setClienteId(c.getClienteId());
		t.setClienteNome(c.getNome());
		t.setTipo("Recebimento");
		
		c.pagamento(valor);
		b.recebimento(valor);
		b.addTransacao(t);
		
		
		return "redirect:main?acao=ListaClientes";
	}

}
