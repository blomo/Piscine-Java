import java.util.UUID;

public class Transaction {
    private String Identifier;
    private User Recipient;
    private User Sender;
    private categorys category;
    private Integer amount;

    enum categorys {
        DEBIT,
        CREDIT
    }

    Transaction(User recipient, User sender, int amount) {
        this.Recipient = recipient;
        this.Sender = sender;
        this.amount = amount;
        this.Identifier = UUID.randomUUID().toString().replace("-", "");
        if (amount >= 0)
            this.category = categorys.DEBIT;
        else
            this.category = categorys.CREDIT;
    }

    public int getAmount() {
        return this.amount;
    }

    public User getRecipient() {
        return Recipient;
    }

    public User getSender() {
        return Sender;
    }

    public categorys getCategory() {
        return category;
    }

    public String getIdentifier() {
        return this.Identifier;
    }
}
