package games.awale;


import iialib.games.algs.IHeuristic;

public class AwaleHeuristics {
	//Nombre d'emplacement amis disponible - Nombre d'emplacement ennemies disponible
		public static IHeuristic<AwaleBoard,AwaleRole>  hHaut = (board,role) -> {
			if(board.isGameOver()) {
				switch(board.getScores().get(0).getStatus()) {
				case WIN:
					return IHeuristic.MAX_VALUE; //On a gagner
				case LOOSE:
					return IHeuristic.MIN_VALUE; //On a perdu
				case TIE:
					return 0;
				default: 
					return 0;
				}
			} else {
				return board.grenier_H;
			}

	    };
	    

		public static IHeuristic<AwaleBoard,AwaleRole> hBas = (board,role) -> {
			if(board.isGameOver()) {
				switch(board.getScores().get(1).getStatus()) {
				case WIN:
					return IHeuristic.MAX_VALUE; //On a gagner
				case LOOSE:
					return IHeuristic.MIN_VALUE; //On a perdu
				case TIE:
					return 0;
				default: 
					return 0;
				}	
			} else {
				return board.grenier_B;
			}

		};
}
