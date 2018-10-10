package com.knoldus

import org.apache.spark.{SparkConf, SparkContext}

object RddFlatMapDemo {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("Spark Practice2")
    val sc = new SparkContext(conf)

    val rdd1 = sc.parallelize(Array((1, Array((3, 4), (4, 5))), (2, Array((4, 2), (4, 4), (3, 9)))))
      .flatMapValues(value => value).collect

    rdd1.foreach { result => println(result) }

  }
}