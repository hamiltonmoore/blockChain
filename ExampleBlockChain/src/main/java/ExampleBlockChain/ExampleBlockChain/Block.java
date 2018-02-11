package ExampleBlockChain.ExampleBlockChain;

import java.util.List;

public class Block {

    private List<Transactions> transactions;
    private int previousHash;

    public Block(List<Transactions> transactions, int previousHash) {
        this.transactions = transactions;
        this.previousHash = previousHash;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }
}
