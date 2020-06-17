/**
 * Copyright (C), 2015-2020, jymh有限公司
 * FileName: Student
 * Author:   chenhz
 * Date:     2020/6/17 10:01
 * Description: student
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Student {

    private Integer id;

    private String stu_name;

    private Byte gender;

    private StudentSelfcard studentSelfcard;

}
