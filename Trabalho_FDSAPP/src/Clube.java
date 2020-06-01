import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clube {
	
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	      private int codigo;
	      private String nome;
	      private LocalDate dataFundacao;
	      private String corEquipamento;
	      private int contacto;
	      private String email;
	      private String morada;
	      private List <Equipa> equipas = new ArrayList <Equipa>();


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
		public LocalDate getDataFundacao() {
			return dataFundacao;
		}
		public void setDataFundacao(LocalDate dataFundacao) {
			this.dataFundacao = dataFundacao;
		}
		public String getCorEquipamento() {
			return corEquipamento;
		}
		public void setCorEquipamento(String corEquipamento) {
			this.corEquipamento = corEquipamento;
		}
		public int getContacto() {
			return contacto;
		}
		public void setContacto(int contacto) {
			this.contacto = contacto;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMorada() {
			return morada;
		}
		public void setMorada(String morada) {
			this.morada = morada;
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
			

	    // =======================================================
	    // =================== CONSTRUTORES =====================
	    // =======================================================

	  
	   
	      public Clube () {
    	   
            }
	   

	    // CONSTRUTOR COM PARÂMETROS
		
		public Clube(int codigo, String nome, LocalDate dataFundacao, String corEquipamento, int contacto, String email,
				String morada, String equipas) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.dataFundacao = dataFundacao;
			this.corEquipamento = corEquipamento;
			this.contacto = contacto;
			this.email = email;
			this.morada = morada;
			
		}
		
	    // =======================================================
	    // =================== .COMPORTAMENTOS ==================
	    // =======================================================
        
           public void EliminarEquipa(int codigo) {
        	   
        	 for (int i = 0; i < equipas.size(); i++) {
             	if(codigo == this.equipas.get(i).getCodigoEquipa()) {
             		equipas.remove(i);
             		System.out.println("equipa removida");
             		}
             	 }
           }
           public void AlterarEquipa(int codigo, Equipa equipa) {
          	 for (int i = 0; i < equipas.size(); i++) {
                     EliminarEquipa(codigo);
                     addEquipa(equipa);
                }
           }
           public void CountJogadores() {
        	int counter = 0;
            for (int i = 0; i < equipas.size(); i++) {
            	counter+=equipas.get(i).getJogadores().size();
            }
            System.out.println(counter +" Jogadores do Clube");
          }
           public void CountTreinadores() {
        	int counter = 0;
            for (int i = 0; i < equipas.size(); i++) {
            	counter+=equipas.get(i).getTreinadores().size();
            }
            System.out.println(counter +" Jogadores do Clube");
          }
           


	    // =======================================================
	    // ============== MÉTODOS COMPLEMENTARES ==============
	    // =======================================================

	    // ----> toString()
		
		@Override
		public String toString() {
			return "Clubes [codigo=" + codigo + ", nome=" + nome + ", dataFundacao=" + dataFundacao + ", corEquipamento="
					+ corEquipamento + ", contacto=" + contacto + ", email=" + email + ", morada=" + morada + ", equipas="
					+ equipas + "]";
		}

	    // ----> equals()
	}


