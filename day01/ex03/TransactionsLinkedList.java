public class TransactionsLinkedList implements TransactionsList {
    node head;

    public void addTransaction(Transaction temp) {
        node ptr = new node();
        ptr.current = temp;
        if (head == null)
            head = ptr;
        else {
            ptr.next = head;
            head = ptr;
        }
    }

    public void print() {
        node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.current);
            ptr = ptr.next;
        }
    }

    public void removeTransaction(String uuid) {
        if (head.current.Identifier.equals(uuid)) {
            head = head.next;
            return;
        }
        node ptr = head;
        while (ptr != null) {
            if (ptr.next.current.Identifier.equals(uuid)) {
                ptr.next = ptr.next.next;
                break;
            }
            ptr = ptr.next;
        }
    }

    public int lenTransactionLinkedList() {
        node ptr = head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    public Transaction[] transformTransactionToArray() {
        Transaction[] toArray = new Transaction[lenTransactionLinkedList()];
        node ptr = head;
        int i = 0;
        while (ptr != null) {
            toArray[i] = ptr.current;
            i++;
            ptr = ptr.next;
        }
        return toArray;
    }

    public class node {
        Transaction current;
        node next;
    }
}
