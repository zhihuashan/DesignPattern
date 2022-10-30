package PolicyMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 21:51
 * @Version 1.0
 */

public class Context {
    PayStrategy payStrategy;

    public Context(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
    public void algorithmInterface(){
        payStrategy.algorithmInterface();
    }
}
