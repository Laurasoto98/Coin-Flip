package lab01;

public class CoinFlipExperiment {
	
	static public int coinFlipExperiment() {
		int i;
		int win =0;
		double flip;
		
		for(i=0; i<100; i++) {
			flip= Math.random();
			
			if(flip<0.505) {
				win++;
			}
			else {
				win--;
			}
		}
		return ( win);
	}
	public static void main(String[] args) {
		
		int amount = coinFlipExperiment();
		
		System.out.print("Win/loss amount: " + amount);
		
	}
}


