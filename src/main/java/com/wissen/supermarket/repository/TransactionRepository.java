package com.wissen.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wissen.supermarket.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String>{
    
}
