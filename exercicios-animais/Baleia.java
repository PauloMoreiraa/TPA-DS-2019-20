import java.util.Scanner;

	
	public class Baleia extends Animal implements AnimalSelvagem{
		
		boolean atacando;
		boolean mordendo;
		boolean ca�ando;
		
		public void atacar() {
			if(atacando == true) {
				System.out.println("Esta em ataque");
			}
		}
		
		public void morder() {
			if(mordendo == true) {
				System.out.println("Vai morder");
			}
			
			
		}
		
		public void ca�ar() {
			if(ca�ando == true) {
				System.out.println("Esta ca�ando");
			}
		}

}
