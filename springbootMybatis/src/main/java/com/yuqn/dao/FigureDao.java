package com.yuqn.dao;

import com.yuqn.entity.Figure;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/*
* @Mapper
* @Param
* */
public interface FigureDao {
//    根据id查询记录
    Figure figForId(@Param("figId") Integer id);
}
