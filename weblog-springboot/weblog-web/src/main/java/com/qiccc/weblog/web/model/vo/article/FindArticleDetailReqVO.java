package com.qiccc.weblog.web.model.vo.article;

import io.swagger.annotations.ApiModel;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "查询文章详情 VO")
public class FindArticleDetailReqVO {
    /**
     * 文章 ID
     */
    private Long articleId;
}