package com.zh.dao;

import com.zh.domain.ToolsItem;
import com.zh.domain.ToolsItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolsItemMapper {
    long countByExample(ToolsItemExample example);

    int deleteByExample(ToolsItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolsItem record);

    int insertSelective(ToolsItem record);

    List<ToolsItem> selectByExample(ToolsItemExample example);

    ToolsItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToolsItem record, @Param("example") ToolsItemExample example);

    int updateByExample(@Param("record") ToolsItem record, @Param("example") ToolsItemExample example);

    int updateByPrimaryKeySelective(ToolsItem record);

    int updateByPrimaryKey(ToolsItem record);
}