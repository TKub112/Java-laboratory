	public class NrTelefoniczny implements Comparable<NrTelefoniczny> {

		public String nrkierunkowy;
		public String nrTelefonu;
		private String nr;
		public NrTelefoniczny() {


		}
		public NrTelefoniczny(String nrkierunkowy,String nrTelefonu) {

			this.nrkierunkowy = nrkierunkowy;
			this.nrTelefonu=nrTelefonu;
			this.nr = nrkierunkowy + "-" + nrTelefonu;
		}

		public String toString(){//overriding the toString() method
			return "nr kierunkowy: "+nrkierunkowy+" nr telefonu: "+nrTelefonu;
		}


		public int compareTo(NrTelefoniczny n) {
			return nr.compareTo(n.nr);
		}

	}