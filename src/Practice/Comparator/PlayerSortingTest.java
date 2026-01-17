package Practice.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerSortingTest {
	public static void main(String[] args) {
		List<Player> footballTeam = new ArrayList<>();
	    Player player1 = new Player(59, "John", 20);
	    Player player3 = new Player(45, "Steven", 24);
	    Player player2 = new Player(67, "Roger", 22);
	    footballTeam.add(player1);
	    footballTeam.add(player2);
	    footballTeam.add(player3);
	    
	    System.out.println(footballTeam);
	    Collections.sort(footballTeam);
	    PlayerRankingComparator playercomparator=new PlayerRankingComparator();
	    Collections.sort(footballTeam,playercomparator);
	    System.out.println(footballTeam);
	    footballTeam.forEach(o->System.out.println(o.getName()));
	    
	    
	    
	    //java 8
	    footballTeam.sort(Comparator.comparing(Player::getName).reversed());
	    System.out.println(footballTeam);
	   
	}

}
