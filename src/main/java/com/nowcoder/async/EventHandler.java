package com.nowcoder.async;

import java.util.List;

/**
 * Created by xu_zj on 2017/6/16.
 */
public interface EventHandler {
    void doHandle(EventModel model);
    List<EventType> getSupportEventTypes();
}
