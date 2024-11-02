package com.qiccc.weblog.web.controller;

import com.qiccc.weblog.common.aspect.ApiOperationLog;
import com.qiccc.weblog.common.utils.Response;
import com.qiccc.weblog.web.model.vo.FindIndexArticlePageListReqVO;
import com.qiccc.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;
import com.qiccc.weblog.web.service.ArchiveService;
import com.qiccc.weblog.web.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "文章")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/article/list")
    @ApiOperation(value = "获取首页文章分页数据")
    @ApiOperationLog(description = "获取首页文章分页数据")
    public Response findArticlePageList(@RequestBody FindIndexArticlePageListReqVO findIndexArticlePageListReqVO) {
        return articleService.findArticlePageList(findIndexArticlePageListReqVO);
    }
    @RestController
    @Api(tags = "文章归档")
    public class ArchiveController {

        @Autowired
        private ArchiveService archiveService;

        @PostMapping("/archive/list")
        @ApiOperation(value = "获取文章归档分页数据")
        @ApiOperationLog(description = "获取文章归档分页数据")
        public Response findArchivePageList(@RequestBody FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO) {
            return archiveService.findArchivePageList(findArchiveArticlePageListReqVO);
        }

    }

}

