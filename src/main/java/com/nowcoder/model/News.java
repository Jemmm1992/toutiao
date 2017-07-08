package com.nowcoder.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by xu_zj on 2017/5/30.
 */
@Setter
@Getter
@ToString
public class News {

  private int id;

  private String title;

  private String link;

  private String image;

  private int likeCount;

  private int commentCount;

  private Date createdDate;

  private int userId;

}
