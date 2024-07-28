package structural.adapter.Gmail;

import structural.adapter.EmailProvider;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmail;

    public GmailAdapter(GmailClient client) {
        this.gmail = client;
    }

    @Override
    public void downloadEmails() {
        gmail.connect();
        gmail.getEmails();
        gmail.disconnect();
    }
}
