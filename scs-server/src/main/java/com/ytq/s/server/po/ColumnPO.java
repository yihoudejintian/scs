package com.ytq.s.server.po;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yuantongqin
 * description: '栏目表'
 * 2019/12/30
 */
@TableName("column")
@Data
public class ColumnPO {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 渠道编码
     */
    @TableField("channel_no")
    private String channelNo;

    /**
     * 栏目编码
     */
    @TableField("column_code")
    private String columnCode;
    /**
     * 栏目名称
     */
    @TableField("column_name")
    private String columnName;

    @TableField("parent_id")
    private String parentId;
    /**
     * 栏目类型
     */
    @TableField("column_type")
    private String columnType;
    /**
     * 图标URL
     */
    @TableField("img_url")
    private String imgUrl;
    /**
     * 栏目编码
     */
    @TableField("category_banner")
    private String categoryBanner;
    /**
     * 排序字段
     */
    @TableField("order")
    private String order;
    /**
     * 备注
     */
    @TableField("remark")
    private String remark;
    @TableField("create_by")
    private String createBy;
    @TableField("show")
    private String show;
    @TableField("create_time")
    private LocalDateTime createTime;
    @TableField("update_time")
    private LocalDateTime updateTime;
    @TableField("valid")
    private Integer valid;

}
