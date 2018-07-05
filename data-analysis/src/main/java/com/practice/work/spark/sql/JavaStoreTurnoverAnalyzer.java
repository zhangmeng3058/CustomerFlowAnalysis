package com.practice.work.spark.sql;

import org.apache.spark.SparkConf;

public class JavaStoreTurnoverAnalyzer {

    public static void main(String[] args) {
        //设置程序的任务名称
        SparkConf conf = new SparkConf().setAppName("StoreTurnoverAnalyzer");
    }
}
