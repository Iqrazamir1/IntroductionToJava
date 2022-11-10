package accessModifier;

public class Sample {
	private String nameOfTechnology; 
	private String ageOfTechnology;
	private int marketShare;
	
	public Sample(String nameOfTechnology, String ageOfTechnology, int marketShare) {
		this.nameOfTechnology = nameOfTechnology;
		this.ageOfTechnology = ageOfTechnology; 
		this.marketShare = marketShare;
	}
	
	/* Best Practise:
	 * 1. Set attributes to private - 
	 * Constructor allows you to access the private attributes in other classes
	 * 2. Set methods to public
	 * */
}
