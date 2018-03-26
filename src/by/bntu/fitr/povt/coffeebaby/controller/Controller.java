package by.bntu.fitr.povt.coffeebaby.controller;


import by.bntu.fitr.povt.coffeebaby.model.TreeBinary;

public class Controller {
    public static void main(String[] args) {
        TreeBinary tree = new TreeBinary();
        tree.add(3,1);
        tree.add(2,2);
        tree.add(4,3);
        tree.add(1,4);
        tree.add(9,5);
        tree.printLeft();

        tree.printRight();
    }
}
