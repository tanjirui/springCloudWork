package com.athome.eurekaclient.model;

/**
 * @author tanjirui
 * @create 2020-12-24
 */
public class IpModel {

    private String clientIpAddress;
    private String serverIpAddress;

    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }

    public String getServerIpAddress() {
        return serverIpAddress;
    }

    public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }
}
