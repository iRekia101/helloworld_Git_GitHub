
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

	public class Competicao {
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	       private int codigo;
	       private String nome;
	       private LocalDate dataInicio;
	       private LocalDate dataFim;
	       private List <Equipa> equipas = new ArrayList <Equipa>();
	       private List <Jogo> jogos = new ArrayList <Jogo> ();
	       private String escalao;
	       


	    // =======================================================
	    // ============ ACESSORES e MODIFICADORES ===============
	    // =======================================================
	       
	 
		public int getCodigo() {
			return codigo;
		}
		
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public LocalDate getDataInicio() {
			return dataInicio;
		}
		public void setDataInicio(LocalDate dataInicio) {
			this.dataInicio = dataInicio;
		}
		public LocalDate getDataFim() {
			return dataFim;
		}
		public void setDataFim(LocalDate dataFim) {
			this.dataFim = dataFim;
		}
		
		public List<Equipa> getEquipas() {
			return equipas;
		}

		public void setEquipas(List<Equipa> equipas) {
			this.equipas = equipas;
		}
		
		public void addEquipa(Equipa equipa) {
			this.equipas.add(equipa);
		}
		
		public void removeEquipa(Equipa equipa) {
			this.equipas.remove(equipa);
		}

	  	public List<Jogo> getJogos() {
			return jogos;
		}

		public void setJogos(List<Jogo> jogos) {
			this.jogos = jogos;
		}
		public void addJogo(Jogo Jogo) {
			this.jogos.add(Jogo);
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
	     public Competicao () {
	    	 
	     }
	   

	    // CONSTRUTOR COM PARÂMETROS
		
		public Competicao(int codigo, String nome, LocalDate dataInicio, LocalDate dataFim,
				String jogos, String escalao) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.dataInicio = dataInicio;
			this.dataFim = dataFim;
			this.escalao = escalao;
		}

	    // =======================================================
	    // =================== .COMPORTAMENTOS ==================
	    // =======================================================

         public void eliminarEquipa(int codigo) {
        	 
        	 for (int i = 0; i < equipas.size(); i++) {
        		if(codigo == this.equipas.get(i).getCodigoEquipa()) {
        			equipas.remove(i);
        			System.out.println("equipa removida");
        		}
        		
        	 }
 
        	 
         }
         
         public void AlterarEquipa(int codigo, Equipa equipa) {
        	 for (int i = 0; i < equipas.size(); i++) {
                   eliminarEquipa(codigo);
                   addEquipa(equipa);
             
              }
         }	 
         
         public void eliminarJogo(int codigo) {
        	 
        	 for (int i = 0; i < jogos.size(); i++) {
        		if(codigo == this.jogos.get(i).getJornada()) {
        			jogos.remove(i);
        			System.out.println("jogo removido");
        		}
        		
        	 }
 
        	 
         }
         
         public void mostrarequipas() {
             System.out.println("Equipas:");
              for (int i = 0; i < equipas.size(); i++) {
                  System.out.printf("Codigo : "+ equipas.get(i).getCodigoEquipa() + " Nome : "+ equipas.get(i).getNomeEquipa() + " Escalão : "+ equipas.get(i).getEscalao() + "\n");
               } 
          }
         
         public void mostarJornada(int jornada) {
             System.out.println("Jogos da Jornada "+jornada);
             for (int i = 0; i < jogos.size(); i++) {
                if(jornada == this.jogos.get(i).getJornada()) {
                    System.out.println("Data"+ jogos.get(i).getData()+"    "+jogos.get(i).getEquipaVisitada()+ "   " + jogos.get(i).getGolosEquipaVisitada() + ":" +  jogos.get(i).getGolosEquipaVisitante()  + "   " + jogos.get(i).getEquipaVisitante());
                }
             } 
         }
        
         
         

	    // =======================================================
	    // ============== MÉTODOS COMPLEMENTARES ==============
	    // =======================================================

	    // ----> toString()
		@Override
		public String toString() {
			return "Competicao [codigo=" + codigo + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim="
					+ dataFim + ", equipas=" + equipas + ", jogos=" + jogos + ", escalao=" + escalao + "]";
		}

		
		


	    // ----> equals()
	}

