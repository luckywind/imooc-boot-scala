package com.imooc.service;

import com.imooc.domain.MetaDatabase;
import com.imooc.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MetaDatabaseService {
    //私有repository属性
    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;


    @Transactional //涉及到数据库事物
    public void save(MetaDatabase metaDataBase) {
        metaDatabaseRepository.save(metaDataBase);
    }

    public Iterable<MetaDatabase> query() {
        Iterable<MetaDatabase> metadatabases= metaDatabaseRepository.findAll();
        return metadatabases;
    }
}
