package com.weiye.livedata.monitor.dao;

import com.weiye.livedata.monitor.entity.BiliLivePartition;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 【直播分类展示】Mapper接口
 *
 * @author forever
 * @date 2022-04-19
 */
public interface BiliLivePartitionDao
{
    /**
     * 查询【请填写功能名称】
     *
     * @param typeid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BiliLivePartition selectBiliLivePartitionByTypeid(String typeid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param biliLivePartition 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BiliLivePartition> selectBiliLivePartitionList(BiliLivePartition biliLivePartition);

    /**
     * 新增【请填写功能名称】
     *
     * @param biliLivePartition 【请填写功能名称】
     * @return 结果
     */
    public int insertBiliLivePartition(BiliLivePartition biliLivePartition);

    /**
     * 修改【请填写功能名称】
     *
     * @param biliLivePartition 【请填写功能名称】
     * @return 结果
     */
    public int updateBiliLivePartition(BiliLivePartition biliLivePartition);

    /**
     * 删除【请填写功能名称】
     *
     * @param typeid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBiliLivePartitionByTypeid(String typeid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param typeids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBiliLivePartitionByTypeids(String[] typeids);

    /**
     * 查询主页全部列表
     *
     * @return 【主页列表】集合
     */
    public List<BiliLivePartition> selectBiliLivePartitionAllList();
}

