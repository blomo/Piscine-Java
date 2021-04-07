public interface TransactionsList {
    public void addTransaction(Transaction temp);

    public void removeTransaction(String uuid);

    public Transaction[] transformTransactionToArray();

}
