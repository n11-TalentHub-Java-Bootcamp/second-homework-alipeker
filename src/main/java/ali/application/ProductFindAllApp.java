package ali.application;

import ali.entity.Product;
import ali.entityService.ProductEntityService;

import java.util.List;

public class ProductFindAllApp {

    public static void main(String[] args) {

        ProductEntityService productEntityService = new ProductEntityService();
        List<Product> productList = productEntityService.findAll();

        for(Product product:productList){
            System.out.println(product.toString());
        }
    }
}
