package com;

public class TreeNode<K extends Comparable<K>> {
  private K key;
  private TreeNode<K> leftNode;
  private TreeNode<K> rightNode;

  public TreeNode(K key, TreeNode<K> leftNode, TreeNode<K> rightNode) {
    this.key = key;
    this.leftNode = leftNode;
    this.rightNode = rightNode;
  }

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  TreeNode<K> getLeftNode() {
    return leftNode;
  }

  void setLeftNode(TreeNode<K> leftNode) {
    this.leftNode = leftNode;
  }

  TreeNode<K> getRightNode() {
    return rightNode;
  }

  void setRightNode(TreeNode<K> rightNode) {
    this.rightNode = rightNode;
  }
}
