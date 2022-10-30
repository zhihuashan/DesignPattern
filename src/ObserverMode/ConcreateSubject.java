package ObserverMode;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 11:00
 * @Version 1.0
 */
//具体目标 通知对象的具体方法
public class ConcreateSubject extends Subject{
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变..");
        System.out.println("------");
        for(Object obs:observers){
            ((Observer) obs).response();
        }
    }
}
