package com.tantsian.boot.model;

import apijson.MethodAccess;
import apijson.framework.BaseModel;
import lombok.Data;

import java.util.Date;
import java.util.List;

import static apijson.RequestRole.*;

/**
 * @author LY
 * @description: TODO
 * @title: Stone
 * @projectName apijson-boot
 * @date 2020/11/30
 */
@MethodAccess(
        POST = {UNKNOWN, ADMIN},
        GET = {UNKNOWN, LOGIN, ADMIN},
        DELETE = {ADMIN}
)
@Data
public class TExamPaperUser{

    private Long id;

    private Long examPaperId;

    private Long userId;

    private Byte status;

    private Byte correctStatus;

    private Long createUser;

    private Long modifiUser;

    private Date gmtCreate;

    private Date gmtModified;

    private Byte isDeleted;

    private static final long serialVersionUID = 1L;
}
