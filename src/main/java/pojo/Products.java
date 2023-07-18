package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 商品表：包括商品名，商品描述，商品价格
 * @author te9uila
 * @since 2023/7/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    /**
     * 商品id
     */
    private int id;
    /**
     * 所属分类对应id
     */
    private int categoryId;
    /**
     * 商品名
     */
    private String name;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 商品价格
     */
    private BigDecimal price;
}
