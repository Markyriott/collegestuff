public static <E> List<E> preorderList(BinaryTreeNode<E> root){
    List<E> list = new ArrayList<>();
    preorderListHelper(root, list);
    return list
}

public static <E> void preorderListHelper(BinaryTreeNode<E> root, List<E> list){
    if (root != null){
        list.add(root.data);
        preorderListHelper(root.left, list);
        preorderListHelper(root.right, list);
    }
}

public static <E> List<E> inorderList(BinaryTreeNode<E> root){
    List<E> list = new ArrayList<>();
    inorderListHelper(root, list);
    return list;
}

public static void inorderListHelper(BinaryTreeNode<E> root, List<E> list){
    if (root != null){
        inorderListHelper(root.left, list);
        list.add(root.data);
        inorderListHelper(root.right, list);
    }
}

public static <E> List<E> postorderList(BinaryTreeNode<E> root){
    List<E> list = new ArrayList<>();
    postorderListHelper(root, list);
    return list;
}

public static void postorderListHelper(BinaryTreeNode<E> root, List<E> list){
    if (root != null){
        postorderListHelper(root.left, list);
        postorderListHelper(root.right, list);
        list.add(root.data);
    }
}

public static <E> List<List<E>> levelOrderList(BinaryTreeNode<E> root){
    List<List<E>> list = new ArrayList<>();
    Dequeue<BinaryTreeNode<E>> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()){
        List<E> level = new ArrayList<>();
        int size = queue.size();

        for(int i = 0; i < size; i++){
            BinaryTreeNode<E> node = queue.remove();
            level.add(node.data);

            if(node.left != null){
                queue.add(node.left);
            }

            if (node.right != null){
                queue.add(node.right);
            }

        }
        list.add(level);
    }

    return list;

}

public static <E> int countLeaves(BinaryTreeNode<E> root){
    if (root == null) {
        return 0;
    }

    return ((root.left == null && root.right == null) ? 1 : 0) + countLeaves(root.left) + countLeaves(root.right);
}

public static <E> boolean isProper(BinaryTreeNode<E> root){
    if (root == null){
        return true;
    }

    return (root.left == null) == (root.right == null) && isProper(root.left) && isProper(root.right);
}

public static <E> boolean contains(BinaryTreeNode<E> root, E element){
    if( root == null){
        return false;
    }

    return Objects.equals(root.data,element) || contains(root.left, element) || contains(root.right, element);
}

public static <E> int count(BinaryTreeNode<E> root, E e){
    if(root == null){
        return 0;
    }

    return Objects.equals(root.data,e) ? 1 : 0 + count(root.left, element) + count(root.right, element);
}

public static int sum(BinaryTreeNode<Integer> root){
    if ( root == null ) {
        return 0;
    }

    return root.data + sum(root.left) + sum(root.right);
}

public static int maxPathSum(BinaryTreeNode<Integer> root){
    if (root == null){
        return 0;
    }

    return root.data + Math.max(maxPathSum(root.left), maxPathSum(root.right));
}

/* traversal1:
preorder: 3,5,1,2,4,6
inorder: 1,5,3,4,2,6
postorder: 1,5,4,6,2,3
*/

/* traversal2: 
preorder: 19,47,23,-2,55,63,94,28
inorder: 23,47,55,-2,19,63,94,28
postorder: 23,55,-2,47,28,94,63,19
*/

/* traversal3:
preorder: 2,1,7,4,3,5,6,9,8
inorder: 2,3,4,5,7,1,6,8,9
postorder: 3,5,4,7,8,9,6,1,2
*/
