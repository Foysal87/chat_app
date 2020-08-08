package com.example.socket;

public class messageItem {
    String msg;
    String ip;

    public messageItem(String msg, String ip) {
        this.msg = msg;
        this.ip = ip;
    }
    public String getMsg() {
        return msg;
    }
    public String getIp() {
        return ip;
    }
}
