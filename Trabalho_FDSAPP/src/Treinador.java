import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Treinador extends Participantes {


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
	public Treinador() {
		super();
		//makeTreinador();
		// TODO Auto-generated constructor stub
	}
    // CONSTRUTOR COM PARÂMETROS
	public Treinador(int id,String nome,LocalDate dataNascimento,int contacto,String email ) {
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
//	public void makeTreinador() {	
	//	setId(Integer.parseInt(JOptionPane.showInputDialog("ID:")));
	//	setNome(JOptionPane.showInputDialog("nome:"));
	//	setContacto(Integer.parseInt(JOptionPane.showInputDialog("contacto:")));
	//	setEmail(JOptionPane.showInputDialog("email:"));
	//	int dia = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento dia:"));
	//	int mes = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento mes:"));
	//	int ano = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento ano:"));
//		setDataNascimento(LocalDate.of(ano, mes, dia));
//	}
	


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "\n Treinador :" + super.toString() + "";
	}



    // ----> equals()
}
