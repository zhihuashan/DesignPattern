package PolicyMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 21:48
 * @Version 1.0
 */
//策略模式 定义抽象方法 所有支持公共接口
public abstract class PayStrategy {
    // 支付逻辑方法
    abstract  void algorithmInterface();
}
