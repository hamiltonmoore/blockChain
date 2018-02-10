package ExampleBlockChain.ExampleBlockChain;

import java.sql.Timestamp;

public class Block {

    private Timestamp timestamp;
    private String data;
    private int previousHash;
    private int currentHash;

    Block(Timestamp timestamp, String data, int previousHash, int currentHash){
        this.timestamp = timestamp;
        this.data = data;
        this.previousHash = previousHash;
        this.currentHash = currentHash;
    }

}
