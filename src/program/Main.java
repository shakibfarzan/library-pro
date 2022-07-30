package program;

import controllers.CategoryController;

public class Main {
    public static void main(String[] args) {
        System.out.println(CategoryController.getInstance().getCategories());
    }
}
