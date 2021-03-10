package com.example.bankdemo.service

import com.example.bankdemo.datasource.BankDataSource
import com.example.bankdemo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    }