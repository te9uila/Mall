package DAO.Impl;

import DAO.CategoriesDao;
import Util.DBUtil;
import pojo.Categories;
import pojo.Comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author te9uila
 * @since 2023/7/18
 */
public class CategoriesDaoImpl implements CategoriesDao {
    @Override
    public Categories getCategories(String name) {
        String sql = "select * from categories where name = ?";
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return new Categories(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getString("description"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean setCategory(Categories categories) {
        String sql = "insert into categories (name, description) VALUES (?,?)";
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,categories.getName());
            preparedStatement.setString(2,categories.getDescription());
            preparedStatement.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteCategory(Categories categories) {
        String sql = "delete from categories where id = ?";
        try(Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,categories.getId());
            preparedStatement.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
