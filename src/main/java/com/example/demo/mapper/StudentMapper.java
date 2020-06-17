package com.example.demo.mapper;/**
 * @autor:chenhz
 * @description:
 * @createTime:2020/6/17
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 * @create 2020/6/17
 * @since 1.0.0
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student>{
    Student selectByPrimaryKey(Integer id);

//    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectAll();

    Student getStudent(Integer id);
}
