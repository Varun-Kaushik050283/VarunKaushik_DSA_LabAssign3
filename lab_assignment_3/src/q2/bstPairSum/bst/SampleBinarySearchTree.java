/**
 * 
 */
package q2.bstPairSum.bst;

import java.util.List;

/**
 * 
 */
public class SampleBinarySearchTree {

	/**
	 * @param args
	 */
	public static BinarySearchTree constructSampleBST(List<Integer> sampleBinarySearchTreeData) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		for (Integer nodeData : sampleBinarySearchTreeData)
			bst.insert(nodeData);
		
		return bst;
	}

}
