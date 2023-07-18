package DAO;

import pojo.OrderDetails;

import java.util.List;

/**
 * 订单操作接口
 * @author te9uila
 * @since 2023/7/17
 */
public interface OrderDao {
    /**
     * 根据用户id获得订单
     * @param userId 用户id
     * @return 该用户的订单集合
     */
    List<OrderDetails> getOrderDetails(int userId);

    /**
     * 添加订单（提前封装对象）
     * @param orderDetails 添加的订单对象
     * @return 是否添加订单成功
     */
    boolean addOrder(OrderDetails orderDetails);

    /**
     * 删除订单
     * （tips:先通过getOrder拉取订单集合，手动获取订单对象，再删除该订单）
     * @param orderDetails 删除的订单对象
     * @return 是否删除订单成功
     */
    boolean deleteOrder(OrderDetails orderDetails);


    /**
     * 更新订单状态，例如：未支付 => 已支付
     * （tips:先通过getOrder拉取订单集合，手动获取订单对象，更改订单 orderStatus属性，更新订单对象）
     * @param orderDetails 需要更新订单状态的订单对象
     * @return 是否更新订单成功
     */
    boolean updateOrder(OrderDetails orderDetails);
}
