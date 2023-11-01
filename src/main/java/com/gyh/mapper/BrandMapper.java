package com.gyh.mapper;

import com.gyh.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BrandMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    /**
     * 添加数据
     * @param brand
     */
    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    /*
    * 编辑数据
    * */
//    @Update("update tb_brand brand_name= #{brandName},company_name= #{companyName},ordered= #{ordered},description= #{description},status= #{status} where id=#{id}")
    @Update("update tb_brand set brand_name = #{brandName}, company_name = #{companyName},ordered = #{ordered},description = #{description} where id = #{id}")
    void update(Brand brand);

    /*
    * 删除数据
    * */
    @Delete("delete from tb_brand where id = #{id}")
    void delete(int id);

    /*
    * 批量删除
    * */
    void deleteByIds(@Param("ids")int[] ids);

}
