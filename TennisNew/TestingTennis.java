package TennisNew;



public class TestingTennis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players Rucha = new Players();
		Players sandhya = new Players();
		Game s = new Game();
		Match m = new Match();
		TennisSet t = new TennisSet();
		Rucha.setScore(40);
		sandhya.setScore(60);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
	
		
		//System.out.println("GetScore1:"+Rucha.getScore());
		
		t.updateSet(m, m.getP1(), m.getP2());
		Rucha.setScore(40);
		sandhya.setScore(60);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		
		
		//System.out.println("GetScore1:"+Rucha.getScore());
		
		t.updateSet(m, m.getP1(), m.getP2());
		Rucha.setScore(40);
		sandhya.setScore(60);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);
		Rucha.setScore(60);
		sandhya.setScore(40);
		m.updateMatch(Rucha, sandhya);

		
		t.updateSet(m, m.getP1(), m.getP2());
		if(t.setResult(t.p1Sets, t.p2Sets)==1)
		{
			System.out.println("Rucha won the game!!");
		}
		else {
			System.out.println("Sandhya won the game!!");
		}
		
	
		

	}


}
