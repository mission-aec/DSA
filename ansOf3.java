public class ansOf3 {
    static class node {
        int data;
        node left;
        node right;
        node(int data, node left, node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static void insert(int data, node root){
        if(data>root.data){
            if(root.right==null){
                root.right = new node(data, null, null);
            }
            else insert(data, root.right);
        }
        else if(data<root.data){
            if(root.left==null){
                root.left = new node(data, null, null);
            }
            else insert(data, root.left);
        }
        else{
            root.data = data;
        }
    }

    static void search(int data, node root){
        if(data == root.data) System.out.println("Data is in This node!");
        else if(data <root.data){
            System.out.println("Go to Left node");
            search(data, root.left);
        }
        else if(data >root.data){
            System.out.println("Go to Right node");
            search(data, root.right);
        }
        else System.out.println( "error!");
    }

    public static void main(String[] args) {
        node root = new node(16, null, null);
        System.out.println("This is Root");

        insert(15, root);
        insert(17, root);
        insert(14, root);
        insert(18, root);
        insert(20, root);
        insert(2, root);
        insert(4, root);
        insert(3, root);

        search(2, root);
    }

}
