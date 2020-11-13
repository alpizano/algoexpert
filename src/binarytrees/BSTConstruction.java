package binarytrees;

public class BSTConstruction {

   public void test() {
//       BST test = new BST(10);
//       test.insert(25);
//       test.value = 45;
   }
     static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public int getMin() {
            while (left != null) {
                return left.getMin();
            }
            return this.value;
        }

        public BST insert(int value) {
            // Write your code here.
//            if(this.value == value) {
//                return this;
//            }


            if(value < this.value){
                if(left == null) {
                    left = new BST(value);
                }
                else {
                    // can't call insert when left is null
                    left.insert(value);
                }
            }
            // Need else or when method returns, value could be greater and jumps into else call
            else {
                if(right == null) {
                    right = new BST(value);
                }
                else {
                    right.insert(value);
                }
            }

            // Do not edit the return statement of this method.
            return this;
        }

        public boolean contains(int value) {
            // Write your code here.
            if(this.value == value) {
                return true;
            }

            if(value < this.value){
                if(left == null) {
                    return false;
                }
                else {
                    return left.contains(value);
                }
            }
            else if(value > this.value) {
                if(right == null) {
                    return false;
                }
                else {
                    return right.contains(value);
                }
            }

            return false;
        }

        public BST remove(int value) {
            // Write your code here.

            if(value < this.value){
                if(left != null) {
                   left = left.remove(value);
                }
            }
            else if(value > this.value) {
                if(right != null) {
                   right =  right.remove(value);
                }
            }
            else {
                // if 2 children
                if(left != null && right != null) {
                    this.value = right.getMin();
                    right = right.remove(this.value);
                }
                // if 1 left child
                else if(right == null && left != null) {
                    //return left; // doesn't work on all cases, i.e. 1->2->3->4 tree, just returns BST(2) right reference
                    this.value = left.value;
                    right = left.right;
                    left = left.left;
                }
                // if 1 right child
                else if(left == null && right != null) {
                   // return right;
                    this.value = right.value;
                    left = right.left;
                    right = right.right;
                }
                // if 0 children (leaf node)
                else {
                    return null;
                }
            }

            // Do not edit the return statement of this method.
            return this;
        }
    }
    public static void main(String[] args) {
        BSTConstruction bst = new BSTConstruction();
        // If not static nested class, need to instantiate outer class first
        //BST root = bst.new BST(10);
//        BST root = new BST(10);
//        root.left = new BST(5);
//        root.right = new BST(15);
//        root.left.left = new BST(2);
//        root.left.right = new BST(5);
//        root.left.left.left = new BST(1);
//        root.right.left = new BST(13);
//        root.right.right = new BST(22);
//        root.right.left.right = new BST(14);

//        BST root2 = new BST(42);
//        root2.insert(33);
//        root2.insert(55);
//        root2.insert(22);
//        root2.insert(39);

//        BST root3 = new BST(11);
//        root3.insert(7);
//        root3.insert(15);
//        root3.insert(5);
//        root3.insert(8);
//        root3.insert(14);
//        root3.insert(17);
//        root3.insert(3);
//        root3.insert(4);
//        root3.insert(10);
//        root3.insert(6);

//        BST getMinTest = new BST(69);
//        System.out.println(getMinTest.getMin());
//
//        BST deleteTest = new BST(25);
//        deleteTest.insert(20);
//        deleteTest.insert(27);
//        deleteTest.insert(15);
//        deleteTest.insert(22);
//        deleteTest.insert(26);
//        deleteTest.insert(30);
//        deleteTest.insert(17);
//        deleteTest.insert(29);
//        deleteTest.insert(32);


//        System.out.println(root3.contains(0));
        // leaf node test
        //root3.remove(14);
        //root3.remove(8);
        //root3.remove(15);
        //System.out.println(root3.getMin());
       // deleteTest.remove(27);

//        BST algoExpert4 = new BST(10);
//        algoExpert4.insert(5).insert(15);
        // remove root
//        algoExpert4.remove(10);
//        BST algoExpert6 = new BST(1);
//        algoExpert6.insert(2).insert(3).insert(4);
//        algoExpert6.remove(1);


//        BST test1Child = new BST(10);
//        test1Child.insert(5).insert(15).insert(17);
//        test1Child.remove(15);

//        BST singleNodeTree = new BST(45);
//        singleNodeTree.remove(45);

        BST test = new BST(10);
        test.insert(15).insert(22).insert(13).insert(14).insert(5).insert(5).insert(2).insert(1).insert(12);
        test.remove(10);


    }
}
