package com.lhzl.drp.dao;

import com.lhzl.drp.model.Shuttleinfo;

public interface ShuttleinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long shuttleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated
     */
    int insert(Shuttleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated
     */
    int insertSelective(Shuttleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated
     */
    Shuttleinfo selectByPrimaryKey(Long shuttleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Shuttleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Shuttleinfo record);
}