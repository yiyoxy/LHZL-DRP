package com.lhzl.drp.dao;

import com.lhzl.drp.model.Stationinfo;

public interface StationinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stationinfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long stationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stationinfo
     *
     * @mbggenerated
     */
    int insert(Stationinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stationinfo
     *
     * @mbggenerated
     */
    int insertSelective(Stationinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stationinfo
     *
     * @mbggenerated
     */
    Stationinfo selectByPrimaryKey(Long stationid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stationinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Stationinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stationinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Stationinfo record);
}