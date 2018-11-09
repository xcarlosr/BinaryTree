package com.s2it.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.s2it.model.BinaryTree;

/**
 * Classe reposável em testar a soma dos valores
 * de uma determinada árvore binária.
 * 
 * @author carlos.lima
 * @since 07/11/2018	
 */
public class BinaryTreeTest {
	BinaryTree tree = new BinaryTree();

	@Before
	public void setUp() throws Exception {
		tree.setValor(2);
		tree.setLeft(new BinaryTree());
		tree.getLeft().setValor(5);
		tree.getLeft().setLeft(new BinaryTree());
		tree.getLeft().getLeft().setValor(10);
		tree.setRight(new BinaryTree());
		tree.getRight().setValor(22);
		tree.getRight().setRight(new BinaryTree());
	}
	
	@Test
	public void testSumElementTree() throws Exception {
		int totalExpected = 39;
		assertEquals(totalExpected, tree.sumElementTree(tree));
		
	}


}
