/**
 * 
 */
package q2.bstPairSum.pairFinder;

/**
 * 
 */
public class Pair {

	
	private Integer one;
	private Integer two;
	
	public Pair(Integer one, Integer two) {
		 this.one = one;
		 this.two = two;
	}
	
	
	/**
	 * @return the one
	 */
	public Integer getOne() {
		return one;
	}


	/**
	 * @param one the one to set
	 */
	public void setOne(Integer one) {
		this.one = one;
	}


	/**
	 * @return the two
	 */
	public Integer getTwo() {
		return two;
	}


	/**
	 * @param two the two to set
	 */
	public void setTwo(Integer two) {
		this.two = two;
	}

	

	@Override
	public String toString() {
		return "(" + two + "," + one + ")";
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
