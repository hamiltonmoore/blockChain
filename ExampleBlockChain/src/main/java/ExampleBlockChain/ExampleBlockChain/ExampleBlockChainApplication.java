package ExampleBlockChain.ExampleBlockChain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ExampleBlockChainApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExampleBlockChainApplication.class, args);

		Transactions transaction1 = new Transactions("changed for testing", "Sam", 100L);
		Transactions transaction2 = new Transactions("Billy", "Matt", 500L);
		Transactions transaction3 = new Transactions("someone", "kelly", 550L);
		Transactions transaction4 = new Transactions("helly", "matt", 650L);
		Transactions transaction5 = new Transactions("robert", "kelly", 40L);
		Transactions transaction6 = new Transactions("robert", "kelly", 40L);

		Block genesisBlock = new Block(Arrays.asList(transaction1, transaction2, transaction3), 0);
		System.out.println(genesisBlock);
		Block secondBlock = new Block(Arrays.asList(transaction4, transaction5), genesisBlock.hashCode());
		System.out.println(secondBlock);
		Block thirdBlock = new Block(Arrays.asList(transaction6), secondBlock.hashCode());
		System.out.println(thirdBlock);

		}
	}
