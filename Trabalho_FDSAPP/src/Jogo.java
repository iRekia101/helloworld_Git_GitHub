import java.util.Date;

	public class Jogo {
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	      private String equipaVisitante;
	      private String golosEquipaVisitante;
	      private String equipaVisitada;
	      private String golosEquipaVisitada;
	      private Date data;
	      private int jornada;
	      
	      


	    // =======================================================
	    // ============ ACESSORES e MODIFICADORES ===============
	    // =======================================================
	      

	  	public String getEquipaVisitante() {
	  		return equipaVisitante;
	  	}
	 
		public void setEquipaVisitante(String equipaVisitante) {
	  		this.equipaVisitante = equipaVisitante;
	  	}
	  	public String getGolosEquipaVisitante() {
	  		return golosEquipaVisitante;
	  	}
	  	public void setGolosEquipaVisitante(String golosEquipaVisitante) {
	  		this.golosEquipaVisitante = golosEquipaVisitante;
	  	}
	  	public String getEquipaVisitada() {
	  		return equipaVisitada;
	  	}
	  	public void setEquipaVisitada(String equipaVisitada) {
	  		this.equipaVisitada = equipaVisitada;
	  	}
	  	public String getGolosEquipaVisitada() {
	  		return golosEquipaVisitada;
	  	}
	  	public void setGolosEquipaVisitada(String golosEquipaVisitada) {
	  		this.golosEquipaVisitada = golosEquipaVisitada;
	  	}
	  	public Date getData() {
	  		return data;
	  	}
	  	public void setData(Date data) {
	  		this.data = data;
	  	}
	  	public int getJornada() {
	  		return jornada;
	  	}
	  	public void setJornada(int jornada) {
	  		this.jornada = jornada;
	  	}


	    // =======================================================
	    // =================== CONSTRUTORES =====================
	    // =======================================================

	  
	   
	    // CONSTRUTOR DEFAULT

	   

	    // CONSTRUTOR COM PARÂMETROS
	 	public Jogo(String equipaVisitante, String golosEquipaVisitante, String equipaVisitada, String golosEquipaVisitada,
				Date data, int jornada) {
			super();
			this.equipaVisitante = equipaVisitante;
			this.golosEquipaVisitante = golosEquipaVisitante;
			this.equipaVisitada = equipaVisitada;
			this.golosEquipaVisitada = golosEquipaVisitada;
			this.data = data;
			this.jornada = jornada;
		}


	    // =======================================================
	    // =================== .COMPORTAMENTOS ==================
	    // =======================================================




	    // =======================================================
	    // ============== MÉTODOS COMPLEMENTARES ==============
	    // =======================================================

	    // ----> toString()
	     
	 	@Override
		public String toString() {
			return "Jogos [equipaVisitante=" + equipaVisitante + ", golosEquipaVisitante=" + golosEquipaVisitante
					+ ", equipaVisitada=" + equipaVisitada + ", golosEquipaVisitada=" + golosEquipaVisitada + ", data="
					+ data + ", jornada=" + jornada + "]";
		}

	    // ----> equals()
	}

