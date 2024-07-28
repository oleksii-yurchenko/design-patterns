package behavioral.strategy;

public class ChatClient {
    public void send(String message, EncryptionStrategy strategy ) {
        strategy.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
