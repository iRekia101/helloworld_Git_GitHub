import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Jogador extends Participantes {
	    // =======================================================
	    // ===================== ATRIBUTOS =======================
	    // =======================================================
	   
	    private String posicao;
	    private String pePreferido;

	  
	    // =======================================================
	    // ============ ACESSORES e MODIFICADORES ===============
	    // =======================================================
	    

		public String getPosicao() {
			return posicao;
		}
		public void setPosicao(String posicao) {
			this.posicao = posicao;
		}
		public String getPePreferido() {
			return pePreferido;
		}
		public void setPePreferido(String pePreferido) {
			this.pePreferido = pePreferido;
		}


	    // =======================================================
	    // =================== CONSTRUTORES =====================
	    // =======================================================

	  
	   
	    // CONSTRUTOR DEFAULT
           public Jogador () {
        	   super();
        	   //makeJogador()
           }
	   

	    // CONSTRUTOR COM PARÂMETROS
		public Jogador(String posicao,String pePreferido) {
			super();
			
			this.posicao = posicao;
			this.pePreferido = pePreferido;
		}


	    // =======================================================
	    // =================== .COMPORTAMENTOS ==================
	    // =======================================================

	//	public void makeJogador() {	
		//	setId(Integer.parseInt(JOptionPane.showInputDialog("ID:")));
		//	setNome(JOptionPane.showInputDialog("nome:"));
		//	setContacto(Integer.parseInt(JOptionPane.showInputDialog("contacto:")));
		//	setEmail(JOptionPane.showInputDialog("email:"));
		//	int dia = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento dia:"));
		//	int mes = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento mes:"));
		//	int ano = Integer.parseInt(JOptionPane.showInputDialog("Data de Nascimento ano:"));
		//	setDataNascimento(LocalDate.of(ano, mes, dia));
	//		setPosicao(JOptionPane.showInputDialog("Posicao:"));
//			setPePreferido(JOptionPane.showInputDialog("Pe preferido:"));
//		}
		

	    // =======================================================
	    // ============== MÉTODOS COMPLEMENTARES ==============
	    // =======================================================

	    // ----> toString()
		@Override
		public String toString() {
			return "\n Jogador :" + super.toString() +" \n posicao= "+ posicao + "\n pePreferido= "+ pePreferido;
		}

	    // ----> equals()
	}

