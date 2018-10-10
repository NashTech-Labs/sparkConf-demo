# sparkConf Example

#Simple Spark Assignment =========>
This example is the implementation of SparkConf

Clone it form the url : https://github.com/knoldus/sparkConf-demo.git

Spark Dependency :libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.0"
Scala version :2.11.12

Run commands :

1 : cd sparks-assignment
2 : sbt clean compile
3 : sbt run


Apache Spark
Aim​ :
Complete all the questions given below using Spark Shell or creating an SBT application using
Spark dependencies.
Questions​ :


Q1​​ . We have two Pair RDDs of type (Int, Double) and what we want is, when the keys are the
same, subtract their values.
E.g​ .
RDD_1 : (1, 3.6)
RDD_2: (1, 1.1)
Wanted result​ : (1, 2.5)


Q2​ . We have a RDD like below:
val rdd1 = sc.parallelize(Array((1,Array((3,4),(4,5))),(2,Array((4,2),(4,4),(3,9)))))
Which is ​ RDD[(Int,Array[(Int,Int)])]​ . We want to get the result like ​ RDD[(Int,(Int,Int)]​ by some
operations such as flatMap or else. The result should be:
(1,(3,4))
(1,(4,5))
(2,(4,2))
(2,(4,4))
(2,(3,9))


Q3​ . We have data like below
val rdd2 = sc.parallelize(Array((1,List(1,2,3,4)),(2,List(1,2,3,4)),(3,List(1,2,3,4)),(4,List(1,2,3,4))))
and we want output to be printed like following :
1--1
2--2
3--3
4--4

