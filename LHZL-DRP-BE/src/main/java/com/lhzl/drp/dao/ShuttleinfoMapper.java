package com.lhzl.drp.dao;

import com.lhzl.drp.model.Shuttleinfo;

public interface ShuttleinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int deleteByPrimaryKey(Long shuttleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int insert(Shuttleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int insertSelective(Shuttleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    Shuttleinfo selectByPrimaryKey(Long shuttleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int updateByPrimaryKeySelective(Shuttleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_shuttleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int updateByPrimaryKey(Shuttleinfo record);
}