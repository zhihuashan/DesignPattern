package DesignMode.Observer.SchoolBell;

import java.util.EventObject;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/23 15:40
 * @Version 1.0
 */
//铃声事件类：用于封装事件源及一些与事件相关的参数
public class RingEvent extends EventObject {
    private static final long serialVersionUID = 1L;
    private boolean sound;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public RingEvent(Object source,boolean sound) {
        super(source);
        this.sound =sound;
    }

    public boolean getSound() {
        return this.sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
