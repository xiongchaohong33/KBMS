package com.kbms_module.mapper;


import com.kbms_module.pojo.Btype;

import java.util.List;

public interface BtypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btype
     *
     * @mbggenerated
     */
    int insert(Btype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table btype
     *
     * @mbggenerated
     */
    int insertSelective(Btype record);
    /**
     * 查找所有的类别
     */
    List<Btype> selectAllbyte();
}