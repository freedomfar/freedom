package com.personal.freedom.user.entity;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户相片
 * </p>
 *
 * @author guoys123
 * @since 2018-08-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("main_user_picture")
public class MainUserPicture extends Model<MainUserPicture> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户图片主键
     */
    @TableId("id_main_user_picture")
    private String idMainUserPicture;
    /**
     * 用户主键
     */
    @TableField("id_main_user")
    private String idMainUser;
    /**
     * 用户相册主键
     */
    @TableField("id_main_user_album")
    private String idMainUserAlbum;
    /**
     * 图片标签
     */
    @TableField("picture_lable")
    private String pictureLable;
    /**
     * 图片存储地址
     */
    @TableField("picture_url")
    private String pictureUrl;
    /**
     * 图片描述
     */
    @TableField("picture_description")
    private String pictureDescription;
    /**
     * 图片大小
     */
    @TableField("picture_size")
    private BigDecimal pictureSize;
    /**
     * 是否删除
     */
    @TableField("delete_flag")
    private Boolean deleteFlag;
    /**
     * 是否首页滚动
     */
    @TableField("index_flag")
    private Boolean indexFlag;
    /**
     * 是否为封面
     */
    @TableField("cover_flag")
    private Boolean coverFlag;
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
        return this.idMainUserPicture;
    }

}
