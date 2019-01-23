package com.camp.bit.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    /*public final long id;
    private Date date;
    private State state;
    private String content;*/
    // TODO 定义表结构和 SQL 语句常量

    private TodoContract() {
    }
    public static class TodoEntry implements BaseColumns{
        public static final String TABLE_NAME="tb_note";
        public static final String COLUMN_ID="_id";
        public static final String COLUMN_DATA="date";
        public static final String COLUMN_STATE="state";
        public static final String COLUMN_CONTENT="content";
    }
    public static final String SQL_CAREATE_TB_ENTRIES=
            "CREATE TABLE "+TodoEntry.TABLE_NAME+"("+
             TodoEntry.COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
             TodoEntry.COLUMN_DATA+" INTEGER,"+
            TodoEntry.COLUMN_STATE+" INTEGER,"+
            TodoEntry.COLUMN_CONTENT+" TEXT)";
    public static final String SQL_DELETE=
            "DROP TABLE IF EXISTS"+TodoEntry.TABLE_NAME;


}
