package Tennis;

public class server {
    String playername;
    int score;
    
    public server(String name,int score) {
    	this.playername = name;
    	this.score = score ;
    }
    
    public String getName() {
    	return this.playername;
    }
    public void setName(String name) {
    	this.playername = name;
    }
    public int getScore() {
    	return this.score;
    }
    public void setScore(int score) {
    	this.score = score;
    }
}
