import java.util.Date;
import java.util.List;
import java.util.ArrayList;

	public class Competicao {
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	       private int codigo;
	       private String nome;
	       private Date dataInicio;
	       private Date dataFim;
	       private List <Equipa> equipas = new ArrayList <Equipa>();
	       private String jogos;
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
		public Date getDataInicio() {
			return dataInicio;
		}
		public void setDataInicio(Date dataInicio) {
			this.dataInicio = dataInicio;
		}
		public Date getDataFim() {
			return dataFim;
		}
		public void setDataFim(Date dataFim) {
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

		public String getJogos() {
			return jogos;
		}
		public void setJogos(String jogos) {
			this.jogos = jogos;
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
		
		public Competicao(int codigo, String nome, Date dataInicio, Date dataFim, String equipasParticipantes,
				String jogos, String escalao) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.dataInicio = dataInicio;
			this.dataFim = dataFim;
			this.jogos = jogos;
			this.escalao = escalao;
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
			return "Competicoes [codigo=" + codigo + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim="
					+ dataFim + ", jogos=" + jogos + "]";
		}



	    // ----> equals()
	}

