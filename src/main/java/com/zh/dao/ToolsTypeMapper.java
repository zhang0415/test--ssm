package com.zh.dao;

import com.zh.domain.ToolsType;
import com.zh.domain.ToolsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolsTypeMapper {
    long countByExample(ToolsTypeExample example);

    int deleteByExample(ToolsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolsType record);

    int insertSelective(ToolsType record);

    List<ToolsType> selectByExample(ToolsTypeExample example);

    ToolsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToolsType record, @Param("example") ToolsTypeExample example);

    int updateByExample(@Param("record") ToolsType record, @Param("example") ToolsTypeExample example);

    int updateByPrimaryKeySelective(ToolsType record);

    int updateByPrimaryKey(ToolsType record);
}