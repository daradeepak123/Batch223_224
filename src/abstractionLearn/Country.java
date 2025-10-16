package abstractionLearn;

public interface Country {
	
	
	public void wish();
	public void currency();
	public void eatingHabist();
	public void culture();
	public void language();
	public  void captialCity();
	public  void religion();
	public  void states();
	public  void ThreatRating();

	

}



class India implements Country{

	
	public void wish() {
		
		System.out.println("Namaste");
	}

	
	public void currency() {
		
		System.out.println("INR");
	}

	
	public void eatingHabist() {
		
		System.out.println("Veg and non veg");
	}

	
	public void culture() {
		System.out.println("");
		
	}

	
	public void language() {
		System.out.println("hindi");
		
	}

	
	public void captialCity() {
		System.out.println("Delhi");
		
	}

	
	public void religion() {
		
		
	}

	
	public void states() {
		
		
	}

	
	public void ThreatRating() {
		
		
	}
	
	
	
	
}


class Pakisthan implements Country{

	
	public void wish() {
		
		System.out.println("Namaste");
	}

	
	public void currency() {
		
		System.out.println("Pakistan Rupee");
	}

	
	public void eatingHabist() {
		
		System.out.println("non veg");
	}

	
	public void culture() {
		System.out.println("bad");
		
	}

	
	public void language() {
		System.out.println("hindi");
		
	}

	
	public void captialCity() {
		System.out.println("Karachi");
		
	}

	
	public void religion() {
		
		System.out.println("");
	}

	
	public void states() {
		System.out.println("num");
		
	}

	
	public void ThreatRating() {
		System.out.println("very high");
		
	}
	
	
	
	
}


