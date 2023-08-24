package TennisNew;

public class Game {
	
	
	public int getGame(Players Rucha, Players Sandhya)
	{
		
		
		if((Rucha.getScore()>=40 && Sandhya.getScore()>=40)) 
		{
			if(Rucha.getScore()-Sandhya.getScore()==20) {
				
				return 1;
					
			}
			
			else if(Sandhya.getScore()-Rucha.getScore()==20) {
				
				return 2;
			}
			
		}
		
		else if(Rucha.getScore()>40 && Sandhya.getScore()<=30)
		{
			
			return 1;
		}
		
		else if(Sandhya.getScore()>40 && Rucha.getScore()<=30) {
			
		return 2;
			
		}
	
		
		return 0;
		
}
}


