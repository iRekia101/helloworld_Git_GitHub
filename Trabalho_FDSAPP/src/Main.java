import java.time.LocalDate;

public class Main {

public static void main(String[] args) {
		
		Competicao Competicoes = new Competicao();
	    Competicoes.setCodigo(15);
	    Competicoes.setNome("1liga");
	    Competicoes.setEscalao("Iniciado");
	    
	    
	    Equipa Equipa = new Equipa(12345,"Porto","Iniciado");
	    Equipa Equipa2 = new Equipa (23456,"Benfica","Iniciado");
	    Equipa Equipa3 = new Equipa (23453,"Guimaraes","Iniciado");
	    
	    Jogador jogador1 = new Jogador();
	    Treinador treinador1 = new Treinador (); 
	    
	    Equipa.addJogador(jogador1);
	    Equipa.addTreinador(treinador1);
	    
	    
	    Competicoes.addEquipa(Equipa);
	    Competicoes.addEquipa(Equipa2);
	    Competicoes.addEquipa(Equipa3);
	    
	   
	    Arbitro Arbitro = new Arbitro();
		Arbitro.setNome("Miguel");
		Arbitro.setId(12345);
		Arbitro.setContacto(910457382);
		Arbitro.setEmail("adfjdgs@hotmail.com");
		Arbitro.setDataNascimento(LocalDate.of(1998,03,28));
	    
	    
	   Jogo jogo1 = new Jogo(Equipa2,3,Equipa,1,LocalDate.of(2010, 10, 26),15);
	   //jogo1.setJornada(15);
	   //jogo1.setEquipaVisitada(Equipa);
	   //jogo1.setEquipaVisitante(Equipa2);
	   //jogo1.setGolosEquipaVisitada(1);
	   //jogo1.setGolosEquipaVisitante(3);
	   jogo1.addArbitro(Arbitro);
	   
	   Jogo jogo2 = new Jogo(Equipa3, 2,Equipa,2,LocalDate.of(2010,11,20),16);
	   //jogo2.setEquipaVisitada(Equipa);
	   //jogo2.setEquipaVisitante(Equipa3);
	   //jogo2.setGolosEquipaVisitada(2);
	   //jogo2.setGolosEquipaVisitante(2);
	   jogo2.addArbitro(Arbitro);
	   jogo2.AdicionarGolo(23453);
	   
	   System.out.println(jogo2.getGolosEquipaVisitante());
	   
	   Competicoes.addJogo(jogo1);	    
	  
	   System.out.println(jogo2.getArbitros());
	
	   
	  // System.out.println(Competicoes.getJogos());

		Clube Clube1 = new Clube();
	
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
		 System.out.println(Treinador);
		
		
		
		
		
		
	 
	// Competicoes.eliminarJogo(15);
	// Competicoes.mostrarequipas();
	 //Competicoes.mostarJornada(15);
	 
		
	}

}

