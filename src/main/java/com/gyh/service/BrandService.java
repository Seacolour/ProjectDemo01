package com.gyh.service;

import com.gyh.pojo.Brand;
import com.gyh.pojo.PageBean;

import java.util.List;

public interface BrandService {

    /**
     * 查询所有
     *
     * @return
     */
    List<Brand> selectAll();

    /**
     * 添加数据
     *
     * @param brand
     */
    void add(Brand brand);

    /*
     *更新数据
     * */
    void update(Brand brand);

    /*
     *删除数据
     * */
    void delete(int id);

    void deleteByIds(int[] ids);

    /*
    * 分页查询
    * */
    PageBean<Brand> selectByPage(int currentPage,int pageSize);


    /*
    * 分页条件查询
    * */
    PageBean<Brand> selectByPageAndCondition(int currentPage,int pageSize,Brand brand);
}
