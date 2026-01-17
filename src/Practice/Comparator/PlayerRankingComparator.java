package Practice.Comparator;

import java.util.Comparator;

public class PlayerRankingComparator implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		
		return Integer.compare(o2.getRanking(),o1.getRanking());
	}

}
