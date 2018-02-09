package com.lingz.component.datatable;

import java.util.ArrayList;

/**
 * @author : linguozhi@52tt.com
 * @desc : bootstrap table 数据结构
 * @date :  2016/12/1
 */
public class BootstrapTable {
    private Integer total ;
    private Object rows;

    public BootstrapTable(Integer total, Object rows) {
        this.total = total;
        this.rows = rows;
    }

    public static BootstrapTable build(Integer total, Object rows) {
        if (null == rows) {
            rows = new ArrayList<>();
        }

        return new BootstrapTable(total, rows);
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }
}
