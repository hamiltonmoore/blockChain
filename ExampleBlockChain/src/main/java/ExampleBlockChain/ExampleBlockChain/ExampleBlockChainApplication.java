package ExampleBlockChain.ExampleBlockChain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ExampleBlockChainApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExampleBlockChainApplication.class, args);

		Transactions transaction1 = new Transactions("Peter", "Sam", 100L);
		Transactions transaction2 = new Transactions("Billy", "Matt", 500L);

		Block genesisBlock = new Block(Arrays.asList(transaction1, transaction2), 0);
		genesisBlock.hashCode();


		System.out.println("transaction1:" + transaction1);
		System.out.println("transaction2:" + transaction2);
		
		}
	}
