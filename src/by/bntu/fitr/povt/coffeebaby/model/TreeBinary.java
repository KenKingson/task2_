package by.bntu.fitr.povt.coffeebaby.model;




public class TreeBinary<T extends Integer> {
    Node root;

    static class Node<T> {
        T key;
        Node l;
        Node r;
        Node parent;

        public Node(T key, Node parent) {
            this.key = key;

            this.parent = parent;
        }
    }



    Node add(Node root, T key){
        if(root == null){
            root = new Node(key);
        }
        else{
            if(key < root.key)
                root.l = add(root.l, root, key);
            else
                root.r = add(root.r,root,key);
        }
        return root;
    }

    public void add(T key,int value){
        root = add(root,null,key);
    }




    void printLeft(Node t){
        if(t != null){
            printLeft(t.l);
            System.out.println(t.key + " ");
            printLeft(t.r);
        }

    }
    public void printLeft(){
        printLeft(root);
        System.out.println();
    }

    void printRight(Node t){
        if(t != null){
            printRight(t.r);
            System.out.println(t.key + " ");

            printRight(t.l);
        }

    }
    public void printRight(){
        printRight(root);
        System.out.println();
    }

}
