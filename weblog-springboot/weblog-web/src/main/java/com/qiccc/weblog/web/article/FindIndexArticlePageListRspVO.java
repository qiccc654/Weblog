package com.qiccc.weblog.web.article;

import com.qiccc.weblog.web.category.FindCategoryListRspVO;
import com.qiccc.weblog.web.tag.FindTagListRspVO;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindIndexArticlePageListRspVO {
    private Long id;
    private String cover;
    private String title;
    private LocalDateTime createTime;
    private String summary;
    /**
     * 文章分类
     */
    private FindCategoryListRspVO category;

    /**
     * 文章标签
     */
    private List<FindTagListRspVO> tags;
}

