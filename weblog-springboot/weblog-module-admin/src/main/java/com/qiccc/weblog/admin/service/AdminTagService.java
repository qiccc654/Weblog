package com.qiccc.weblog.admin.service;

import com.qiccc.weblog.admin.model.vo.tag.AddTagReqVO;
import com.qiccc.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.qiccc.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.qiccc.weblog.admin.model.vo.tag.SearchTagReqVO;
import com.qiccc.weblog.common.utils.PageResponse;
import com.qiccc.weblog.common.utils.Response;

public interface AdminTagService {

/*创建标签*/
    Response addTags(AddTagReqVO addTagReqVO);
/*标签分页查询*/
    PageResponse findTagPageList(FindTagPageListReqVO findCategoryPageListReqVO);
/*删除标签*/
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);
/*根据标签关键词模糊查询*/
    Response searchTag(SearchTagReqVO searchTagReqVO);
    /**
     * 查询标签 Select 列表数据
     * @return
     */
    Response findTagSelectList();
}

