package com.example.aws.springbootdynamodbcrud.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.example.aws.springbootdynamodbcrud.entity.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PacientesRepository
{

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Paciente save(Paciente person)
    {
        dynamoDBMapper.save(person);
        return person;
    }

    public Paciente findById(String id)
    {
       return dynamoDBMapper.load(Paciente.class, id);
    }

    public List<Paciente> findAll()
    {
        return dynamoDBMapper.scan(Paciente.class, new DynamoDBScanExpression());
    }

    public Paciente update(String id, Paciente person)
    {
        dynamoDBMapper
        .save(person, new DynamoDBSaveExpression()
        .withExpectedEntry("paciente_id", new ExpectedAttributeValue(new AttributeValue().withS(id))));
        return dynamoDBMapper.load(Paciente.class, id);
    }

    public String delete(String id)
    {
    	Paciente person = dynamoDBMapper.load(Paciente.class, id);
        dynamoDBMapper.delete(person);
        return "Paciente excluido com sucesso > id : " + id;
    }


}
