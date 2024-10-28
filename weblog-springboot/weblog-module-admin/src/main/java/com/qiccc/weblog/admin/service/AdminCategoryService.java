package com.qiccc.weblog.admin.service;

import com.qiccc.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.qiccc.weblog.common.utils.Response;

public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);
}

