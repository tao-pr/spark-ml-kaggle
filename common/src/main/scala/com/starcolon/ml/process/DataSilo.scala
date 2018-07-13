package com.starcolon.ml.process

import org.apache.spark.sql.{SparkSession, Dataset, Row}
import org.apache.spark.ml.Pipeline
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._

trait DataSiloT extends Serializable {
  def f(input: Dataset[_]): Dataset[_]
}

trait OutputCol 

object OutputCol {
  case class As(c: String) extends OutputCol
  case object Inplace extends OutputCol
  def as(c: String) = As(c)
}

trait Scaler 

object Scaler {
  case class Ratio(c: Double) extends Scaler
  case class ElementWiseNorm(n: Int) extends Scaler
  case class MinMaxCut(min: Option[Double], max: Option[Double]) extends Scaler
}

object Silo {
  class DatasetOps(implicit df: Dataset[_]){
    def ->(silo: DataSiloT) = silo.f(df)
  }

  case class SplitString(inputCol: String, as: OutputCol = OutputCol.Inplace) extends DataSiloT {
    override def f(input: Dataset[_]) = ???
  }

  case class ArrayConcat(cols: Seq[String], as: OutputCol.As) extends DataSiloT {
    override def f(input: Dataset[_]) = ???
  }

  case class ArrayScaler(inputCol: String, scaler: Scaler, as: OutputCol = OutputCol.Inplace) extends DataSiloT {
    override def f(input: Dataset[_]) = ???
  }


}

