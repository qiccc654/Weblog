package com.qiccc.weblog.web.service;

import com.qiccc.weblog.common.utils.Response;

public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();
}
