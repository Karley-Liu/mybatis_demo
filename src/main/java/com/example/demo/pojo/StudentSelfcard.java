/**
 * Copyright (C), 2015-2020, jymh有限公司
 * FileName: StudentSelfcard
 * Author:   chenhz
 * Date:     2020/6/17 10:06
 * Description: studentSelfcard
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.sql.In;

/**
 *
 *
 * @author chenhz
 * @create 2020/6/17
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("student_selfcard")
public class StudentSelfcard {

    private Integer id;

    private String selfcard_id;

    private String native_place;

}
