package com.qiccc.weblog.web.convert;

import com.qiccc.weblog.common.domain.dos.ArticleDO;
import com.qiccc.weblog.web.article.FindIndexArticlePageListRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ArticleConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleConvert INSTANCE = Mappers.getMapper(ArticleConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */

    FindIndexArticlePageListRspVO convertDO2VO(ArticleDO bean);

}
