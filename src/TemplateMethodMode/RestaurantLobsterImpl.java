package TemplateMethodMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 20:27
 * @Version 1.0
 */
// 顾客2
public class RestaurantLobsterImpl extends RestaurantTemplate{
    @Override
    void spotMenu() {
        System.out.println("龙虾");
    }

    @Override
    void payment() {
        System.out.println("50块");
    }
}
