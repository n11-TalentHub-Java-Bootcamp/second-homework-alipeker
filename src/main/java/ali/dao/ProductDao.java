package ali.dao;

import ali.base.BaseDao;
import ali.dto.ProductDetailDto;
import ali.entity.Product;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class ProductDao extends BaseDao {
    String sql;
    Query query;

    public List<Product> findAll(){
        sql = "select product from Product as product";
        query = getCurrentSession().createQuery(sql);
        return query.list();
    }

    public Product findById(Long id){
       sql = "select product from Product product where product.id = :givenId";
       query = getCurrentSession().createQuery(sql);
       query.setParameter("givenId",id);
       return (Product) query.uniqueResult();
    }

    public List<Product> findAllProductPriceGeAndPriceLe(BigDecimal priceGe,BigDecimal priceLe){

       sql = "select product from Product product where 1=1 ";

        if (priceGe != null){
            sql = sql + " and product.price >= :priceGe ";
        }

        if (priceLe != null){
            sql = sql + " and product.price <= :priceLe ";
        }

        query = getCurrentSession().createQuery(sql);
        query.setParameter("priceLe", priceLe);
        query.setParameter("priceGe", priceGe);

        return query.list();
    }

    public List<Product> findAllProductPriceGeBetweenPriceLe(BigDecimal priceGe, BigDecimal priceLe){

        sql = "select product from Product product where 1=1 ";

        if (priceGe != null && priceLe != null){
            sql = sql + " and product.price between :priceGe and :priceLe ";
        }

        query = getCurrentSession().createQuery(sql);
        query.setParameter("priceLe", priceLe);
        query.setParameter("priceGe", priceGe);

        return query.list();
    }

    public List<Product> findAllProductByCategoryLevel(Long categoryLevel) {
        sql = "select product from Product product " +
                "left join Category category on product.category.id = category.id " +
                "where category.categoryLevel= :categoryLevel";
        query = getCurrentSession().createQuery(sql);
        query.setParameter("categoryLevel", categoryLevel);

        return query.list();
    }

    public List<ProductDetailDto> findAllProductDetailDtoByCategoryLevel(Long categoryLevel){
        sql = "select" +
                " new ali.dto.ProductDetailDto(product.name,category.name,product.price)" +
                "from Product product " +
                "left join Category category on product.category.id = category.id " +
                "where category.categoryLevel= :categoryLevel";
        query = getCurrentSession().createQuery(sql);
        query.setParameter("categoryLevel", categoryLevel);

        return query.list();
    }

}
