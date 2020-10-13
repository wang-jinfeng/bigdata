package com.jinfeng.flink.example;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.walkthrough.common.entity.Alert;
import org.apache.flink.walkthrough.common.entity.Transaction;
import org.apache.flink.walkthrough.common.sink.AlertSink;
import org.apache.flink.walkthrough.common.source.TransactionSource;

/**
 * @package: com.jinfeng.flink.example
 * @author: wangjf
 * @date: 2020/8/27
 * @time: 7:35 下午
 * @email: jinfeng.wang@mobvista.com
 * @phone: 152-1062-7698
 */
public class FraudDetectorJob {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();


        DataStream<Transaction> transactions = env
                .addSource(new TransactionSource())
                .name("transactions");

        DataStream<Alert> alerts = transactions
                .keyBy(Transaction::getAccountId)
                .process(new FraudDetector())
                .name("fraud-detector");

        alerts.addSink(new AlertSink())
                .name("send-alerts");

        env.execute("Fraud Detection");
    }
}
