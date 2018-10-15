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
@TableName("main_user_album")
public class MainUserAlbum extends Model<MainUserAlbum> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户相册主键
     */
    @TableId("id_main_user_album")
    private String idMainUserAlbum;
    /**
     * 用户主键
     */
    @TableField("id_main_user")
    private String idMainUser;
    /**
     * 用户文章主键
     */
    @TableField("id_main_user_article")
    private String idMainUserArticle;
    /**
     * 相册名称
     */
    @TableField("album_name")
    private String albumName;
    /**
     * 相册拍摄地点
     */
    @TableField("album_place")
    private String albumPlace;
    /**
     * 相册描述
     */
    @TableField("album_description")
    private String albumDescription;
    /**
     * 相册大小
     */
    @TableField("album_size")
    private BigDecimal albumSize;
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
    @TableField("crete_date")
    private Date creteDate;
    /**
     * 创建用户
     */
    @TableField("crete_user")
    private String creteUser;


    @Override
    protected Serializable pkVal() {
        return this.idMainUserAlbum;
    }

}
