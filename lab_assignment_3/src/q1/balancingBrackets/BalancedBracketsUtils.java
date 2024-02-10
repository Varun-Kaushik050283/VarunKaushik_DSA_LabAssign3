/**
 * 
 */
package q1.balancingBrackets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 */
public class BalancedBracketsUtils {

	
	public static Set<BracketPair> getAllPredefinedBrackets(){

		Set<BracketPair> predefinedBrackets = new HashSet<BracketPair>();
				
		// Round brackets / Function brackets
		predefinedBrackets.add(new BracketPair('(', ')'));
		
		// Square Brackets / Array brackets
		predefinedBrackets.add(new BracketPair('[', ']'));
		
		// Curly brackets / Braces
		predefinedBrackets.add(new BracketPair('{', '}'));
		
		// Angle Brackets 
		predefinedBrackets.add(new BracketPair('<', '>'));
		
		return predefinedBrackets;
		
	}	

	public static Set<Character> getOpenBracketCharsSet(){		
	    
	    Set<BracketPair> predefinedBrackets = getAllPredefinedBrackets();
	    
	    Set<Character> result = new HashSet<Character>();
	    
	    Iterator<BracketPair> iterator = predefinedBrackets.iterator();
	    
	    while (iterator.hasNext()) {
	        
	        BracketPair bracketPair = iterator.next();
	        
	        result.add(bracketPair.getOpenCharacter());			
	    }		
	    return result;
	}	        

	public static Set<Character> getCloseBracketCharsSet(){
	    
	    Set<BracketPair> predefinedBrackets = getAllPredefinedBrackets();
	    
	    Set<Character> result = new HashSet<Character>();
	    
	    Iterator<BracketPair> iterator = predefinedBrackets.iterator();
	    
	    while (iterator.hasNext()) {
	        
	        BracketPair bracketPair = iterator.next();
	        
	        result.add(bracketPair.getCloseCharacter());			
	    }		
	    return result;
	}

	public static Character getOpenBracketChar(Character closeBracket) {
	    
	    Set<BracketPair> predefinedBrackets = getAllPredefinedBrackets();
	    
	    for (BracketPair predefinedBracket : predefinedBrackets) {
	        
	        if (predefinedBracket.getCloseCharacter().equals(closeBracket)) {
	            return predefinedBracket.getOpenCharacter();
	        }
	    }
	    return null;
	}        

}
