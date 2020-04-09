package com.imooc.service

import com.imooc.domain.MetaTable
import com.imooc.repository.MetaTableRepository
import javax.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MetaTableService @Autowired()(metatableRepository:MetaTableRepository){
   @Transactional
   def save(metaTable:MetaTable)= {
     metatableRepository.save(metaTable)
   }

    def query()={
      metatableRepository.findAll()
    }
}
