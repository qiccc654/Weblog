package com.qiccc.weblog.admin.service;

import com.qiccc.weblog.admin.model.vo.blogSettings.UpdateBlogSettingsReqVO;
import com.qiccc.weblog.common.utils.Response;

public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);
    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}

