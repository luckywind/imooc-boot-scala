package com.imooc.service;

import com.imooc.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseServiceTest {
    @Autowired
    MetaDatabaseService metaDatabaseService;

    @Test
    public void saveTest() {
        MetaDatabase metaDataBase = new MetaDatabase();
        metaDataBase.setName("default");
        metaDataBase.setLocation("localhost:8020/user/hive/warehouse");
        metaDatabaseService.save(metaDataBase);
    }
    @Test
    public void saveQuery() {
        Iterable<MetaDatabase> metaDatabases = metaDatabaseService.query();
        for (MetaDatabase metaDatabase : metaDatabases) {
            System.out.println(metaDatabase.getId());
            System.out.println(metaDatabase.getName());
            System.out.println(metaDatabase.getLocation());
        }
    }

}
