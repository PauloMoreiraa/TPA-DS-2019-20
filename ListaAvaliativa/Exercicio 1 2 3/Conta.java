import java.util.Scanner;

public class Conta {
	
	private String nomeTitular;
	private int numeroConta;
	private String agencia;
	private double saldo;
	private String dataAbertura;
		


public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
public void sacar(double valor) {
	
	saldo = saldo - valor;
	
}
public void depositar(double valor) {
	
	saldo = saldo + valor;
	
}
public void calcularRendimento() {
	saldo = saldo*0.1;
	
	
}
public void recuperarDadosParaImpressao() {
	

	
}
public void mostrar() {
	System.out.println("Nome Titular : "+getNomeTitular());
	System.out.println("Numero Conta : "+getNumeroConta());
	System.out.println("Agencia : "+getAgencia());
	System.out.println("Saldo R$: "+getSaldo());
	System.out.println("Data Abertura : "+getDataAbertura());
}

}



