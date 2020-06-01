import java.time.LocalDate;


public abstract class Participantes {
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	    private int id;
	    private String nome;
	    private LocalDate dataNascimento;
	    private int contacto;
	    private String email;


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public LocalDate getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
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
	

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	    public Participantes() {
		}

    // CONSTRUTOR COM PARÂMETROS

		public Participantes(int id, String nome, LocalDate dataNascimento, int contacto, String email) {
			this.id = id;
			this.nome = nome;
			this.dataNascimento = dataNascimento;
			this.contacto = contacto;
			this.email = email;
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
			return "\n id=" + id + "\n nome=" + nome + "\n dataNascimento=" + dataNascimento + "\n contacto="
					+ contacto + "\n email=" + email + "";
		}





    // ----> equals()
}
