package com.namespace;

public class MysqlFactory {
    private MyDataSource myDataSource;

    public MysqlFactory(MyDataSource dataSource){
        this.myDataSource=dataSource;
    }

    public MyDataSource getMyDataSource() {
        return myDataSource;
    }

    public void setMyDataSource(MyDataSource myDataSource) {
        this.myDataSource = myDataSource;
    }
}
