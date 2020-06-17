/**
 * Copyright (C), 2015-2020, jymh有限公司
 * FileName: StudentLectureScore
 * Author:   chenhz
 * Date:     2020/6/17 10:07
 * Description: 学生课程成绩表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 *
 * @author chenhz
 * @create 2020/6/17
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("student_lecture_score")
public class StudentLectureScore {

    private Integer id;

    private String selfcard;

    private StudentLecture lecture;

    private Double score;

}
