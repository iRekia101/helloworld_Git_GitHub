import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

	public class Jogo {
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	      private String equipaVisitante;
	      private int golosEquipaVisitante;
	      private String equipaVisitada;
	      private int golosEquipaVisitada;
	      private LocalDate data;
	      private int jornada;
	      private List <Arbitro> arbitros = new ArrayList <Arbitro>();
	      
	      


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
	  	public LocalDate getData() {
	  		return data;
	  	}
	  	public void setData(LocalDate data) {
	  		this.data = data;
	  	}
	  	public int getJornada() {
	  		return jornada;
	  	}
	  	public void setJornada(int jornada) {
	  		this.jornada = jornada;
	  	}
	 	public List<Arbitro> getArbitros() {
			return arbitros;
		}

		public void setArbitros(List<Arbitro> arbitros) {
			this.arbitros = arbitros;
		}
		
	    public void addArbitro (Arbitro Arbitro) {
	    	this.arbitros.add(Arbitro);
	    }


	    // =======================================================
	    // =================== CONSTRUTORES =====================
	    // =======================================================

	  
	   
	    // CONSTRUTOR DEFAULT

	   public Jogo () {
		   
	   }

	    // CONSTRUTOR COM PARÂMETROS
	 	public Jogo(String equipaVisitante, int golosEquipaVisitante, String equipaVisitada, int golosEquipaVisitada,
				LocalDate data, int jornada) {
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
			return "Jogo [equipaVisitante=" + equipaVisitante + ", golosEquipaVisitante=" + golosEquipaVisitante
					+ ", equipaVisitada=" + equipaVisitada + ", golosEquipaVisitada=" + golosEquipaVisitada + ", data="
					+ data + ", jornada=" + jornada + ", arbitros=" + arbitros + "]";
		}
	    // ----> equals()
	}

