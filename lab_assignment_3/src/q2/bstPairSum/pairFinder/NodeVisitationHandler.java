/**
 * 
 */
package q2.bstPairSum.pairFinder;

import java.util.Set;

import q2.bstPairSum.bst.Node;

/**
 * 
 */
public interface NodeVisitationHandler {

	void handle(Node currentNode, Set<Integer> previousVisitedNodes);	
}
