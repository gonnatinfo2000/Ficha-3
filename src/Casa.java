
public class Casa extends Banco{
	private static String aNome;
	private String morada;
	private double precoCusto;
	private double precoVenda;
	
	public Casa(String aMorada) {
		super(aNome);
		this.morada = aMorada;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	};
	
	public double getMargemLucro() {
		double diferenca = precoVenda - precoCusto;
		return diferenca;
	}
	
	public double getPercentMargemLucro() {
		double razao = (precoVenda - precoCusto);
		double percentage = (razao) / 100;
		return percentage;
	}
	
	public static void main(String[] args) {
		
		Casa casa1 = new Casa("Cidade Zaachi");
		casa1.setPrecoCusto(150.00);
		casa1.setPrecoVenda(300.00);
		
		Casa casa2 = new Casa("Cidade da Lua");
		casa2.setPrecoCusto(300.00);
		casa2.setPrecoVenda(500.00);
		
		Casa casa3 = new Casa("Cidade Zaachi");
		casa3.setPrecoCusto(100.00);
		casa3.setPrecoVenda(250.00);
		
		System.out.println("Morada: " + casa1.getMorada() + "\nPreço de custo: " + casa1.getPrecoCusto() + "\nPreço de venda: " + casa1.getPrecoVenda());
		System.out.println("Margem de lucro: " + casa1.getMargemLucro());
		System.out.println("Percentagem: " + casa1.getPercentMargemLucro() + "%");
		System.out.println("\n");
		
		System.out.println("Morada: " + casa2.getMorada() + "\nPreço de custo: " + casa2.getPrecoCusto() + "\nPreço de venda: " + casa2.getPrecoVenda());
		System.out.println("Margem de lucro: " + casa2.getMargemLucro());
		System.out.println("Percentagem: " + casa2.getPercentMargemLucro() + "%");
		System.out.println("\n");
		
		System.out.println("Morada: " + casa3.getMorada() + "\nPreço de custo: " + casa3.getPrecoCusto() + "\nPreço de venda: " + casa3.getPrecoVenda());
		System.out.println("Margem de lucro: " + casa3.getMargemLucro());
		System.out.println("Percentagem: " + casa3.getPercentMargemLucro() + "%");
		System.out.println("\n");
		
	}
	
}
