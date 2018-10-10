package com.knoldus

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object SubtractByKey {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("Spark Practice1")
    val sc = new SparkContext(conf)

    println("Enter the 1st key you want to Subtract with in Integers: ")
    val key1 = scala.io.StdIn.readInt
    println("Enter the 2nd key you want to Subtract with Integers: ")
    val key2 = scala.io.StdIn.readInt

    println("Enter the 1st value which you wants to substract In Double: ")
    val value1: Double = scala.io.StdIn.readDouble

    println("Enter the 2nd value which you wants to substract In Double: ")
    val value2: Double = scala.io.StdIn.readDouble

    val rdd_1 = sc.parallelize(Seq((key1, value1)))
    val rdd_2 = sc.parallelize(Seq((key2, value2)))

    findSubOfVAlues(rdd_1, rdd_2)

  }

  def findSubOfVAlues(value: RDD[(Int, Double)], value1: RDD[(Int, Double)]): Unit = {
    val combordd = value join value1
    val res = combordd.map(r => (r._1, r._2._1 - r._2._2)).collect
    for (result <- res) println(s"Wanted result: $result")
  }
}