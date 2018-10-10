package com.knoldus

import org.apache.spark.{SparkConf, SparkContext}

object RddDemo {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Spark Practice3")
    val sc = new SparkContext(conf)

    val rdd2 = sc.parallelize(Array((1, List(1, 2, 3, 4)), (2, List(1, 2, 3, 4)), (3, List(1, 2, 3, 4)), (4, List(1, 2, 3, 4))))
      .flatMapValues(value => value).filter(x => x._1 == x._2)

    rdd2.foreach{result=>println(result._1 + "---" + result._2)}

  }
}