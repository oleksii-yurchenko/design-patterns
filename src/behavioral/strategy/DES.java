package behavioral.strategy;

public class DES implements EncryptionStrategy{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES");
    }
}
