package com.example.bankdemo.datasource.mock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
    //when // act
        val banks = mockDataSource.retrieveBanks()
    //then // assert
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`() {
    //when
        val banks = mockDataSource.retrieveBanks()
    //then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank()}
        assertThat(banks).anyMatch { bank -> bank.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }
    }
}
