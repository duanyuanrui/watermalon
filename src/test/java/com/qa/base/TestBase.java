package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public Properties prop;
    public int RESPNSE_STATUS_CODE_200 = 200;
    public int RESPNSE_STATUS_CODE_201 = 201;
    public int RESPNSE_STATUS_CODE_404 = 404;
    public int RESPNSE_STATUS_CODE_500 = 500;

    //写一个构造函数
    public TestBase(){
        try {
            prop = new Properties();
            System.out.println("user.dir==="+System.getProperty("user.dir"));
            FileInputStream fis = new FileInputStream("/Users/wangge/IdeaProjects/watermelonPlan/src/test/resources/config.properties");
            prop.load(fis);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
