package com.gyh.service;

import com.gyh.pojo.Brand;

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
}
