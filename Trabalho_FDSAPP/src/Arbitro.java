import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Arbitro extends Participantes {
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	
	
    
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

// =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Arbitro() {
		super();
		//makeArbitro();
		// TODO Auto-generated constructor stub
	}
    // CONSTRUTOR COM PARÂMETROS
	public Arbitro(int id,String nome,LocalDate dataNascimento,int contacto,String email ) {
		super();
		this.setId(id);
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setContacto(contacto);
		this.setEmail(email);
		// TODO Auto-generated constructor stub
	}
    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================
//	public void makeArbitro() {	
	//	setId(Integer.parseInt(JOptionPane.showInputDialog("ID:")));
	//	setNome(JOptionPane.showInputDialog("nome:"));
	//	setContacto(Integer.parseInt(JOptionPane.showInputDialog("contacto:")));
	//	setEmail(JOptionPane.showInputDialog("email:"));
	//	int dia = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento dia:"));
	//	int mes = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento mes:"));
	//	int ano = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento ano:"));
	//	setDataNascimento(LocalDate.of(ano, mes, dia));
//	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		return "\nArbitro :" + super.toString() + "";
	}


    // ----> equals()
}
