package ExampleBlockChain.ExampleBlockChain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Timestamp;
import java.util.Date;

@SpringBootApplication
public class ExampleBlockChainApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExampleBlockChainApplication.class, args);

		//Date object
		Date date= new Date();
		//getTime() returns current time in milliseconds
		long time = date.getTime();
		//Passed the milliseconds to constructor of Timestamp class
		Timestamp timestamp = new Timestamp(time);

		Block block = new Block(timestamp,"this is some mock data", previousHash, currentHash)
	}
}
