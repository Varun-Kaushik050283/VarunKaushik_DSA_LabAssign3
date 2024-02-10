/**
 * 
 */
package q2.bstPairSum.pairFinder;

import java.util.Set;

import q2.bstPairSum.bst.BinarySearchTree;
import q2.bstPairSum.bst.Node;
import q2.bstPairSum.bst.PreOrderTraversalOperation;

/**
 * 
 */
public class BinarySearchTreePairFinder implements NodeVisitationHandler {

	private BinarySearchTree binarySearchTree;
	private Integer sumValue;
	private Result result;

	public BinarySearchTreePairFinder(BinarySearchTree binarySearchTree, Integer sumValue) {
		this.binarySearchTree = binarySearchTree;
		this.sumValue = sumValue;
		this.result = new Result();
	}

	public Result findPair() {
		 
        PreOrderTraversalOperation operation
            = new PreOrderTraversalOperation(binarySearchTree);
        
        operation.setNodeVisitationHandler(this);
        
        operation.perform();
            
		return this.result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void handle(Node currentNode, Set<Integer> previousVisitedNodes) {
		System.out.println();
		System.out.printf("Current Node : %s", currentNode);
		System.out.println();

		System.out.printf("Previous Visited Nodes : %s", previousVisitedNodes);
		System.out.println();

		Integer currentNodeData = currentNode.getData();

		Integer difference = (sumValue - currentNodeData);

		if (previousVisitedNodes.contains(difference)) {

			System.out.printf("Match Identified : Sum %d, Difference : %d", sumValue, difference);
			System.out.println();

			this.result.setFound(Boolean.TRUE);

			Pair newPair = new Pair(currentNodeData, difference);
			this.result.getPairs().add(newPair);
		}

	}

}
