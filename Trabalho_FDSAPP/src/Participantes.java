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

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
		@Override
		public String toString() {
			return "Participantes [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", contacto="
					+ contacto + ", email=" + email + "]";
		}




    // ----> equals()
}
