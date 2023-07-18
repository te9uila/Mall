import DAO.AttributesDao;
import DAO.CategoriesDao;
import DAO.CommentDao;
import DAO.Impl.AttributesDaoImpl;
import DAO.Impl.CategoriesDaoImpl;
import DAO.Impl.CommentDaoImpl;
import DAO.Impl.ProductDaoImpl;
import DAO.ProductDao;
import pojo.Attributes;
import pojo.Categories;
import pojo.Comment;
import pojo.Products;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author te9uila
 * @since 2023/7/18
 */
public class Application {
    public static void main(String[] args) {
        AttributesDao attributesDao = new AttributesDaoImpl();
        System.out.println(attributesDao.deleteAttribute("配料表"));
    }
}
