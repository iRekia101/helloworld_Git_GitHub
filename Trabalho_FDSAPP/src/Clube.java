import java.util.Date;

public class Clube {
	
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	      private int codigo;
	      private String nome;
	      private Date dataFundacao;
	      private String corEquipamento;
	      private int contacto;
	      private String email;
	      private String morada;
	      private String equipas;


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
		public Date getDataFundacao() {
			return dataFundacao;
		}
		public void setDataFundacao(Date dataFundacao) {
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
		public String getEquipas() {
			return equipas;
		}
		public void setEquipas(String equipas) {
			this.equipas = equipas;
		}

	    // =======================================================
	    // =================== CONSTRUTORES =====================
	    // =======================================================

	  
	   
	    // CONSTRUTOR DEFAULT

	   

	    // CONSTRUTOR COM PARÂMETROS
		
		public Clube(int codigo, String nome, Date dataFundacao, String corEquipamento, int contacto, String email,
				String morada, String equipas) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.dataFundacao = dataFundacao;
			this.corEquipamento = corEquipamento;
			this.contacto = contacto;
			this.email = email;
			this.morada = morada;
			this.equipas = equipas;
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
			return "Clubes [codigo=" + codigo + ", nome=" + nome + ", dataFundacao=" + dataFundacao + ", corEquipamento="
					+ corEquipamento + ", contacto=" + contacto + ", email=" + email + ", morada=" + morada + ", equipas="
					+ equipas + "]";
		}

	    // ----> equals()
	}


