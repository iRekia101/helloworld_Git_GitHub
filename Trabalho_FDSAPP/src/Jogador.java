
	public class Jogador extends Participantes {
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	   
	    private String posicao;
	    private String pePreferido;

	  
	    // =======================================================
	    // ============ ACESSORES e MODIFICADORES ===============
	    // =======================================================
	    

		public String getPosicao() {
			return posicao;
		}
		public void setPosicao(String posicao) {
			this.posicao = posicao;
		}
		public String getPePreferido() {
			return pePreferido;
		}
		public void setPePreferido(String pePreferido) {
			this.pePreferido = pePreferido;
		}


	    // =======================================================
	    // =================== CONSTRUTORES =====================
	    // =======================================================

	  
	   
	    // CONSTRUTOR DEFAULT
           public Jogador () {
        	   
           }
	   

	    // CONSTRUTOR COM PAR�METROS
		public Jogador(String posicao,String pePreferido) {
			super();
			
			this.posicao = posicao;
			this.pePreferido = pePreferido;
		}


	    // =======================================================
	    // =================== .COMPORTAMENTOS ==================
	    // =======================================================




	    // =======================================================
	    // ============== M�TODOS COMPLEMENTARES ==============
	    // =======================================================

	    // ----> toString()
		
		@Override
		public String toString() {
			return "Jogadores [ posicao=" + posicao + ", pePreferido=" + pePreferido + "]";
		}

	    // ----> equals()
	}

