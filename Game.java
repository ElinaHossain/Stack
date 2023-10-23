class Game implements Comparable<Game> {

	private String name;	
	private double price;
	
	// private default constructor
	private Game() {}
	
	// public user-defined constructor
	public Game(String name, double price) {
		this.name = name;		
		this.price = price;
	}
	
	// for Comparable interface
	@Override
	public int compareTo(Game aGame) {
		if(this.price > aGame.price) {
			return 1;
		}
		else if(this.price < aGame.price) {
			return -1;
		}
		return 0;
	}
	
	public String getName() { return name; }	
	public double getPrice() { return price; }
	
	public String toString() {
		return "Name = " + name + " Price = " + price;
	}

}