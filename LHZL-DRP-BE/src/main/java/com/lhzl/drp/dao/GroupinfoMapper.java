package com.lhzl.drp.dao;

import com.lhzl.drp.model.Groupinfo;

public interface GroupinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_groupinfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_groupinfo
     *
     * @mbggenerated
     */
    int insert(Groupinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_groupinfo
     *
     * @mbggenerated
     */
    int insertSelective(Groupinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_groupinfo
     *
     * @mbggenerated
     */
    Groupinfo selectByPrimaryKey(Long groupid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_groupinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Groupinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_groupinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Groupinfo record);
}