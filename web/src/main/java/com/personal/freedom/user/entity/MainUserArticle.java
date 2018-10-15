package com.personal.freedom.user.entity;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户相册
 * </p>
 *
 * @author guoys123
 * @since 2018-08-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("main_user_article")
public class MainUserArticle extends Model<MainUserArticle> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户文章主键
     */
    @TableId("id_main_user_article")
    private String idMainUserArticle;
    /**
     * 用户主键
     */
    @TableField("id_main_user")
    private String idMainUser;
    /**
     * 用户图片主键集合
     */
    @TableField("id_main_user_picture_id")
    private String idMainUserPictureId;
    /**
     * 用户相册主键
     */
    @TableField("id_main_album_id")
    private String idMainAlbumId;
    /**
     * 文章标题
     */
    @TableField("article_title")
    private String articleTitle;
    /**
     * 文章记录地点
     */
    @TableField("article_place")
    private String articlePlace;
    /**
     * 文章内容
     */
    @TableField("article_content")
    private String articleContent;
    /**
     * 文章标签
     */
    @TableField("article_lable")
    private String articleLable;
    /**
     * 文章大小
     */
    @TableField("article_size")
    private BigDecimal articleSize;
    /**
     * 是否删除
     */
    @TableField("delete_flag")
    private Boolean deleteFlag;
    /**
     * 更新时间
     */
    @TableField("update_date")
    private Date updateDate;
    /**
     * 更新用户
     */
    @TableField("update_user")
    private String updateUser;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 创建用户
     */
    @TableField("create_user")
    private String createUser;


    @Override
    protected Serializable pkVal() {
        return this.idMainUserArticle;
    }

}
