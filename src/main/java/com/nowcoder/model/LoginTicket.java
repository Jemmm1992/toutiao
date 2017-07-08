package com.nowcoder.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by xu_zj on 2017/6/3.
 */
@Setter
@Getter
@ToString
public class LoginTicket {
    private int id;
    private int userId;
    private Date expired;
    private int status;// 0有效，1无效
    private String ticket;
}
