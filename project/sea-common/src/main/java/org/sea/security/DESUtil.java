package org.sea.security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.codec.binary.Base64;

/**
 * 
 * <一句话功能简述> aes加解密工具类
 * <功能详细描述>
 * @author 尤拍拍
 * @version V1.0[产品/模块版本]
 */
public class DESUtil {


    private static final String DATA_ENCODING = "UTF-8";

    //生成AES（128位16个字符）、DES（56位：8个字符）key(大小为8的倍数)
    private static final int KEY_SIZE = 56;

    //AES DES
    private static final String ALGORITHM = "DES";

    /**
     * // "算法/模式/补码方式"
     * AES/ECB/PKCS5Padding    DES/CBC/PKCS5Padding
     */
    private static final String ALGORITHM_PATTERN = "DES/CBC/PKCS5Padding";

    // 加密
    public static String encrypt(String data, String key) throws Exception {
        return encrypt(data, Base64.decodeBase64(key));
    }

    // 解密
    public static String decrypt(String data, String key) throws Exception {
        return decrypt(data, Base64.decodeBase64(key));
    }

    public static String generateAESKeyStr(int keySize) throws Exception {
        byte[] key = generateAESKey(keySize);
        return Base64.encodeBase64String(key);
    }

    public static void main(String[] args) throws Exception {
        String str = generateAESKey("12345678");
        System.out.println(str);
    }

    private static byte[] generateAESKey(int keySize) throws Exception {
        byte[] key = (byte[]) null;
        KeyGenerator kgen = null;
        if (keySize != KEY_SIZE) {
            keySize = KEY_SIZE;
        }
        try {
            kgen = KeyGenerator.getInstance(ALGORITHM);
            kgen.init(keySize);
            SecretKey skey = kgen.generateKey();
            key = skey.getEncoded();
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("执行AES密钥生成时发生异常！", e);
        }
        return key;
    }

    public static String generateAESKey(String keyStr) throws Exception {
        byte[] key = generateAESKey(keyStr, KEY_SIZE);
        return Base64.encodeBase64String(key);
    }

    private static byte[] generateAESKey(String keyStr, int keySize) throws Exception {

        byte[] key = (byte[]) null;
        KeyGenerator kgen = null;
        if (keySize != KEY_SIZE) {
            keySize = KEY_SIZE;
        }
        try {
            kgen = KeyGenerator.getInstance(ALGORITHM);
            kgen.init(keySize, new SecureRandom(keyStr.getBytes(DATA_ENCODING)));
            SecretKey skey = kgen.generateKey();
            key = skey.getEncoded();
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("执行AES密钥生成时发生异常！", e);
        }
        return key;
    }

    private static String encrypt(String data, byte[] key) throws Exception {
        byte[] byteSrc = data.getBytes(DATA_ENCODING);
        byte[] byteRect = encrypt(byteSrc, key);
        return Base64.encodeBase64String(byteRect);
    }

    private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        if (key == null) {
            throw new Exception("加密Key为空");
        }
        
        DESKeySpec desKeySpec = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey skeySpec = keyFactory.generateSecret(desKeySpec);
        
        Cipher cipher = Cipher.getInstance(ALGORITHM_PATTERN);
        IvParameterSpec iv = new IvParameterSpec(key);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
        byte[] encrypted = cipher.doFinal(data);
        return encrypted;
    }

    private static String decrypt(String data, byte[] key) throws Exception {
        byte[] byteSrc = Base64.decodeBase64(data);
        byte[] byteRect = decrypt(byteSrc, key);
        return new String(byteRect, DATA_ENCODING);
    }


    private static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        // 判断Key是否正确
        if (key == null) {
            throw new Exception("加密Key为空");
        }

        // 创建一个DESKeySpec对象
        DESKeySpec desKey = new DESKeySpec(key);
        // 创建一个密匙工厂
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        // 将DESKeySpec对象转换成SecretKey对象
        SecretKey skeySpec = keyFactory.generateSecret(desKey);
        Cipher cipher = Cipher.getInstance(ALGORITHM_PATTERN);
        
        IvParameterSpec iv = new IvParameterSpec(key);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
        byte[] original = cipher.doFinal(data);
        return original;
    }
    
}
