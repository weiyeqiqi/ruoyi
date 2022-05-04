package com.weiye.livedata.monitor.controller;

import java.util.List;
import java.io.IOException;

import com.weiye.livedata.monitor.entity.BiliLivePartition;
import com.weiye.livedata.monitor.service.IBiliLivePartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 【直播分类展示】
 *
 * @author forever
 * @date 2022-04-19
 */
@RestController
@RequestMapping("/partition")
public class BiliLivePartitionController extends BaseController
{
    @Autowired
    private IBiliLivePartitionService biliLivePartitionService;

    /**
     * 查询【主页】列表
     */
    @GetMapping("/list/tree")
    public TableDataInfo list()
    {
        List<BiliLivePartition> list = biliLivePartitionService.selectBiliLivePartitionAllList();
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:partition:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BiliLivePartition biliLivePartition)
    {
        List<BiliLivePartition> list = biliLivePartitionService.selectBiliLivePartitionList(biliLivePartition);
        ExcelUtil<BiliLivePartition> util = new ExcelUtil<BiliLivePartition>(BiliLivePartition.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @RequiresPermissions("system:partition:query")
    @GetMapping(value = "/{typeid}")
    public AjaxResult getInfo(@PathVariable("typeid") String typeid)
    {
        return AjaxResult.success(biliLivePartitionService.selectBiliLivePartitionByTypeid(typeid));
    }

    /**
     * 新增【请填写功能名称】
     */
    @RequiresPermissions("system:partition:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BiliLivePartition biliLivePartition)
    {
        return toAjax(biliLivePartitionService.insertBiliLivePartition(biliLivePartition));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("system:partition:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BiliLivePartition biliLivePartition)
    {
        return toAjax(biliLivePartitionService.updateBiliLivePartition(biliLivePartition));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:partition:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{typeids}")
    public AjaxResult remove(@PathVariable String[] typeids)
    {
        return toAjax(biliLivePartitionService.deleteBiliLivePartitionByTypeids(typeids));
    }
}

