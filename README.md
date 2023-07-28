# BST_dsa_in_java
A binary search tree (BST) is a binary tree data structure in which each node has at most two children, usually referred to as the left child and the right child. The binary search tree follows the property that for every node in the tree:

1. The value of the node in the left subtree is less than the value of the current node.
2. The value of the node in the right subtree is greater than the value of the current node.

This property allows for efficient searching, insertion, and deletion operations in the tree. It enables us to perform binary search on the tree, which has a time complexity of O(log n) on average for these operations.

Key characteristics of a binary search tree:
1. Left Child: The left child node has a value less than the value of its parent node (if it exists).
2. Right Child: The right child node has a value greater than the value of its parent node (if it exists).
3. Binary Tree Structure: Each node in the BST can have at most two children (left and right).
4. Ordering: The binary search tree maintains the ordering of values as per the properties mentioned above.

Due to the property of a binary search tree, it is easy to search for a particular value, as you can traverse the tree in a binary search fashion. If the value you are searching for is less than the current node's value, you move to the left child; if it is greater, you move to the right child. This process continues until you find the desired value or reach a leaf node.

Insertion and deletion operations in a binary search tree are also relatively efficient, given that you maintain the binary search tree property during these operations. When inserting a new node, you find the appropriate position in the tree based on the comparison of values and attach the new node as a leaf. For deletion, you need to handle three cases depending on the number of children the node to be deleted has.

However, it's important to note that in the worst-case scenario, when the BST becomes unbalanced (degenerates into a linear structure), the time complexity for searching, insertion, and deletion operations can become O(n), making it less efficient. To address this, self-balancing binary search trees like AVL trees and Red-Black trees are used, which ensure that the tree remains balanced and maintains the logarithmic time complexity for these operations.
