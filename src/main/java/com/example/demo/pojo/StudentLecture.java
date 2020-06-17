/**
 * Copyright (C), 2015-2020, jymh有限公司
 * FileName: StudentLecture
 * Author:   chenhz
 * Date:     2020/6/17 10:04
 * Description: studentLecture
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
@Table("student_lecture")
public class StudentLecture {

    private Integer id;

    private String lectureName;

}
