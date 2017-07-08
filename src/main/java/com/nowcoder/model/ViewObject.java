package com.nowcoder.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xu_zj on 2017/5/30.
 */
public class ViewObject {
    private Map<String, Object> objs = new HashMap<String, Object>();
    public void set(String key, Object value) {
        objs.put(key, value);
    }

    public Object get(String key) {
        return objs.get(key);
    }
}
