class Player
{
	String pname;
	float trun;
	int nwicket;
	int nmatches;
	static String country="INDIA";
	int ncentury;
	String category;
	public Player(String pname, float trun, int nwicket, int nmatches, int ncentury, String category) 
	{
		this.pname = pname;
		this.trun = trun;
		this.nwicket = nwicket;
		this.nmatches = nmatches;
		this.ncentury = ncentury;
		this.category = category;
	}
	
	void DisplayPlayer()
	{
		System.out.println(pname+" "+trun+" "+nwicket+" "+nmatches+" "+ncentury+" "+country+" "+category);
		
	}

	@Override
	public String toString() {
		return "Player [pname=" + pname + ", trun=" + trun + ", nwicket=" + nwicket + ", nmatches=" + nmatches
				+ ", ncentury=" + ncentury + ", category=" + category + "]";
	}
	
}