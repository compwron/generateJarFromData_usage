package example;

import presenter.Hierarchy;

public class Example {
    public static void main(String... args){
        Hierarchy hierarchy = new Hierarchy();
        System.out.println("Cls list: " + hierarchy.getItemHierarchy().getDivisions().get(0).getDepartments().get(0).getClsList());
    }
}
