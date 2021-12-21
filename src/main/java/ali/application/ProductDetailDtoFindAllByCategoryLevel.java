package ali.application;

import ali.dto.ProductDetailDto;
import ali.entityService.ProductEntityService;

import java.util.List;

public class ProductDetailDtoFindAllByCategoryLevel {

    public static void main(String[] args) {

        ProductEntityService productEntityService = new ProductEntityService();
        List<ProductDetailDto> productDetailDtoList = productEntityService.findAllProductDetailDtoByCategoryLevel(3L);

        for(ProductDetailDto productDetailDto:productDetailDtoList){
            System.out.println(productDetailDto);
        }
    }

}
