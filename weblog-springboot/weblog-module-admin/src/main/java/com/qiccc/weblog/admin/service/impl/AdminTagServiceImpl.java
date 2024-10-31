package com.qiccc.weblog.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiccc.weblog.admin.model.vo.tag.*;

import com.qiccc.weblog.admin.service.AdminTagService;
import com.qiccc.weblog.common.domain.dos.TagDO;
import com.qiccc.weblog.common.domain.mapper.TagMapper;

import com.qiccc.weblog.common.enums.ResponseCodeEnum;
import com.qiccc.weblog.common.model.vo.SelectRspVO;
import com.qiccc.weblog.common.utils.PageResponse;
import com.qiccc.weblog.common.utils.Response;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AdminTagServiceImpl extends ServiceImpl<TagMapper, TagDO> implements AdminTagService {

    @Autowired
    private TagMapper tagMapper;

    /*添加标签集合*/
    @Override
    public Response addTags(AddTagReqVO addTagReqVO) {
        List<TagDO> tagDOS = addTagReqVO.getTags()
                .stream().map(tagName -> TagDO.builder()
                        .name(tagName.trim())
                        .createTime(LocalDateTime.now())
                        .updateTime(LocalDateTime.now())
                        .build())
                .collect(Collectors.toList());
        /*伪批量插入*/
        try {
            saveBatch(tagDOS);
        } catch (Exception e) {
            /*插入重复信息时候不报错只提示*/
            log.warn("标签已存在", e);
        }
        return Response.success();
    }

    /*标签分页查询*/
    @Override
    public PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO) {
        //分页查询,条件参数
        Long current = findTagPageListReqVO.getCurrent();
        Long size = findTagPageListReqVO.getSize();
        String name = findTagPageListReqVO.getName();
        LocalDate startDate = findTagPageListReqVO.getStartDate();
        LocalDate endDate = findTagPageListReqVO.getEndDate();

        //分页查询
        Page<TagDO> page = tagMapper.selectPageList(current, size, name, startDate, endDate);

        List<TagDO> records = page.getRecords();
        //do转vo
        List<FindTagPageListRspVO> vos = null;
        if (!CollectionUtils.isEmpty(records)) {
            vos = records.stream().map(tagDO -> FindTagPageListRspVO.builder()
                    .id(tagDO.getId())
                    .name(tagDO.getName())
                    .createTime(tagDO.getCreateTime())
                    .build()).collect(Collectors.toList());
        }

        return PageResponse.success(page, vos);
    }

    @Override
    public Response deleteTag(DeleteTagReqVO deleteTagReqVO) {
        //获取标签id
        Long tagId = deleteTagReqVO.getId();
        //根据标签id删除数据
        int count = tagMapper.deleteById(tagId);

        return count == 1 ? Response.success() : Response.fail(ResponseCodeEnum.TAG_NOT_EXISTED);
    }

    /*根据标签关键字模糊查询*/
    @Override
    public Response searchTag(SearchTagReqVO searchTagReqVO) {
        String key = searchTagReqVO.getKey();
        //执行模糊查询
        List<TagDO> tagDOS = tagMapper.selectByKey(key);
        //do转vo
        List<SelectRspVO> vos = null;
        if (!CollectionUtils.isEmpty(tagDOS)) {
            vos = tagDOS.stream()
                    .map(tagDO -> SelectRspVO.builder()
                            .label(tagDO.getName())
                            .value(tagDO.getId())
                            .build()).collect(Collectors.toList());
        }

        return Response.success(vos);
    }
}
