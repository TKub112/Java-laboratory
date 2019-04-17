	public class Firma extends Wpis{
		private String name;
		private String adress;
		NrTelefoniczny nr;


		public void Opis()
		{ System.out.println(this.name+" "+this.adress+" "+ this.nr.nrkierunkowy+this.nr.nrTelefonu);}

		public Firma(String name, String adress,NrTelefoniczny nrr) {
			this.name = name;
			this.adress = adress;
			this.nr = nrr;
		}
	}