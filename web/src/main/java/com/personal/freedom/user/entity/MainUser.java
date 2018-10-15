package com.personal.freedom.user.entity;

import java.io.Serializable;

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
 * 用户主表
 * </p>
 *
 * @author guoys123
 * @since 2018-08-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("main_user")
public class MainUser extends Model<MainUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键
     */
    @TableId("id_main_user")
    private String idMainUser;
    /**
     * 用户登入名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 用户密码
     */
    @TableField("user_password")
    private String userPassword;
    /**
     * 用户手机号
     */
    @TableField("user_phone")
    private String userPhone;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;


    @Override
    protected Serializable pkVal() {
        return this.idMainUser;
    }

}
