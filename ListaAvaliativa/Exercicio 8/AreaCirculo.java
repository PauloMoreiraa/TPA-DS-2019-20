import java.util.Scanner;
public class AreaCirculo extends Area {
	
	private double raio;
	private final double pi = 3.14;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getPi() {
		return pi;
	}
	
	public void contaCirculo() {
		
		areaCirculo = pi * (raio * raio);
		
	}
	
	public void apresentarAreaCirculo() {
		System.out.println("Digite o valor do raio :"+getRaio());
		System.out.println("Area do Circulo : "+getAreaCirculo());
		
	}
	
}
	
	
