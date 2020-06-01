
public class Main {

public static void main(String[] args) {
		
		Competicao Competicoes = new Competicao();
	    Competicoes.setCodigo(15);
	    Competicoes.setNome("1liga");
	    
	    
	    Equipa Equipa = new Equipa();
	    Equipa.setNomeEquipa("Porto");
	    Equipa.setCodigoEquipa(12345);
	    
	    Competicoes.addEquipa(Equipa);
	   // System.out.println(Equipa.getNomeEquipa());
	   // System.out.println(Equipa.getCodigoEquipa());
	    
	    Equipa Equipa2 = new Equipa ();
	    Equipa2.setNomeEquipa("Benfica");
	    Equipa2.setCodigoEquipa(23456);
	    
	    Competicoes.addEquipa(Equipa2);
	    
	    
	   Jogo jogo1 = new Jogo();
	   jogo1.setJornada(15);
	   jogo1.setEquipaVisitada("Sporting");
	   jogo1.setEquipaVisitante("Braga");
	   jogo1.setGolosEquipaVisitada(1);
	   jogo1.setGolosEquipaVisitante(3);
	   
	   Competicoes.addJogo(jogo1);
	   
	   
	   
	   Arbitro Arbitro = new Arbitro();
	   Arbitro.setNome("Miguel");
	   Arbitro.setId(12345);
	   Arbitro.setContacto(910457382);
	   Arbitro.setEmail("adfjdgs@hotmail.com");
	// Arbitro.setDataNascimento("12/03/1998");
	  
	    
	   
	   Jogo jogo2 = new Jogo();
	   jogo2.setEquipaVisitada("Belenenses");
	   jogo2.setEquipaVisitante("Guimaraes");
	   jogo2.setGolosEquipaVisitada(2);
	   jogo2.setGolosEquipaVisitante(2);
	   
	  jogo2.addArbitro(Arbitro);
	   
	   System.out.println(jogo2.getArbitros());
	   
	  // System.out.println(Competicoes.getJogos());
	   
	   
 
		Equipa Equipa3 = new Equipa();
		
		Clube Clube1 = new Clube();
		
		Equipa3.setNomeEquipa("guimaraes");
		Equipa3.setCodigoEquipa(7890);
		
		
		Clube1.addEquipa(Equipa3);
		
		System.out.println(Clube1.getEquipas());
		
		
		
		Treinador Treinador = new Treinador();
		
		Treinador.setNome("Jacinto");
		Treinador.setId(1234);
		Treinador.setContacto(925014872);
		Treinador.setEmail("Jacinto@hotmail.com");
		
		
		Jogador Jogador = new Jogador();
		
		
		Jogador.setNome("Ronaldo");
		Jogador.setId(567);
		Jogador.setContacto(932472559);
		Jogador.setEmail("Ronaldo@hotmail.com");
		Jogador.setPePreferido("Direito");
		Jogador.setPosicao("Avancado");
		
		
		
		
		
		
		
	 
	// Competicoes.eliminarJogo(15);
	// Competicoes.mostrarequipas();
	 //Competicoes.mostarJornada(15);
	 
		
	}

}

