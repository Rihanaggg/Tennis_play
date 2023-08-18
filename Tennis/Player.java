package Tennis;

public class Player {
	public String name;
	public int point;
	public int gameWin;
	public int setWin;
	public int matchWin;
	
	public Player(String name,int point) {
		this.name = name;
		this.point = point;
		this.gameWin = 0;
		this.setWin = 0;
		this.matchWin = 0;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return this.point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getGameWin() {
		return this.gameWin;
	}
	public void setGameWin(int count) {
		this.gameWin += count;		
	}
	public int getSetWin() {
		return this.setWin;
	}
	public void setSetWin(int count) {
		this.setWin += count;
	}
	public int getMatchWin() {
		return this.matchWin;
	}
	public void setMatchWin(int count) {
		this.matchWin += count;
	}
	

}
