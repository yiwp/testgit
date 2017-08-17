package com.company.project.service.impl;

import com.company.project.dao.BookMapper;
import com.company.project.model.Book;
import com.company.project.service.BookService;
import com.company.project.core.AbstractService;
import com.github.pagehelper.PageHelper;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/15.
 */
@Service
@Transactional
public class BookServiceImpl extends AbstractService<Book> implements BookService {
    @Resource
    private BookMapper bookMapper;

    public String test(){
       PageHelper.startPage(params)
    	return "";
    }
}
