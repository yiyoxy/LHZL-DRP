package com.lhzl.drp.dao;

import com.lhzl.drp.model.Hotelinfo;

public interface HotelinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long hotelid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated
     */
    int insert(Hotelinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated
     */
    int insertSelective(Hotelinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated
     */
    Hotelinfo selectByPrimaryKey(Long hotelid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Hotelinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Hotelinfo record);
}