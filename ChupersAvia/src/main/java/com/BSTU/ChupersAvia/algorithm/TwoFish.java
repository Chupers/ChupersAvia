package com.BSTU.ChupersAvia.algorithm;

import com.BSTU.ChupersAvia.security.JwtProperties;

import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Base64;

public class TwoFish {
    ArrayList<byte[]> ciphers;
    Object sessionKey;
    public TwoFish() throws InvalidKeyException {
         this.sessionKey = Twofish_Algorithm.makeKey(JwtProperties.SECRET.getBytes());
    }
    public String decode(){
        System.out.println("\n\nDecrypted Cipher Text : ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < ciphers.size(); i++) {

            // Decryption

            byte[] decrypted =  Twofish_Algorithm.blockDecrypt(ciphers.get(i),0, sessionKey);
            String decryptedString = new String(decrypted);
            System.out.print(decryptedString);
            stringBuilder.append(decryptedString);
        }
        return stringBuilder.toString();
    }
    public String encode(String text){
        byte[] p = text.getBytes();
        ArrayList<Byte> inputText = new ArrayList();

        // If input text is less than 128 bits
        if(p.length > 32) {
            // Add all p elements in arraylist
            for(int i = 0; i<p.length;i++) {
                inputText.add(p[i]);
            }

            // Increment array list size until it reaches a multiple of 8 (bytes)
            // and populate missing elements with 0 bytes
            while(inputText.size() % 8 != 0){
                inputText.add((byte)0);
            }

            // Create new Array that would be used as input to blockEncrypt
            p = null;
            p = new byte[inputText.size()];
            for(int i=0; i<p.length; i++) {
                p[i] = inputText.get(i);
            }
        }

        // If p length is less than 128 bits
        else if(p.length < 32) {

            // First copy all p elements to array list
            for(int i=0; i < p.length; i++) {
                inputText.add(p[i]);
            }

            // Fill in the missing elements with 0
            for(int i = inputText.size();i<32; i++) {
                inputText.add((byte)0);
            }

            // Recreate byte array from the array list (input to blockEncrypt)
            p = null;
            p = new byte[inputText.size()];
            for(int i=0; i<p.length; i++) {
                p[i] = inputText.get(i);
            }
        }
         this.ciphers = new ArrayList();

        byte[] cipher;
        System.out.println("\n\nCipher Text : ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < inputText.size() / 16; i++) {
            // Encryption
            cipher = Twofish_Algorithm.blockEncrypt(p,  16 * i, this.sessionKey);
            ciphers.add(cipher);
            String cipherString = new String(cipher);
            String encoded = Base64.getEncoder().encodeToString(cipher);
            System.out.print(encoded);
            stringBuilder.append(encoded);
        }
        return stringBuilder.toString();

    }
}
