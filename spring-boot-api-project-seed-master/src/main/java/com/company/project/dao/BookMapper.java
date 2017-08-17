package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Book;
import com.company.project.model.BookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper extends Mapper<Book> {
    long countByExample(BookExample example);

    int deleteByExample(BookExample example);

    List<Book> selectByExample(BookExample example);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);
}