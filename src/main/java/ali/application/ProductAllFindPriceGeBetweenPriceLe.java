package ali.application;

import ali.entity.Product;
import ali.entityService.ProductEntityService;

import java.math.BigDecimal;
import java.util.List;

public class ProductAllFindPriceGeBetweenPriceLe {

    public static void main(String[] args) {
        ProductEntityService productEntityService = new ProductEntityService();
        List<Product> productList = productEntityService.findAllProductPriceGeBetweenPriceLe(BigDecimal.valueOf(100),BigDecimal.valueOf(1000));

        for(Product product : productList){
            System.out.println(product);
        }
    }
}
