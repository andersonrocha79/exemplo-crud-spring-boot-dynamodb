package com.example.aws.springbootdynamodbcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://www.youtube.com/watch?v=6TbWN-SRfEs
// https://docs.aws.amazon.com/pt_br/amazondynamodb/latest/developerguide/Introduction.html
// https://docs.aws.amazon.com/pt_br/amazondynamodb/latest/developerguide/DynamoDBLocal.DownloadingAndRunning.html#apache-maven
// https://docs.aws.amazon.com/pt_br/sdk-for-java/latest/developer-guide/home.html


@SpringBootApplication
public class SpringbootDynamodbCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDynamodbCrudApplication.class, args);
	}

}
