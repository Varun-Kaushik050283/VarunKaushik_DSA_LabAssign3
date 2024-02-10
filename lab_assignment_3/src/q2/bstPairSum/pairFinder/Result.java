/**
 * 
 */
package q2.bstPairSum.pairFinder;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 */
public class Result {
	
	private Set<Pair> pairs;
	private Boolean found;
	
	public Result() {
		this.pairs = new LinkedHashSet<Pair>();
		this.found = Boolean.FALSE; 
	}
	
	

	/**
	 * @return the pairs
	 */
	public Set<Pair> getPairs() {
		return pairs;
	}



	/**
	 * @param pairs the pairs to set
	 */
	public void setPairs(Set<Pair> pairs) {
		this.pairs = pairs;
	}



	/**
	 * @return the found
	 */
	public Boolean getFound() {
		return found;
	}



	/**
	 * @param found the found to set
	 */
	public void setFound(Boolean found) {
		this.found = found;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
