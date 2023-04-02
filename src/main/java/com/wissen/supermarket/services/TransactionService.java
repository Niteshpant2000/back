package com.wissen.supermarket.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.wissen.supermarket.transaction.Transaction;
import com.wissen.supermarket.repository.TransactionRepository;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    
    // all database queries related to Inventory

    // get Transaction
    public List<Transaction> getAllTransaction(){
        List<Transaction> transactionList = transactionRepository.findAll();
        return transactionList;
    }

    // get Transaction by id
    public Optional<Transaction> getTransactionById(String id){
        Optional<Transaction> transaction = transactionRepository.findById(id);
        return transaction;
    }

    //get Transaction by customer id
    public List<Transaction> getTransactionByCustomerId(long n){
        List<Transaction> t=transactionRepository.getTransactionByCustomerId(n);
        return t;
    }
    
    // add Transaction
    public void addTransaction(Transaction newTransaction){
        long n= this.getAllTransaction().size();
        newTransaction.setId(n+"");
        transactionRepository.save(newTransaction);
    }
}