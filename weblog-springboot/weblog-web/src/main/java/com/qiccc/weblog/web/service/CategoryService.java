package com.qiccc.weblog.web.service;

import com.qiccc.weblog.common.utils.Response;

public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList();
}
