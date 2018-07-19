import java.util.Random;

public class RookieTeamRandomizer
{	
    public static void main(String[] args)
    {
    	int captainsNum = 0;
    	int noobs = 0;
    	String[] Rookies =  {"Naruto Uzumaki", "Sasuke Uchiha", "Sakura Haruno", "Shikamaru Nara", "Choji Akimichi", "Ino Yamanaka", 
    	    	"Hinata Hyuga", "Kiba Inuzuka", "Shino Aburame"};

    	String Captains[] = {"Kakashi Hatake", "Asuma Sarutobi", "Kurenai Yuhi"};

    	do
    	{
    		System.out.println("This team under jonin commander " + Captains[captainsNum] + " will be");
    		for(int x = 0; x < 3; x++)
    		{
    			Random rand = new Random();
    			do
    			{
    				noobs = rand.nextInt(9) + 0;
    				
    			}while(!(Rookies[noobs] != null));
    			
    			System.out.println(Rookies[noobs]);
    			Rookies[noobs] = null;
    	
    		} 
    		System.out.println("\n");
    		captainsNum++;	
    		
    	}while(captainsNum < 3);
    }

}