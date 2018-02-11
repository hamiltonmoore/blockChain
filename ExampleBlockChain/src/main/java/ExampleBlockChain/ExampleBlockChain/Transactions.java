package ExampleBlockChain.ExampleBlockChain;

public class Transactions {

    private String sourceName;
    private String destinationName;
    private Long amount;

    public Transactions(String sourceName, String destinationName, Long amount) {
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
