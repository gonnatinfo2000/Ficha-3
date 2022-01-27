import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<ContaBancaria> contasBancarias;
	private List<Casa> casas;
	
	public Banco(String aNome) {
		nome = aNome;
		contasBancarias = new ArrayList<ContaBancaria>(100);
		casas = new ArrayList<Casa>();
	}

	public List<ContaBancaria> getContasBancarias() {
		return contasBancarias;
	}

	public void setContasBancarias(List<ContaBancaria> contasBancarias) {
		this.contasBancarias = contasBancarias;
	}	
	
	public List<Casa> getCasas() {
		return casas;
	}

	public void setCasas(List<Casa> casas) {
		this.casas = casas;
	}

	public void criaConta(ContaBancaria contaBancaria) {
		contasBancarias.add(contaBancaria);
	}
	
	public List<ContaBancaria> getConta(String titular) {
		return getContasBancarias();
	}
	
	public void adicionarCasa(Casa casa) {
		casas.add(casa);
	}
	
	public void receberMorada(String morada) {
		casas.remove(morada);
	}
	
	public double getLucroPrevisto() {
		double lucro = 0;
		for(Casa casa: casas) {
			lucro += casa.getMargemLucro();
		}
		return lucro;
	}
	
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Abílio");
		conta.criaConta(conta);
		System.out.println(conta.getConta(conta.getTitular()));
		conta.depositar(7.00);
		System.out.println(conta.getInformacaoConta());
		conta.levantar(3.50);
		System.out.println(conta.getInformacaoConta());
		conta.levantar(6.00);
		
		Casa casa1 = new Casa("Cidade Zaachi");
		casa1.setPrecoCusto(150.00);
		casa1.setPrecoVenda(300.00);
		
		Casa casa2 = new Casa("Cidade da Lua");
		casa2.setPrecoCusto(300.00);
		casa2.setPrecoVenda(500.00);
		
		Casa casa3 = new Casa("Cidade Zaachi");
		casa3.setPrecoCusto(100.00);
		casa3.setPrecoVenda(250.00);
		
		conta.adicionarCasa(casa1);
		conta.adicionarCasa(casa2);
		conta.adicionarCasa(casa3);
		
		System.out.println(conta.getLucroPrevisto());
	}
	
}
