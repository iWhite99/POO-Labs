package com;

public class GenericTree<K extends Comparable<K>> {
  private TreeNode<K> root;

  public GenericTree(TreeNode<K> root) {
    this.root = root;
  }

  public TreeNode<K> getRoot() {
    return root;
  }

  public void setRoot(TreeNode<K> root) {
    this.root = root;
  }

  void add(TreeNode<K> root, TreeNode<K> newNode) {
    if (root.getLeftNode() == null) {
      if (newNode.getKey().compareTo(root.getKey()) < 0) {
        root.setLeftNode(newNode);
      }
    }
    if (root.getRightNode() == null) {
      if (newNode.getKey().compareTo(root.getKey()) > 0) {
        root.setRightNode(newNode);
      }
    } else {
      if (newNode.getKey().compareTo(root.getKey()) > 0) {
        add(root.getRightNode(), newNode);
      } else {
        add(root.getLeftNode(), newNode);
      }
    }
  }

  public static void main(String[] args) {
    TreeNode<NewComparable> root = new TreeNode<>(new NewComparable(5), null, null);
    GenericTree<NewComparable> tree = new GenericTree<NewComparable>(root);
    TreeNode<NewComparable> testNode = new TreeNode<>(new NewComparable(2), null, null);
    tree.add(root, testNode);
    TreeNode<NewComparable> test1Node = new TreeNode<>(new NewComparable(7), null, null);
    tree.add(root, test1Node);
    System.out.println();
  }
}
