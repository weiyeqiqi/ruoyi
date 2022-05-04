package com.weiye.livedata.monitor.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 【直播分类展示】对象 bili_live_partition
 *
 * @author forever
 * @date 2022-04-19
 */
public class BiliLivePartition extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 分区类型ID */
    private String typeid;

    /** 分区名称 */
    @Excel(name = "分区名称")
    private String name;

    /** 分级级别 */
    @Excel(name = "分级级别")
    private String grade;

    /** 分区图例 */
    @Excel(name = "分区图例")
    private String picture;

    /** 分区状态 */
    @Excel(name = "分区状态")
    private String status;

    public void setTypeid(String typeid)
    {
        this.typeid = typeid;
    }

    public String getTypeid()
    {
        return typeid;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getGrade()
    {
        return grade;
    }
    public void setPicture(String picture)
    {
        this.picture = picture;
    }

    public String getPicture()
    {
        return picture;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("typeid", getTypeid())
                .append("name", getName())
                .append("grade", getGrade())
                .append("picture", getPicture())
                .append("status", getStatus())
                .toString();
    }
}

