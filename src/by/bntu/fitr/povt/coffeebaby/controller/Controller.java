package by.bntu.fitr.povt.coffeebaby.controller;


import by.bntu.fitr.povt.coffeebaby.model.TreeBinary;

public class Controller {
    public static void main(String[] args) {
        TreeBinary tree = new TreeBinary();
        tree.add(2);
        tree.printLeft();

        tree.printRight();
    }
}
