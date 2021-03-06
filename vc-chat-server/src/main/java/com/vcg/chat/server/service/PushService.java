package com.vcg.chat.server.service;

import com.vcg.chat.api.model.Request;
import com.vcg.chat.api.model.User;

import java.util.List;
import java.util.Set;

/**
 * created by wuyu on 2018/3/3
 */
public interface PushService {

    /**
     * 单连接推送
     *
     * @param request
     */
    void singlePush(Request request);

    /**
     * 多连接推送 一个用户可能连接到不同的机器上. 该方法 主要根据用户id 查询相关sessionId 进行转发调用
     *
     * @param request
     */
    void multiPush(Request request);

    /**
     * 查询所有连接的用户
     * @return 用户列表
     */
    Set<String> onlineUsers();

}
