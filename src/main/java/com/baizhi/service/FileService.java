package com.baizhi.service;


import com.baizhi.entity.FileSave;


import java.util.List;

public interface FileService {
    void add(FileSave file);
    void remove(String fileId);
    void modify(FileSave file);
    List<FileSave> findAll();
    FileSave findOne(String fileId);
}
