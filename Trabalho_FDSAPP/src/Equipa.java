import java.util.List;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;

public class Equipa {
	  

		// =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	      private int codigoEquipa;
	      private String nomeEquipa;
	      private List <Jogador> Jogadores = new ArrayList <Jogador>();
	      private List <Treinador> treinadores = new ArrayList <Treinador>();
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
	  	public List <Jogador>  getJogadores() {
	  		return Jogadores;
	  	}
	  	public void setJogadores(List <Jogador>  Jogadores) {
	  		this.Jogadores = Jogadores;
	  	}
	  	 public void addJogador (Jogador Jogador) {
		    	this.Jogadores.add(Jogador);
		    }
	  	public List <Treinador> getTreinadores() {
	  		return treinadores;
	  	}
	  	public void setTreinadores(List <Treinador> treinadores) {
	  		this.treinadores = treinadores;
	  	}
	   public void addTreinador (Treinador Treinador) {
		    	this.treinadores.add(Treinador);
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

	    // CONSTRUTOR COM PARÂMETROS

		public Equipa(int codigoEquipa, String nomeEquipa, String escalao) {
			super();
			this.codigoEquipa = codigoEquipa;
			this.nomeEquipa = nomeEquipa;
			this.Jogadores = Jogadores;
			this.treinadores = treinadores;
			this.escalao = escalao;
			
		
			// TODO Auto-generated constructor stub
		}


	    // =======================================================
	    // =================== .COMPORTAMENTOS ==================
	    // =======================================================
		  public void eliminarJogador(int codigo) {
	        	 for (int i = 0; i < Jogadores.size(); i++) {
	        		if(codigo == this.Jogadores.get(i).getId()) {
	        			Jogadores.remove(i);
	        			System.out.println("Jogador removido");
	        		}
	        	 } 
	         }
		  public void eliminarTreinador(int codigo) {
	        	 for (int i = 0; i < treinadores.size(); i++) {
	        		if(codigo == this.treinadores.get(i).getId()) {
	        			treinadores.remove(i);
	        			System.out.println("treinador removido");
	        		}
	        	 } 
		  }
		    public void AlterarJogador(int id,Jogador Jogador) {
	        	 for (int i = 0; i < Jogadores.size(); i++) {
	                   eliminarJogador(id);
	                   addJogador(Jogador);
	              }
	         }	 
		    public void AlterarTreinador(int id, Treinador Treinador) {
	        	 for (int i = 0; i < treinadores.size(); i++) {
	                   eliminarTreinador(id);
	                   addTreinador(Treinador);
	              }
	         }	 
	         
	         
		   public void showSortedJogadores() {
			Jogadores.sort(Comparator.comparing(Jogador::getNome));
			for(int i=0;i<Jogadores.size();i++) {
				System.out.println(Jogadores.get(i));
			}
		}
		


	    // =======================================================
	    // ============== MÉTODOS COMPLEMENTARES ==============
	    // =======================================================

	    // ----> toString()

		  @Override
			public String toString() {
				return "Equipa [codigoEquipa=" + codigoEquipa + ", nomeEquipa=" + nomeEquipa + ", jogadores=" + Jogadores
						+ ", treinadores=" + treinadores + ", escalao=" + escalao + "]";
			}

	    // ----> equals()
	}

