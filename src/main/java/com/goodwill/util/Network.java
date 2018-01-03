/**
 * 实现获取主机名称,IP地址的类
 */
package com.goodwill.util;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network {
    InetAddress inet = null;

    //取得Localhost的IP地址
    public String getLIP() {
        return getLAddress().getHostAddress();
    }

    //取得Localhost的主机名称
    public String getLName() {
        return getLAddress().getHostName();
    }

    //取得Remotehost的IP地址
    public String getRIP(String host) {
        return getRAddress(host).getHostAddress();
    }

    //取得Remotehost的主机名称
    public String getRName(String ip) {
        return getRAddress(ip).getHostName();
    }

    private InetAddress getLAddress() {
        try {
            inet = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
        }
        return (inet);
    }

    public InetAddress getRAddress(String IP_or_Name) {
        try {
            inet = InetAddress.getByName(IP_or_Name);
        } catch (UnknownHostException e) {
        }
        return (inet);
    }

    /**
     * 获取客户端的 IP
     *
     * @param request
     * @return 客户端的 IP
     */
    public String getClientIp(HttpServletRequest request) {
        final String UNKNOWN = "unknown";
        // 需要注意有多个 Proxy 的情况: X-Forwarded-For: client, proxy1, proxy2
        // 没有最近的 Proxy 的 IP, 只有 1 个 Proxy 时是客户端的 IP
        String ip = request.getHeader("X-Forwarded-For");
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr(); // 没有使用 Proxy 时是客户端的 IP, 使用 Proxy 时是最近的 Proxy 的 IP
        }
        return ip;
    }

}

 