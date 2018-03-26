package by.bntu.fitr.povt.coffeebaby.model;




public class TreeBinary<T extends Integer> {
    Node root;


    public Node add(Node root, T key){
        if(root == null){
            Node temp = new Node();
            temp.key = key;
            return temp;
        }
        if(root.key.compareTo(key) == 1){
            root.r = add(root.r,key);
        }
        if(root.key.compareTo(key) == -1){
            root.l = add(root.r,key);
        }
        return root;
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
