package org.supercall.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.supercall.models.SysDict;
import org.supercall.models.SysDictExample;

public interface SysDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    int countByExample(SysDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    int deleteByExample(SysDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    int insert(SysDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    int insertSelective(SysDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    List<SysDict> selectByExample(SysDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    SysDict selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysDict record, @Param("example") SysDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    int updateByExample(@Param("record") SysDict record, @Param("example") SysDictExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    int updateByPrimaryKeySelective(SysDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
     *
     * @mbggenerated Mon Jul 25 21:37:06 CST 2016
     */
    int updateByPrimaryKey(SysDict record);
}