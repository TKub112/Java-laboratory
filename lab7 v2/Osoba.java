	public class Osoba extends Wpis{
		private String name;
		private String surname;
		private String adress;
		NrTelefoniczny nr;

		public void Opis()
		{ System.out.println(this.name+" "+this.surname+" "+this.adress+" "+ this.nr.nrkierunkowy+this.nr.nrTelefonu);}

		/*public String toString(){//overriding the toString() method
			return this.Opis();
		}*/
		public Osoba(String name, String surname, String adress, NrTelefoniczny nrr) {
			this.name = name;
			this.surname = surname;
			this.adress = adress;
			this.nr = nrr;
		}
	}