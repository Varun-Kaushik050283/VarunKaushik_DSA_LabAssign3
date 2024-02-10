/**
 * 
 */
package q1.balancingBrackets;

/**
 * 
 */
public class BracketPair {

	private Character openCharacter;
	private Character closeCharacter;
	
	/**
	 * 
	 * @param openCharacter
	 * @param closeCharacter
	 */
	public BracketPair(Character openCharacter, Character closeCharacter) {
	   this.openCharacter = openCharacter;
	   this.closeCharacter = closeCharacter;
	}
	
	/**
	 * @return the openCharacter
	 */
	public Character getOpenCharacter() {
		return openCharacter;
	}
	/**
	 * @param openCharacter the openCharacter to set
	 */
	public void setOpenCharacter(Character openCharacter) {
		this.openCharacter = openCharacter;
	}
	/**
	 * @return the closeCharacter
	 */
	public Character getCloseCharacter() {
		return closeCharacter;
	}
	/**
	 * @param closeCharacter the closeCharacter to set
	 */
	public void setCloseCharacter(Character closeCharacter) {
		this.closeCharacter = closeCharacter;
	}
	@Override
	public String toString() {
		return "BracketPair [openCharacter= %c" + openCharacter + ", closeCharacter= %c" + closeCharacter + "]";
	}
	
	
}
