package ObserverMode.SchoolBell;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 15:41
 * @Version 1.0
 */
//抽象观察者类：铃声事件监听器
public interface BellEventListener {
    // 事件处理方法，听到铃声
    public void heardBell(DesignMode.Observer.SchoolBell.RingEvent e);
}
