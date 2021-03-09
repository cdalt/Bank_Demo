package com.example.bankdemo.datasource

import com.example.bankdemo.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}