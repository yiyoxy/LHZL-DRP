package com.lhzl.drp.dao;

import com.lhzl.drp.model.Roleinfo;

public interface RoleinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_roleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int deleteByPrimaryKey(Long roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_roleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int insert(Roleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_roleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int insertSelective(Roleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_roleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    Roleinfo selectByPrimaryKey(Long roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_roleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int updateByPrimaryKeySelective(Roleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_roleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(Roleinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_roleinfo
     *
     * @mbggenerated Thu Mar 24 13:45:27 CST 2016
     */
    int updateByPrimaryKey(Roleinfo record);
}