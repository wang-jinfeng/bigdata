package com.jinfeng.clickhouse.entity

/**
  * @package: com.jinfeng.clickhouse.entity
  * @author: wangjf
  * @date: 2019/5/24
  * @time: 下午1:58
  * @email: wjf20110627@163.com
  * @phone: 152-1062-7698
  */
case class Device(device_id: String, offer_id: Set[Int]) extends Serializable
