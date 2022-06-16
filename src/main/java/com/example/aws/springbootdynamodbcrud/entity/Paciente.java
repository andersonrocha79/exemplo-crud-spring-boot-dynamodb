package com.example.aws.springbootdynamodbcrud.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@Data
@DynamoDBTable(tableName = "alura-pacientes-dev")
public class Paciente 
{

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String paciente_id;

    @DynamoDBAttribute
    private String nome;
    
    @DynamoDBAttribute
    private String telefone;

    @DynamoDBAttribute
    private String data_nascimento;

    @DynamoDBAttribute
    private String email;

    @DynamoDBAttribute
    private Boolean status;

}
