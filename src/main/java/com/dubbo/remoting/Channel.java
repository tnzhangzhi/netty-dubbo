package com.dubbo.remoting;

import java.net.InetSocketAddress;

/**
 * Created by zz1987 on 2017/7/10.
 */
public interface Channel {

    InetSocketAddress getRemoteAddress();

    boolean isConnected();

    boolean hasAttribute(String key);

    Object getAttribute(String key);

    void setAttribute(String key ,Object value);

    void removeAttribute(String key);
}
