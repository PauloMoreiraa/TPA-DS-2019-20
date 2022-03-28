
public class Empregado {

		private String nome;
		private String sobrenome;
		private double salarioMensal;
		
		public Empregado(String nome, String sobrenome, double salarioMensal) {
			super();
			this.nome = nome;
			this.sobrenome = sobrenome;
			if(salarioMensal >= 0) this.setSalarioMensal(salarioMensal);
			else this.setSalarioMensal(0);
		}
		public void aumentarSalario(double porcentagem){
			double aumenta = (this.getSalarioMensal() * porcentagem) / 100;
			this.setSalarioMensal(this.getSalarioMensal() + aumenta);
			System.out.println("-> O salário mensal de "+this.getNome()+" sofreu um aumento de "+porcentagem+"%\n");
		}
		
		public void reduzirSalario(double porcentagem){
			double reduz = (this.getSalarioMensal() * porcentagem) / 100;
			this.setSalarioMensal(this.getSalarioMensal() - reduz);
			System.out.println("-> O salário mensal de "+this.getNome()+" sofreu uma baixa de "+porcentagem+"%\n");
		}
		
		public void mostraTrabalhador() {
		    System.out.println("Trabalhador: " + this.getNome() + " " + this.getSobrenome());
		    System.out.println("Salário Anual: R$" + this.getSalarioMensal() * 12 + "\n");
		}
		protected String getNome() {
			return nome;
		}

		protected void setNome(String nome) {
			this.nome = nome;
		}
		
		protected String getSobrenome() {
			return sobrenome;
		}
		
		protected void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		
		protected double getSalarioMensal() {
			return salarioMensal;
		}
		
		protected void setSalarioMensal(double salarioMensal) {
			this.salarioMensal = salarioMensal;
		}
}
