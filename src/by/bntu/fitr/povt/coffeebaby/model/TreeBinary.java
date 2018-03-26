package by.bntu.fitr.povt.coffeebaby.model;


public class TreeBinary<T1 extends Comparable<T1>, T2> {
    static class Node<T1, T2> {
        T1 key;
        T2 value;
        Node<T1, T2> left, right;

        Node(T1 key, T2 value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<T1, T2> root = null;


    public Node add(T1 key, T2 value) {
        Node<T1, T2> x = root, y = null;

        while (x != null) {
            int result = key.compareTo(x.key);
            if (result == 0) {
                x.value = value;
            } else {
                y = x;
                if (result < 0) {
                    x = x.left;

                } else {
                    x = x.right;
                }
            }
        }
        Node<T1, T2> nextNode = new Node<T1, T2>(key, value);
        if (y == null) {
            root = nextNode;
        } else {
            if (key.compareTo(y.key) < 0) {
                y.left = nextNode;
            } else {
                y.right = nextNode;
            }
        }
        return x;
    }




    void printLeft(Node t) {
        if (t != null) {
            printLeft(t.left);
            System.out.println(t.key + " ");
            printLeft(t.right);
        }

    }

    public void printLeft() {
        printLeft(root);
        System.out.println();
    }

    void printRight(Node t) {
        if (t != null) {
            printRight(t.right);
            System.out.println(t.key + " ");

            printRight(t.left);
        }

    }

    public void printRight() {
        printRight(root);
        System.out.println();
    }

}
