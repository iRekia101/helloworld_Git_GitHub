
	public class Equipa {
	  

		// =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	      private int codigoEquipa;
	      private String nomeEquipa;
	      private String jogadores;
	      private String treinadores;
	      private String escalao;


	    // =======================================================
	    // ============ ACESSORES e MODIFICADORES ===============
	    // =======================================================

	  	public int getCodigoEquipa() {
	  		return codigoEquipa;
	  	}
	  	public void setCodigoEquipa(int codigoEquipa) {
	  		this.codigoEquipa = codigoEquipa;
	  	}
	  	public String getNomeEquipa() {
	  		return nomeEquipa;
	  	}
		public void setNomeEquipa(String nomeEquipa) {
	  		this.nomeEquipa = nomeEquipa;
	  	}
	  	public String getJogadores() {
	  		return jogadores;
	  	}
	  	public void setJogadores(String jogadores) {
	  		this.jogadores = jogadores;
	  	}
	  	public String getTreinadores() {
	  		return treinadores;
	  	}
	  	public void setTreinadores(String treinadores) {
	  		this.treinadores = treinadores;
	  	}
		public String getEscalao() {
			return escalao;
		}
		public void setEscalao(String escalao) {
			this.escalao = escalao;
		}

	    // =======================================================
	    // =================== CONSTRUTORES =====================
	    // =======================================================

	  
	   
	    // CONSTRUTOR DEFAULT
		public Equipa() {
		}

	    // CONSTRUTOR COM PAR�METROS

		public Equipa(int codigoEquipa, String nomeEquipa, String jogadores, String treinadores, String escalao) {
			super();
			this.codigoEquipa = codigoEquipa;
			this.nomeEquipa = nomeEquipa;
			this.jogadores = jogadores;
			this.treinadores = treinadores;
			this.escalao = escalao;
		
		
			// TODO Auto-generated constructor stub
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
				return "Equipa [codigoEquipa=" + codigoEquipa + ", nomeEquipa=" + nomeEquipa + ", jogadores=" + jogadores
						+ ", treinadores=" + treinadores + ", escalao=" + escalao + "]";
			}

	    // ----> equals()
	}

