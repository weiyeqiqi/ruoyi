package com.weiye.livedata.monitor.service.impl;

import java.util.List;

import com.weiye.livedata.monitor.dao.BiliLivePartitionDao;
import com.weiye.livedata.monitor.entity.BiliLivePartition;
import com.weiye.livedata.monitor.service.IBiliLivePartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 【直播分类展示】Service业务层处理
 *
 * @author ruoyi
 * @date 2022-04-19
 */
@Service
public class BiliLivePartitionServiceImpl implements IBiliLivePartitionService
{
    @Resource
    private BiliLivePartitionDao BiliLivePartitionDao;

    /**
     * 查询【请填写功能名称】
     *
     * @param typeid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BiliLivePartition selectBiliLivePartitionByTypeid(String typeid)
    {
        return BiliLivePartitionDao.selectBiliLivePartitionByTypeid(typeid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param biliLivePartition 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BiliLivePartition> selectBiliLivePartitionList(BiliLivePartition biliLivePartition)
    {
        return BiliLivePartitionDao.selectBiliLivePartitionList(biliLivePartition);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param biliLivePartition 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBiliLivePartition(BiliLivePartition biliLivePartition)
    {
        return BiliLivePartitionDao.insertBiliLivePartition(biliLivePartition);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param biliLivePartition 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBiliLivePartition(BiliLivePartition biliLivePartition)
    {
        return BiliLivePartitionDao.updateBiliLivePartition(biliLivePartition);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param typeids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBiliLivePartitionByTypeids(String[] typeids)
    {
        return BiliLivePartitionDao.deleteBiliLivePartitionByTypeids(typeids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param typeid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBiliLivePartitionByTypeid(String typeid)
    {
        return BiliLivePartitionDao.deleteBiliLivePartitionByTypeid(typeid);
    }

    /**
     * 查询主页全部列表
     *
     * @return 【主页列表】集合
     */
    public List<BiliLivePartition> selectBiliLivePartitionAllList()
    {
        return BiliLivePartitionDao.selectBiliLivePartitionAllList();
    }
}

