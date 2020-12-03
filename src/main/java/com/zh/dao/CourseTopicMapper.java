package com.zh.dao;

import com.zh.domain.CourseTopic;
import com.zh.domain.CourseTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTopicMapper {
    long countByExample(CourseTopicExample example);

    int deleteByExample(CourseTopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseTopic record);

    int insertSelective(CourseTopic record);

    List<CourseTopic> selectByExample(CourseTopicExample example);

    CourseTopic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseTopic record, @Param("example") CourseTopicExample example);

    int updateByExample(@Param("record") CourseTopic record, @Param("example") CourseTopicExample example);

    int updateByPrimaryKeySelective(CourseTopic record);

    int updateByPrimaryKey(CourseTopic record);
}