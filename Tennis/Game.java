package Tennis;
import java.util.Random;
public class Game {
//	Player p1 = new Player("Rafail",0);
//	Player p2 = new Player("nadal",0);
	Random r = new Random();
	public Player p1;
	public Player p2;
	public int point1;
	public int point2;
	
	public Game() {
		p1 = new Player("Rafail",0);
		p2 = new Player("nadal",0);
		this.point1 = p1.getPoint();
		this.point2 =p2.getPoint();
	}
//	public int getPoint (Player p,int score) {
//		
//	}
	public void updateScore(server s) {
		if(p1.getName().equals(s.playername)) {
			this.point1 += 1 ;
		}
		if(p2.getName().equals(s.playername)) {
			this.point2 += 1;
		}
		if(point1 > 4 && (point1 - point2)>=2) {
			p1.gameWin += 1;
		}else if(point2 > 4 && (point2 - point1)>=2) {
			p2.gameWin += 1;
		}
	}
	
//	public int getscore() {
//		int score = ;
//		System.out.println("random value"+ score);
//		return score;
//	}

}
