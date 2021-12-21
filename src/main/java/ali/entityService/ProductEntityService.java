package ali.entityService;

import ali.dao.ProductDao;
import ali.dto.ProductDetailDto;
import ali.entity.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductEntityService {

    private ProductDao productDao;

    public ProductEntityService(){
        productDao =  new ProductDao();
    }

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public Product findById(Long  id){
        return  productDao.findById(id);
    }

    public List<Product> findAllProductPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe){
        return productDao.findAllProductPriceGeAndPriceLe(priceGe,priceLe);
    }

    public List<Product> findAllProductPriceGeBetweenPriceLe(BigDecimal priceGe,BigDecimal priceLe) {
        return productDao.findAllProductPriceGeAndPriceLe(priceGe, priceLe);
    }

    public List<Product> findAllProductByCategoryLevel(Long categoryLevel){
        return productDao.findAllProductByCategoryLevel(categoryLevel);
    }

    public List<ProductDetailDto> findAllProductDetailDtoByCategoryLevel(Long categoryLevel){
        return productDao.findAllProductDetailDtoByCategoryLevel(categoryLevel);
    }
}
