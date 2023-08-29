class ContaCorrente(cliente: String, saldo: Double, numero: String, agencia: Int) : Conta(cliente, saldo, numero, agencia){
    fun aplicarJuros(dias: Int){
        saldo += saldo * 0.8 * dias
    }
    override fun imprimirExtrato(){
        println("== Conta Corrente ==")
        println("Conta/Agência..: $numero/$agencia")
        println("Cliente........: $cliente")
        println("Saldo..........: $saldo")
    }
}