import java.util.Scanner;
public class AreaTriangulo extends Area {
	
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
	
	public void contaTriangulo() {
		
		areaTriangulo = (base * altura) / 2;
	}
    public void apresentarAreaTriangulo() {
		System.out.println("Digite o valor da base :"+getBase());
		System.out.println("Digite o valor da altura :"+getAltura());
		System.out.println("Area do Triangulo : "+getAreaTriangulo());
		 System.out.println("________");
	}

}
