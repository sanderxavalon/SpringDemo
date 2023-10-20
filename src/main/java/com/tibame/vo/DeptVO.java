package com.tibame.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept2")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeptVO {

    @Id
    private Integer deptno;
    @Column
    private String dname;
    @Column
    private String loc;

}