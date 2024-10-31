package com.qiccc.weblog.admin.controller;

import com.qiccc.weblog.admin.model.vo.tag.AddTagReqVO;
import com.qiccc.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.qiccc.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.qiccc.weblog.admin.model.vo.tag.SearchTagReqVO;
import com.qiccc.weblog.admin.service.AdminTagService;
import com.qiccc.weblog.common.aspect.ApiOperationLog;
import com.qiccc.weblog.common.utils.PageResponse;
import com.qiccc.weblog.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Api(tags = "Admin 标签模块")
public class AdminTagController {

    @Autowired
    private AdminTagService TagService;

    @PostMapping("/tag/add")
    @ApiOperation(value = "添加标签")
    @ApiOperationLog(description = "添加标签")
    public Response addTag(@RequestBody @Validated AddTagReqVO addTagReqVO) {
        return TagService.addTags(addTagReqVO);
    }


    @PostMapping("/tag/list")
    @ApiOperation(value = "标签分页数据获取")
    @ApiOperationLog(description = "标签分页数据获取")
    public PageResponse findTagPageList(@RequestBody @Validated FindTagPageListReqVO findCategoryPageListReqVO) {
        return TagService.findTagPageList(findCategoryPageListReqVO);
    }

    @PostMapping("/tag/delete")
    @ApiOperation(value = "删除标签")
    @ApiOperationLog(description = "删除标签")
    public Response deleteTag(@RequestBody @Validated DeleteTagReqVO deleteTagReqVO) {
        return TagService.deleteTag(deleteTagReqVO);
    }
    @PostMapping("/tag/search")
    @ApiOperation(value = "标签模糊查询")
    @ApiOperationLog(description = "标签模糊查询")
    public Response searchTag(@RequestBody @Validated SearchTagReqVO searchTagReqVO) {
        return TagService.searchTag(searchTagReqVO);
    }
    /*
    @PostMapping("/category/select/list")
    @ApiOperation(value = "分类 Select 下拉列表数据获取")
    @ApiOperationLog(description = "分类 Select 下拉列表数据获取")
    public Response findCategorySelectList() {
        return categoryService.findCategorySelectList();
    }*/


}

