
public class Main {

public static void main(String[] args) {
		
		Competicao Competicoes = new Competicao();
		
		Equipa equipa = new Equipa();
		equipa.setNomeEquipa("Benfica");
		equipa.setCodigoEquipa("12345");
		Competicoes.addEquipa(equipa);
		
		
		System.out.println(equipa.getCodigoEquipa());
		System.out.println(equipa.getNomeEquipa());
		
		
	}

}

