package ali.entityService;

import ali.dao.CategoryDao;
import ali.entity.Category;

import java.util.List;

public class CategoryEntityService {

    private CategoryDao categoryDao;

    public CategoryEntityService(){
        categoryDao = new CategoryDao();
    }

    public List<Category> findAll(){
        return categoryDao.findAll();
    }

}
