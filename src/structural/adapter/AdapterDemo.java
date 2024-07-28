package structural.adapter;

import structural.adapter.Gmail.GmailAdapter;
import structural.adapter.Gmail.GmailClient;

public class AdapterDemo {
    public static void run(){
        var client = new EmailClient();
        var gmailClient = new GmailClient();

        client.addProvider(new GmailAdapter(gmailClient));
        client.downloadEmails();
    }
}
