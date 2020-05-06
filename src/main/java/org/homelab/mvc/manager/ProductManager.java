package org.homelab.mvc.manager;

import org.homelab.mvc.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductManager {

    private List<Product> products;

    public ProductManager() {

        this.products = prepareProducts();
    }

    private List<Product> prepareProducts() {

        List<Product> products = new ArrayList<>();
        Product prod = new Product("koszulki", "KoszulkaB");
        Product secondProd = new Product("koszulki", "KoszulkaA");
        Product thirdProd = new Product("spodnie", "SpodnieB");
        Product forthProd = new Product("spodnie", "SpodnieA");
        Product fifthProd = new Product("bluzy", "BluzaA");
        Product sixthProd = new Product("bluzy", "KoszulkaA");
        products.add(prod);
        products.add(secondProd);
        products.add(thirdProd);
        products.add(forthProd);
        products.add(fifthProd);
        products.add(sixthProd);
        return products;
    }

    public List<Product> findAll() {

        return products;
    }

    public List<Product> findByCategory(String categoryName) {

        return products.stream() //
                .filter(product -> categoryMatch(categoryName, product)) //
                .collect(Collectors.toList());
    }

    private boolean categoryMatch(String category, Product product) {

        String productCategory = product.getCategory();
        return category.equals(productCategory);
    }

    public List<String> getCategories() {

        List<String> result = new ArrayList<>();
        result.add("koszulki");
        result.add("spodnie");
        result.add("bluzy");
        return result;
    }
}