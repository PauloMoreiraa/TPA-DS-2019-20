import java.util.Scanner;
public class UsarArea {
	public static void main(String[] args) {
	
	AreaQuadradro quadradro = new AreaQuadradro();
	
	quadradro.setBase(8);
	quadradro.setAltura(2);
	quadradro.conta();
	quadradro.apresentarArea();
	
	
	AreaTriangulo triangulo = new AreaTriangulo();
	
	triangulo.setBase(12);
	triangulo.setAltura(2);
    triangulo.contaTriangulo();
    triangulo.apresentarAreaTriangulo();
    
    
    AreaRetangulo retangulo = new AreaRetangulo();
    retangulo.setBase(10);
    retangulo.setAltura(10);
    retangulo.contaTriangulo();
    retangulo.apresentarAreaRetangulo();
    
    
    AreaCirculo circulo = new AreaCirculo();
    circulo.setRaio(6);
    circulo.contaCirculo();
    circulo.apresentarAreaCirculo();

	
	
	}
	

}
