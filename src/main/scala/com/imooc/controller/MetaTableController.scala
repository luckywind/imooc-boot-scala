package com.imooc.controller

import com.imooc.domain.MetaTable
import com.imooc.service.MetaTableService
import com.imooc.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping, RequestMethod, ResponseBody}

@Controller
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService:MetaTableService) {
  @RequestMapping(value = Array("/"),method = Array(RequestMethod.POST))
  @ResponseBody
  /**方法的返回值类型可以省略，scala自动把最后一条语句的结果类型作为返回值类型
   * */
  def save(@ModelAttribute  metaTable:MetaTable) = {
     metaTableService.save(metaTable)
     ResultVOUtil.success() //这里就调用了Java代码
   }

  @RequestMapping(value = Array("/"),method = Array(RequestMethod.GET))
  @ResponseBody
   def query()={
     ResultVOUtil.success(metaTableService.query())
   }

}
