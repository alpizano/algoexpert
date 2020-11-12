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

        public BST insert(int value) {
            // Write your code here.
            if(this.value == value) {
                return this;
            }

            if(value < this.value){
                if(left == null) {
                    return left = new BST(value);
                }
                else {
                    left.insert(value);
                }
            }
            else if(value > this.value) {
                if(right == null) {
                    return right = new BST(value);
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
                    //return left = new BST(value);
                }
                else {
                    return left.contains(value);
                }
            }
            else if(value > this.value) {
                if(right == null) {
                    return false;
                    //return right = new BST(value);
                }
                else {
                    return right.contains(value);
                }
            }

            return false;
        }

        public BST remove(int value) {
            // Write your code here.
            if(this.value == value) {
                return true;
            }

            if(value < this.value){
                if(left == null) {
                    return new BST(-1);
                    //return left = new BST(value);
                }
                else {
                    return left.remove(value);
                }
            }
            else if(value > this.value) {
                if(right == null) {
                    return new BST(-1);
                    //return right = new BST(value);
                }
                else {
                    return right.remove(value);
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

        BST root3 = new BST(5);
        root3.insert(3);
        root3.insert(2);
        root3.insert(4);
        root3.insert(7);
        root3.insert(6);
        root3.insert(8);

        System.out.println(root3.contains(0));


    }
}
