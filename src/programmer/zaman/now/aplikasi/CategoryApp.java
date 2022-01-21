package programmer.zaman.now.aplikasi;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        category.setId(null);
        System.out.println(category.getId());

        category.setExpensive(true);
        System.out.println(category.isExpensive());

    }
}
