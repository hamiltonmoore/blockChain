package ExampleBlockChain.ExampleBlockChain;

import java.sql.Timestamp;

public class Block {

    public Timestamp timestamp;
    public String data;
    public int previousHash;
    public int currentHash;

    Block(Timestamp timestamp, String data, int previousHash, int currentHash){
        this.timestamp = timestamp;
        this.data = data;
        this.previousHash = previousHash;
        this.currentHash = currentHash;
    }

    public int createCurrentHash(){
        String buildCurrentHash = timestamp + data + previousHash;
        currentHash = buildCurrentHash.hashCode();
        return currentHash;
    }
    
}
