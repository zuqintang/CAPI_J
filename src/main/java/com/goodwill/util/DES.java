package com.goodwill.util;

//import android.util.Base64;

import org.apache.commons.codec.binary.Base64;
import sun.security.krb5.internal.crypto.Des;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * JAVA、C#、PHP、Object-C 通用的DES加密
 */
public class DES {
    //    public final static String DES_KEY_STRING = "ABSujsuu";
    public final static String DES_KEY_STRING = "jiahemeikangedc1";

    public static String encrypt(String message) throws Exception {
//        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
//
//        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes("UTF-8"));
//
//        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
//        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
//        //IvParameterSpec iv = new IvParameterSpec(key.getBytes("UTF-8"));
//        //cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
//        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//
//        return encodeBase64(cipher.doFinal(message.getBytes("UTF-8")));
        //return byteArr2HexStr(cipher.doFinal(message.getBytes("UTF-8")));
        //byte[] retByte = cipher.doFinal(message.getBytes("UTF-8"));
        //return new String(retByte, "UTF-8");

        byte[] raw = DES_KEY_STRING.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(message.getBytes("utf-8"));

        return new Base64().encodeToString(encrypted);//此处使用BASE64做转码功能，同时能起到2次加密的作用。
    }

    public static String decrypt(String message) throws Exception {

//        byte[] bytesrc = hexStr2ByteArr(message);
//        //byte[] bytesrc = message.getBytes("UTF-8");
//        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
//        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes("UTF-8"));
//        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
//        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
//        IvParameterSpec iv = new IvParameterSpec(key.getBytes("UTF-8"));
//
//        cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);
//
//        byte[] retByte = cipher.doFinal(bytesrc);
//        return new String(retByte);
        byte[] raw = DES_KEY_STRING.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] encrypted1 = new Base64().decode(message);//先用base64解密
        try {
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original, "utf-8");
            return originalString;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    /**
     * 将byte数组转换为表示16进制值的字符串， 如：byte[]{8,18}转换为：0813， 和public static byte[]
     * hexStr2ByteArr(String strIn) 互为可逆的转换过程
     *
     * @param arrB 需要转换的byte数组
     * @return 转换后的字符串
     * @throws Exception 本方法不处理任何异常，所有异常全部抛出
     */
    public static String byteArr2HexStr(byte[] arrB) throws Exception {
        int iLen = arrB.length;
        // 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍
        StringBuffer sb = new StringBuffer(iLen * 2);
        for (int i = 0; i < iLen; i++) {
            int intTmp = arrB[i];
            // 把负数转换为正数
            while (intTmp < 0) {
                intTmp = intTmp + 256;
            }
            // 小于0F的数需要在前面补0
            if (intTmp < 16) {
                sb.append("0");
            }
            sb.append(Integer.toString(intTmp, 16));
        }
        return sb.toString();
    }

    /**
     * 将表示16进制值的字符串转换为byte数组， 和public static String byteArr2HexStr(byte[] arrB)
     * 互为可逆的转换过程
     *
     * @param strIn 需要转换的字符串
     * @return 转换后的byte数组
     * @throws Exception 本方法不处理任何异常，所有异常全部抛出
     * @author <a href="mailto:leo841001@163.com">LiGuoQing</a>
     */
    public static byte[] hexStr2ByteArr(String strIn) throws Exception {
        byte[] arrB = strIn.getBytes();
        int iLen = arrB.length;

        // 两个字符表示一个字节，所以字节数组长度是字符串长度除以2
        byte[] arrOut = new byte[iLen / 2];
        for (int i = 0; i < iLen; i = i + 2) {
            String strTmp = new String(arrB, i, 2);
            arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
        }
        return arrOut;
    }

//    public static byte[] convertHexString(String ss) {
//        byte digest[] = new byte[ss.length() / 2];
//        for (int i = 0; i < digest.length; i++) {
//            String byteString = ss.substring(2 * i, 2 * i + 2);
//            int byteValue = Integer.parseInt(byteString, 16);
//            digest[i] = (byte) byteValue;
//        }
//
//        return digest;
//    }
//
//    public static String toHexString(byte b[]) {
//        StringBuffer hexString = new StringBuffer();
//        for (int i = 0; i < b.length; i++) {
//            String plainText = Integer.toHexString(0xff & b[i]);
//            if (plainText.length() < 2)
//                plainText = "0" + plainText;
//            hexString.append(plainText);
//        }
//
//        return hexString.toString();
//    }


//    public static String encodeBase64(byte[] b) {
////        return Base64.encodeToString(b, Base64.DEFAULT);
//        return Base64.encodeBase64String(b);
////        return new String(Base64.encodeBase64(b));
//    }
//
//    public static byte[] decodeBase64(String base64String) {
//        return Base64.decode(base64String, Base64.DEFAULT);
////        return Base64.decodeBase64(base64String);
//    }
}
