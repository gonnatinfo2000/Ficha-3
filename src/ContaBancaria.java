import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ContaBancaria extends Banco{

		private String titular;
		private double saldo = 0.00f;
		private LocalDate dataAbertura = LocalDate.now();
		
		public ContaBancaria(String aTitular) {
			super(aTitular);
			titular = aTitular;
			dataAbertura = LocalDate.now();
			saldo = 0.00f;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public String getTitular() {
			return titular;
		}

		public LocalDate getDataAbertura() {
			return dataAbertura;
		}
		
		public String getInformacaoConta() {
		    DateTimeFormatter FormatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    String informacao = "Titular: " + titular + "\nSaldo: €" + String.format("%.2f", saldo) + "\nData Abertura: " + FormatDate.format(dataAbertura);
		    return informacao;
		}
		
		public void depositar(double valorAdepositar) {
			saldo += valorAdepositar;
		}
		
		public void levantar(double valorAlevantar) {
			if(valorAlevantar > saldo) {
				System.out.println("Não é possível continuar a ação.");
			}else{
				saldo -= valorAlevantar;
			}
		}
		
		public static void main(String[] args) {
			ContaBancaria conta = new ContaBancaria("Gonçalo");
			conta.depositar(5.99);
			System.out.println(conta.getInformacaoConta());
			conta.levantar(4.00);
			System.out.println(conta.getInformacaoConta());
			conta.levantar(6.00);
			System.out.println(conta.getInformacaoConta());
		}

}
