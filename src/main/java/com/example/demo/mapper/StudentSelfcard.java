package com.example.demo.mapper;/**
 * @autor:chenhz
 * @description:
 * @createTime:2020/6/17
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @create 2020/6/17
 * @since 1.0.0
 */
@Mapper
public interface StudentSelfcard extends BaseMapper<com.example.demo.pojo.StudentSelfcard>{
    StudentSelfcard queryStudentSelfcardByStudentId(String selfcard_id);

//    int insert(com.example.demo.pojo.StudentSelfcard studentSelfcard);
}
