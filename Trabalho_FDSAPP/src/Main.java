
public class Main {

public static void main(String[] args) {
		
		Competicao Competicoes = new Competicao();
	    Competicoes.setCodigo(12);
	    Competicoes.setNome("1liga");
	    
	    
	    Equipa Equipa = new Equipa();
	    Equipa.setNomeEquipa("Porto");
	    Equipa.setCodigoEquipa(12345);
	    
	    Competicoes.addEquipa(Equipa);
	    System.out.println(Equipa.getNomeEquipa());
	    System.out.println(Equipa.getCodigoEquipa());
	    
	    Equipa Equipa2 = new Equipa ();
	    Equipa2.setNomeEquipa("Benfica");
	    Equipa.setCodigoEquipa(23456);
	    
	    Competicoes.addEquipa(Equipa2);
	    
	    
	   Jogo jogo1 = new Jogo();
	   jogo1.setEquipaVisitada("Sporting");
	   jogo1.setEquipaVisitante("Braga");
	   jogo1.setGolosEquipaVisitada(1);
	   jogo1.setGolosEquipaVisitante(3);
	   
	   Competicoes.addJogo(jogo1);
	   
	   Jogo jogo2 = new Jogo();
	   jogo2.setEquipaVisitada("Belenenses");
	   jogo2.setEquipaVisitante("Guimaraes");
	   jogo2.setGolosEquipaVisitada(2);
	   jogo2.setGolosEquipaVisitante(2);
	   
	   Competicoes.addJogo(jogo2);
	   
	   System.out.println(Competicoes.getJogos());
 
		
		Clube Clube1 = new Clube();
		Equipa.setNomeEquipa("aves");
		
		Clube1.addEquipa(Equipa);
		
		
		
		System.out.println(Clube1.getEquipas());
		
	 Competicoes.eliminarEquipa(23456);
	 
		
	}

}

