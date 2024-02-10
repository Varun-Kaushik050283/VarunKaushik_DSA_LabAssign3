/**
 * 
 */
package q2.bstPairSum.bst;

import java.util.LinkedHashSet;
import java.util.Set;

import q2.bstPairSum.pairFinder.NodeVisitationHandler;

/**
 * 
 */
public class PreOrderTraversalOperation {

	private BinarySearchTree binarySearchTree;
	private Set<Integer> visitedNodes;
	private NodeVisitationHandler nodeVisitationHandler;

	/**
	 * 
	 * @param binarySearchTree
	 */
	public PreOrderTraversalOperation(BinarySearchTree binarySearchTree) {
		this.binarySearchTree = binarySearchTree;
		this.visitedNodes = new LinkedHashSet<Integer>();
	}

	/**
	 * 
	 */
	public void perform() {
		preOrderInternal(binarySearchTree.getRoot());
	}

	private void preOrderInternal(Node node) {
		if (node == null) {
			return;
		}
		
		if(nodeVisitationHandler != null) {
			this.nodeVisitationHandler.handle(node, visitedNodes);
		}

		this.visitedNodes.add(node.getData());
		preOrderInternal(node.getLeftNode());
		preOrderInternal(node.getRightNode());
	}

	/**
	 * @return the binarySearchTree
	 */
	public BinarySearchTree getBinarySearchTree() {
		return binarySearchTree;
	}

	/**
	 * @param binarySearchTree the binarySearchTree to set
	 */
	public void setBinarySearchTree(BinarySearchTree binarySearchTree) {
		this.binarySearchTree = binarySearchTree;
	}

	/**
	 * @return the visitedNodes
	 */
	public Set<Integer> getVisitedNodes() {
		return visitedNodes;
	}

	/**
	 * @param visitedNodes the visitedNodes to set
	 */
	public void setVisitedNodes(Set<Integer> visitedNodes) {
		this.visitedNodes = visitedNodes;
	}
	
	

	/**
	 * @return the nodeVisitationHandler
	 */
	public NodeVisitationHandler getNodeVisitationHandler() {
		return nodeVisitationHandler;
	}

	/**
	 * @param nodeVisitationHandler the nodeVisitationHandler to set
	 */
	public void setNodeVisitationHandler(NodeVisitationHandler nodeVisitationHandler) {
		this.nodeVisitationHandler = nodeVisitationHandler;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
