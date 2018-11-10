/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floreantpos.util;

import com.floreantpos.model.FlorantLicenceKey;
import com.floreantpos.model.dao.FlorantLicenceKeyDAO;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author bairuha technologies
 */
public class LicenceUtil {

    public static void checkLicenceValidity() {
        FlorantLicenceKey florantLicenceKey = FlorantLicenceKeyDAO.getInstance().get(1);
        if (null ==florantLicenceKey) {
            System.exit(0);
        }
        else if (!getMacAddress().equals(florantLicenceKey.getKeyvalue())) {
            System.exit(0);
        }
    }

    public static String getMacAddress() {
        InetAddress ip;
        StringBuilder sb = new StringBuilder();
        try {
            ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.err.println("mac"+getMacAddress());
    }
}
