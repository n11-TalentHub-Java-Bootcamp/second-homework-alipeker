package ali.application;

import ali.entity.Product;
import ali.entityService.ProductEntityService;

import java.util.List;

public class ProductFindAllByCategoryLevel {

    public static void main(String[] args) {

        ProductEntityService productEntityService = new ProductEntityService();
        List<Product> productList = productEntityService.findAllProductByCategoryLevel(3L);

        for(Product product: productList){
            System.out.println(product);
        }
    }
}
