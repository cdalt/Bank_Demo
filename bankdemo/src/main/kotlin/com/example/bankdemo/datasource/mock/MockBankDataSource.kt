package com.example.bankdemo.datasource.mock

import com.example.bankdemo.datasource.BankDataSource
import com.example.bankdemo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

        val banks = listOf(
            Bank("1234", 3.14, 17),
            Bank("2345", 17.0, 0),
            Bank("3456", 0.0, 100))
    override fun retrieveBanks(): Collection<Bank> = banks
}
