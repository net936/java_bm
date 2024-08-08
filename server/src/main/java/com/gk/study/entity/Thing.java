package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

@Data
@TableName("b_thing")
public class Thing implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    public Long id;
    @TableField
    public String title;
    @TableField
    public String cover; // 封面
    @TableField
    public String description; // 描述
    @TableField
    public String level;
    @TableField
    public String status; // 状态
    @TableField
    public String createTime; // 时间
    @TableField
    public String score;
    @TableField
    public String bmsj; // 报名时间
    @TableField
    public String zzf; // 组织方
    @TableField
    public String jssj; // 竞赛时间
    @TableField
    public String jsdd; // 竞赛地点
    @TableField
    public String pv;
    @TableField
    public String rate;
    @TableField
    public String recommendCount;
    @TableField
    public String wishCount; // 点赞数
    @TableField
    public String collectCount;  // 收藏数
    @TableField
    public Long classificationId;

    @TableField(exist = false)
    public List<Long> tags; // 标签

    @TableField(exist = false)
    public MultipartFile imageFile;

    @TableField
    public String userId;
}
