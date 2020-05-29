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
		
		public Competicao(int codigo, String nome, Date dataInicio, Date dataFim,
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
         
         public void AlterarEquipa(int codigo) {
        	 for (int i = 0; i < equipas.size(); i++) {
        		if(codigo == this.equipas.get(i).getCodigoEquipa()) {
        			equipas.remove(i);
        			System.out.println("equipa alterada");
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

