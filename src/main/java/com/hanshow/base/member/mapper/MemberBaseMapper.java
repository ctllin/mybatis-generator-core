package com.hanshow.base.member.mapper;

import com.hanshow.base.member.dto.MemberBase;
import com.hanshow.base.member.dto.MemberBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberBaseMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(MemberBaseExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(MemberBaseExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbg.generated
     */
    int insert(MemberBase record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(MemberBase record);

    /**
     *
     * @mbg.generated
     */
    List<MemberBase> selectByExample(MemberBaseExample example);

    /**
     *
     * @mbg.generated
     */
    MemberBase selectByPrimaryKey(String id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MemberBase record, @Param("example") MemberBaseExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MemberBase record, @Param("example") MemberBaseExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MemberBase record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MemberBase record);
}