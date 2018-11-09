package com.s2it.model;

/**
 * Classe que representa uma estrutura de árvore binária.
 * 
 * @author carlos.lima
 * @since 07/11/2018
 */
public class BinaryTree {
	
	private int valor;
	private BinaryTree left;
	private BinaryTree right;
	
	/**
	 * Método que retorna o somatório recursivo de uma árvore bínária.
	 * 
	 * @param BinaryTree
	 * @return int
	 */
	public int sumElementTree(BinaryTree noRaiz) {
		return noRaiz != null ? noRaiz.valor + 
			   sumElementTree(noRaiz.left) + 
			   sumElementTree(noRaiz.right) : 0;
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
}
