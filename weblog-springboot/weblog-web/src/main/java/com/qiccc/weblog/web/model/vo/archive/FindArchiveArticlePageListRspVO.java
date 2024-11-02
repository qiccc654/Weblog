package com.qiccc.weblog.web.model.vo.archive;

import lombok.*;

import java.time.YearMonth;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindArchiveArticlePageListRspVO {
    /**
     * 归档的月份
     */
    private YearMonth month;

    private List<FindArchiveArticleRspVO> articles;

}
