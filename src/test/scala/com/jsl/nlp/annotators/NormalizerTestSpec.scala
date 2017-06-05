package com.jsl.nlp.annotators

import com.jsl.nlp.{ContentProvider, DataBuilder}
import org.apache.spark.sql.{Dataset, Row}
import org.scalatest._

/**
  * Created by saif on 02/05/17.
  */
class NormalizerTestSpec extends FlatSpec with NormalizerBehaviors {

  "A normalizer" should s"be of type ${Normalizer.aType}" in {
    val normalizer = new Normalizer
    assert(normalizer.aType == Normalizer.aType)
  }

  val latinBodyData: Dataset[Row] = DataBuilder.basicDataBuild(ContentProvider.latinBody)

  "A full Normalizer pipeline with latin content" should behave like fullNormalizerPipeline(latinBodyData)

}