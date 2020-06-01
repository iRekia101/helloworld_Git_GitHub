import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

	public class Jogo {
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	      private Equipa equipaVisitante;
	      private int golosEquipaVisitante;
	      private Equipa equipaVisitada;
	      private int golosEquipaVisitada;
	      private LocalDate data;
	      private int jornada;
	      private List <Arbitro> arbitros = new ArrayList <Arbitro>();
	      
	      


	    // =======================================================
	    // ============ ACESSORES e MODIFICADORES ===============
	    // =======================================================
	      

	 
		public Equipa getEquipaVisitante() {
	  		return equipaVisitante;
	  	}
		public void setEquipaVisitante(Equipa equipaVisitante) {
	  		this.equipaVisitante = equipaVisitante;
	  	}
	  	public int getGolosEquipaVisitante() {
	  		return golosEquipaVisitante;
	  	}
	  	public void setGolosEquipaVisitante(int golosEquipaVisitante) {
	  		this.golosEquipaVisitante = golosEquipaVisitante;
	  	}
	  	public Equipa getEquipaVisitada() {
	  		return equipaVisitada;
	  	}
	  	public void setEquipaVisitada(Equipa equipaVisitada) {
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
	 	public Jogo(Equipa equipaVisitante, int golosEquipaVisitante, Equipa equipaVisitada, int golosEquipaVisitada,
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
	 	 public void eliminarArbitro(int id) {
        	 for (int i = 0; i < arbitros.size(); i++) {
        		if(id == this.arbitros.get(i).getId()) {
        			arbitros.remove(i);
        			System.out.println("Arbitro removido");
        		}
        	 } 
         }
	 	 public void AlterarArbitro(int id,Arbitro Arbitro) {
       	      for (int i = 0; i < arbitros.size(); i++) {
                  eliminarArbitro(id);
                  addArbitro(Arbitro);
             }
        }
          
	 	 public void AdicionarGolo(int id)  {
	 		 if(id == equipaVisitante.getCodigoEquipa()) {
	 			golosEquipaVisitante ++;
	 		 }else if (id == equipaVisitada.getCodigoEquipa()) {
	 			 golosEquipaVisitada ++;
	 		 }else {
	 			 System.out.println("O id esta incorreto");
	 		 }
	 			 
	 	 }
	 	 
	 	 public void RemoverGolo(int id)  {
	 		 if(id == equipaVisitante.getCodigoEquipa()) {
	 			golosEquipaVisitante --;
	 		 }else if (id == equipaVisitada.getCodigoEquipa()) {
	 			 golosEquipaVisitada --;
	 		 }else {
	 			 System.out.println("O id esta incorreto");
	 		 }
	 			 
	 	 }
	 	 


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

