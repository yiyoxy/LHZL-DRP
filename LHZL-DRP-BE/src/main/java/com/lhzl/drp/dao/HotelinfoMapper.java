package com.lhzl.drp.dao;

import com.lhzl.drp.model.Hotelinfo;

public interface HotelinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int deleteByPrimaryKey(Long hotelid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int insert(Hotelinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int insertSelective(Hotelinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    Hotelinfo selectByPrimaryKey(Long hotelid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int updateByPrimaryKeySelective(Hotelinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_hotelinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int updateByPrimaryKey(Hotelinfo record);
}