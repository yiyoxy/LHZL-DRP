package com.lhzl.drp.dao;

import com.lhzl.drp.model.BookValue;

public interface BookValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int deleteByPrimaryKey(Long valueid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int insert(BookValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int insertSelective(BookValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    BookValue selectByPrimaryKey(Long valueid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int updateByPrimaryKeySelective(BookValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int updateByPrimaryKey(BookValue record);
}