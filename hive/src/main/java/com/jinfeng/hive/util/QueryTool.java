package com.jinfeng.hive.util;

import org.apache.hive.service.auth.HiveAuthFactory;
import org.apache.hive.service.auth.PlainSaslHelper;
import org.apache.hive.service.cli.thrift.TCLIService;
import org.apache.hive.service.cli.thrift.TOpenSessionReq;
import org.apache.hive.service.cli.thrift.TOpenSessionResp;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import javax.security.sasl.SaslException;

/**
 * @package: com.jinfeng.hive.util
 * @author: wangjf
 * @date: 2020/10/21
 * @time: 3:18 下午
 * @email: jinfeng.wang@mobvista.com
 * @phone: 152-1062-7698
 */
public class QueryTool {
    public static TTransport getSocketInstance(String host, int port, String USER, String PASSWORD) throws TTransportException {
        TTransport transport = HiveAuthFactory.getSocketTransport(host, port, 99999);
        try {
            transport = PlainSaslHelper.getPlainTransport(USER, PASSWORD, transport);
        } catch (SaslException e) {
            e.printStackTrace();
        }
        return transport;
    }

    public static TOpenSessionResp openSession(TCLIService.Client client) throws TException {
        TOpenSessionReq openSessionReq = new TOpenSessionReq();
        return client.OpenSession(openSessionReq);
    }
}
