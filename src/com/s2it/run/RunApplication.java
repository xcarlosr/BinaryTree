package com.s2it.run;

import com.s2it.model.BinaryTree;

/**
 * Classe que executa um exemplo da soma dos valores
 * de uma determinada árvore binária.
 * 
 * @author carlos.lima
 * @since 07/11/2018	
 */
public class RunApplication {

	public static void main(String[] args) {
		BinaryTree tree = createBinaryTree();
		System.out.println("The sum is:  " + tree.sumElementTree(tree));

	}

	private static BinaryTree createBinaryTree() {
		
		BinaryTree btree = new BinaryTree();
		btree.setValor(2);
		btree.setLeft(new BinaryTree());
		btree.getLeft().setValor(5);
		btree.getLeft().setLeft(new BinaryTree());
		btree.getLeft().getLeft().setValor(10);
		btree.setRight(new BinaryTree());
		btree.getRight().setValor(22);
		btree.getRight().setRight(new BinaryTree());
		
		return btree;
	}

}
