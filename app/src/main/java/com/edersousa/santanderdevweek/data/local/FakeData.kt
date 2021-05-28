package com.edersousa.santanderdevweek.data.local

import com.edersousa.santanderdevweek.data.Cartao
import com.edersousa.santanderdevweek.data.Cliente
import com.edersousa.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Eder")
        val cartao = Cartao("41111111111")
        return Conta(
            "445655-4",
            "6552-4",
            "R$ 2.450,90",
            "R$ 4.120,00",
            cliente,
            cartao
        );
    }
}