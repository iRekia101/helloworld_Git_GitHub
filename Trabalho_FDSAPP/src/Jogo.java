import java.util.Date;

	public class Jogo {
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	      private String equipaVisitante;
	      private int golosEquipaVisitante;
	      private String equipaVisitada;
	      private int golosEquipaVisitada;
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
	  	public int getGolosEquipaVisitante() {
	  		return golosEquipaVisitante;
	  	}
	  	public void setGolosEquipaVisitante(int golosEquipaVisitante) {
	  		this.golosEquipaVisitante = golosEquipaVisitante;
	  	}
	  	public String getEquipaVisitada() {
	  		return equipaVisitada;
	  	}
	  	public void setEquipaVisitada(String equipaVisitada) {
	  		this.equipaVisitada = equipaVisitada;
	  	}
	  	public int getGolosEquipaVisitada() {
	  		return golosEquipaVisitada;
	  	}
	  	public void setGolosEquipaVisitada(int golosEquipaVisitada) {
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

	   public Jogo () {
		   
	   }

	    // CONSTRUTOR COM PAR�METROS
	 	public Jogo(String equipaVisitante, int golosEquipaVisitante, String equipaVisitada, int golosEquipaVisitada,
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
	    // ============== M�TODOS COMPLEMENTARES ==============
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

