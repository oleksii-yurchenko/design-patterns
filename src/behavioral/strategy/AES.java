package behavioral.strategy;

public class AES implements EncryptionStrategy{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
