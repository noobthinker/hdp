package com.xkorey.hadoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HadoopApplication {

  public static void main(String[] args) {
    SpringApplication.run(HadoopApplication.class,args);
  }



  @PostConstruct
  void hdfs() throws Exception {
//    HdfsService.mkdir("/kline");
    HdfsService.uploadFile("/home/yu/tmp/hadoop.txt","/kline");
  }
}
