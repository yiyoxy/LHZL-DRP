package com.lhzl.drp.dao;

import com.lhzl.drp.model.Touristinfo;

public interface TouristinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long touristid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated
     */
    int insert(Touristinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated
     */
    int insertSelective(Touristinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated
     */
    Touristinfo selectByPrimaryKey(Long touristid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Touristinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Touristinfo record);
}