package DAO;

import pojo.Categories;
import pojo.Products;

/**
 * 商品操作接口
 * @author te9uila
 * @since 2023/7/17
 */
public interface ProductDao {
    /**
     * 跟根据产品名，获得产品对象
     * @param productName 产品名
     * @return 产品对象
     */
    Products getProduct(String productName);

    /**
     * 添加商品操作
     * @param products 添加的商品对象
     * @return 是否添加商品成功
     */
    boolean addProduct(Products products);

    /**
     * 下架商品操作
     * @param products 下架的商品对象
     * @return 是否下架成功
     */
    boolean dropProduct(Products products);
}
