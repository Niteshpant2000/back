package com.wissen.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import com.wissen.supermarket.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String>{
    @Query(value="Select * from Transaction where customer_id=:number",nativeQuery=true)
    List<Transaction> getTransactionByCustomerId(@Param("number") long number);
}
