/**
 * 
 */
package q2.bstPairSum;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import q2.bstPairSum.bst.BinarySearchTree;
import q2.bstPairSum.bst.PreOrderTraversalOperation;
import q2.bstPairSum.bst.SampleBinarySearchTree;
import q2.bstPairSum.pairFinder.BinarySearchTreePairFinder;
import q2.bstPairSum.pairFinder.Pair;
import q2.bstPairSum.pairFinder.Result;

/**
 * Question 2: Find a pair with a given sum in Binary Search Tree
 * 
 * Provided Inputs: 
 * 1. List<Integer> {10,20,30,40,50,60,70} as breadth/level order traversal for sample BST
 * 2. Sum : 130 or any other Integer value 
 * 
 * Observation:
 * It seems that provided sample BST is a right skewed BST, since all the branch nodes falls into right side of all the root nodes till the leaf node  
 */
public class BSTSumPairFinder {

	private static final List<Integer> sampleBinarySearchTreeData = Arrays.asList(new Integer[]{10,20,30,40,50,60,70});
	private static final Integer sum = 130;
	
	/**
	 * Start of program
	 * @param args
	 */
	public static void main(String[] args) {
			
		//Step 1.  Constructing Initial Right Skewed BST from sample data
		BinarySearchTree bst = SampleBinarySearchTree.constructSampleBST(sampleBinarySearchTreeData);

		//Step 2.  Traversing Right Skewed BST in preOrderTraversal format
		PreOrderTraversalOperation operation = new PreOrderTraversalOperation(bst);

		operation.perform();

		//Step 3. Getting provided BST 
		Set<Integer> visitedNodes = operation.getVisitedNodes();
		System.out.println("Binary Tree provided in the problem statement:-");
		System.out.println(visitedNodes);		
		System.out.println();
		System.out.println();
		
		// Step 4. Finding the pair BST nodes which contribute in sum of 130
		System.out.println("Finding the pair of binary search tree nodes, which are to be identified for the sum of 130 :- ");
		System.out.println();
		Result result = testFindPair(bst, sum);
		if (result.getFound()) {
			StringBuilder pairs = new StringBuilder("Pair(s) : {");
			for(Pair pair: result.getPairs()) {
				pairs.append(pair.toString()).append(",");
			}
			String pairsString = pairs.toString();
			pairsString = pairsString.substring(0,pairsString.lastIndexOf(",")) + "}";
			System.out.println(pairsString);
		} else {
			System.out.println("nodes are not found");
		}

	}

	/**
	 * Checking for finding pair
	 * @param bst
	 * @param sum
	 * @return
	 */
	static Result testFindPair(BinarySearchTree bst, int sum) {
		
		BinarySearchTreePairFinder finder = new BinarySearchTreePairFinder(bst, sum);
		Result result = finder.findPair();
		System.out.println();
		return result;
	}

}
