package com.qiccc.weblog.common.enums;

import com.qiccc.weblog.common.exception.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface {
    // ----------- 通用异常状态码 -----------
    SYSTEM_ERROR("10000", "出错啦，后台小哥正在努力修复中..."),

    PARAM_NOT_VALID("10001", "参数错误"),
    // ----------- 业务异常状态码 -----------,
    PRODUCT_NOT_FOUND("20000", "该产品不存在（测试使用）"),

    LOGIN_FAIL("20000", "登录失败"),
    USERNAME_OR_PWD_ERROR("20001", "用户名或密码错误"),
    UNAUTHORIZED("20002", "无访问权限，请先登录！"),
    FORBIDDEN("20004", "演示账号仅支持查询操作！"),
    USERNAME_NOT_FOUND("20003", "该用户不存在"),
    CATEGORY_NAME_IS_EXISTED("20005", "该分类已存在，请勿重复添加！"),
    TAG_NOT_EXISTED("20007", "该标签不存在！"),
    FILE_UPLOAD_FAILED("20008", "文件上传失败！"),


    ;

    private String errorCode;
    private String errorMessage;



}
