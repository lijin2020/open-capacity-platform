package com.open.capacity.generator.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: [dawei QQ:64738479]
 * @Date: [2019-04-25 21:48]
 * @Description: [ ]
 * @Version: [1.0.1]
 * @Copy: [com.zzg]
 */
@Data
@Getter
@Setter
public class TableEntity {

    //表的名称
    private String tableName;
    //表的备注
    private String comments;
    //表的主键
    private ColumnEntity pk;
    //表的列名(不包含主键)
    private List<ColumnEntity> columns;

    //类名(第一个字母大写)，如：sys_user => SysUser
    private String className;
    //类名(第一个字母小写)，如：sys_user => sysUser
    private String classname;

    public String getTableName() {
        return tableName;
    }
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public ColumnEntity getPk() {
        return pk;
    }
    public void setPk(ColumnEntity pk) {
        this.pk = pk;
    }
    public List<ColumnEntity> getColumns() {
        return columns;
    }
    public void setColumns(List<ColumnEntity> columns) {
        this.columns = columns;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
}
