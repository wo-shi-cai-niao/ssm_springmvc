package com.baizhi.service;


import com.baizhi.dao.FileDao;
import com.baizhi.entity.FileSave;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("fileService")
@Transactional
public class FileServiceImpl implements FileService {

    @Resource
    private FileDao fileDao;

    @Override
    public void add(FileSave file) {

    }

    @Override
    public void remove(String fileId) {

    }

    @Override
    public void modify(FileSave file) {

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<FileSave> findAll() {
       return fileDao.select();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public FileSave findOne(String fileId) {
       return fileDao.selectOne(fileId);
    }
}
