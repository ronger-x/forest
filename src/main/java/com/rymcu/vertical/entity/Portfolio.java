package com.rymcu.vertical.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author ronger
 */
@Data
@Table(name = "vertical_portfolio")
public class Portfolio {
    /** 主键 */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "id")
    private Integer idPortfolio;
    /** 作品集头像 */
    private String headImgUrl;
    /** 作品集名称 */
    private String name;
    /** 作品集作者 */
    private Integer portfolioAuthorId;
    /** 作品集介绍 */
    private String description;
    /** 创建时间 */
    private Date createdTime;
    /** 更新时间 */
    private Date updatedTime;
}
