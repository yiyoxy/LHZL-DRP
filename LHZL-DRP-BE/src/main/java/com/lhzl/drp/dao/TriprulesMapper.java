package com.lhzl.drp.dao;

import com.lhzl.drp.model.Triprules;

public interface TriprulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_triprules
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long tripid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_triprules
     *
     * @mbggenerated
     */
    int insert(Triprules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_triprules
     *
     * @mbggenerated
     */
    int insertSelective(Triprules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_triprules
     *
     * @mbggenerated
     */
    Triprules selectByPrimaryKey(Long tripid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_triprules
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Triprules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_triprules
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Triprules record);
}