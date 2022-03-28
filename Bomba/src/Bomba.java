public class Bomba {
	private boolean status;
	public void ligar(int t) {
		if(!getStatus()) {
			setStatus(true);
			System.out.println("Bomba ligada");
			tempo(t);
			this.checar();
	}else System.out.println("A bomba já está ligada");
	}
	public void desligar() {
		if(getStatus()) setStatus(false);
		else 
		System.out.println("A bomba já está desligada");
	}
	private void tempo(int tempo){
		for(; tempo>=0; tempo--) {
			System.out.println("Desligando em "+tempo+" segundo(s)");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		this.setStatus(false);
	}
	private void checar() {
		if(getStatus()) System.out.println("A bomba está ligada");
		else System.out.println("Bomba desligada");
	}
	private boolean getStatus() {
		return this.status;
	}
	private void setStatus(boolean n) {
		this.status = n;
	}

}
	
