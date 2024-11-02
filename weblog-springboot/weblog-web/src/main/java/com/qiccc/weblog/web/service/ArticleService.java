package com.qiccc.weblog.web.service;

import com.qiccc.weblog.common.utils.Response;
import com.qiccc.weblog.web.model.vo.FindIndexArticlePageListReqVO;

public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);
}
