package com.vcg.chat.sample.model;

import com.vcg.chat.api.model.User;
import com.vcg.chat.logic.model.PriMessage;
import com.vcg.chat.logic.model.UserDialogue;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * created by wuyu on 2018/3/13
 */
@Data
@Accessors(chain = true)
public class UserDialogueDTO {

    /**
     * 好友
     */
    private User user;

    /**
     * 好友对话
     */
    private UserDialogue userDialogue;

    /**
     * 消息列表
     */
    private List<PriMessage> priMessages;
}
