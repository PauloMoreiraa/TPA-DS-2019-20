import java.util.Scanner;
public class AreaQuadradro extends Area {
	
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void conta() {
		
		areaQuadradro = base * altura;
		
	}
	public void apresentarArea() {
		System.out.println("Digite o valor da base :"+getBase());
		System.out.println("Digite o valor da altura :"+getAltura());
		System.out.println("Area do Quadradro : "+getAreaQuadradro());
		System.out.println("________");
	}


}
