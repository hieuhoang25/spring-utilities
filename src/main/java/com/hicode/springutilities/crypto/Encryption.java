package com.hicode.springutilities.crypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.*;
import java.util.Base64;

/**
 * Encryptable
 *
 * @author hicode
 */
public class Encryption {


    private static final String AES_ALGORITHM = "AES";

    /**
     * generateKey
     *
     * @return SecretKey
     * @throws NoSuchAlgorithmException
     */
    private static SecretKey generateKey() throws NoSuchAlgorithmException {
            KeyGenerator keyGen = KeyGenerator.getInstance(AES_ALGORITHM);
            keyGen.init(128);
            return keyGen.generateKey();
    }

    /**
     * encrypt data
     *
     * @param data
     * @return String
     */
    public static String encrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, generateKey());

            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
    }

    /**
     * decrypt data
     *
     * @param encryptedData
     * @return String
     */
    public static String decrypt(String encryptedData) {
        try {
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);

            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, generateKey());

            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
    }
}
