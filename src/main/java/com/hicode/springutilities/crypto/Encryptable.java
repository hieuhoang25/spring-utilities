package com.hicode.springutilities.crypto;

import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;

/**
 * Encryptable
 *
 * @author hicode
 */
public class Encryptable {
    private static final String RSA_ALGORITHM = "RSA";
    private static KeyPair generateKey() throws NoSuchAlgorithmException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance(RSA_ALGORITHM);
        keyGen.initialize(2048);
        return keyGen.generateKeyPair();
    }

    /**
     * encrypt data
     *
     * @param data
     * @return string
     */
    public static String encrypt(String data){
        try{
            PublicKey publicKey = generateKey().getPublic();
            Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encryptBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptBytes);
        }
        catch (Exception e){
           throw new RuntimeException(e);
        }
    }

    /**
     * decrypt data
     *
     * @param encryptedData
     * @return string
     */
    public static String decrypt(String encryptedData){
        try {
            PrivateKey privateKey = generateKey().getPrivate();
            byte[] encryptedBytes = Base64.getDecoder().decode(encryptedData);
            Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            return new String(decryptedBytes);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
