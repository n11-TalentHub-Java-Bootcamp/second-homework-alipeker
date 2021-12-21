package ali.dao;

import ali.base.BaseDao;
import ali.entity.Category;
import org.hibernate.query.Query;

import java.util.List;

public class CategoryDao extends BaseDao {

    public List<Category> findAll(){
        Query query = getCurrentSession().createQuery("select category from Category as category");
        return  query.list();
    }

}
