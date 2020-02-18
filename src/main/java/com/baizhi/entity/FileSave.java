package com.baizhi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class FileSave {
    private String fileId;
    private String originFileName;
    private String newFileName;
    private String extension;
    private String path;
    private String fileSize;
    private String contentType;
    private Integer downloadCounts;
    private String userId;
    private Date createTime;
    private User user;
}
