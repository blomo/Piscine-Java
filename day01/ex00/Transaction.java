import java.util.UUID;

public class Transaction {
    String Identifier;
    User Recipient;
    User Sender;
    categorys category;

    enum categorys {
        debits,
        credits
    }

    Integer amount;

    Transaction(User recipient, User sender, int amount) {
        this.Recipient = recipient;
        this.Sender = sender;
        this.amount = amount;
        this.Identifier = UUID.randomUUID().toString().replace("-", "");
        if (amount >= 0)
            this.category = categorys.debits;
        else
            this.category = categorys.credits;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getIdentifier() {
        return this.Identifier;
    }
}
