package com.imooc.controller;

import com.imooc.domain.MetaDatabase;
import com.imooc.service.MetaDatabaseService;
import com.imooc.utils.ResultVO;
import com.imooc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meta/database")
public class MetaDatabaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

/*    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String save(@ModelAttribute MetaDatabase metaDatabase) {
        metaDatabaseService.save(metaDatabase);
        return "成功";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Iterable<MetaDatabase> query(@ModelAttribute MetaDatabase metaDatabase) {
        return metaDatabaseService.query();
    }*/


    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase metaDatabase) {
        metaDatabaseService.save(metaDatabase);
        return ResultVOUtil.success();
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResultVO query(@ModelAttribute MetaDatabase metaDatabase) {
        return ResultVOUtil.success(metaDatabaseService.query());
    }
}
