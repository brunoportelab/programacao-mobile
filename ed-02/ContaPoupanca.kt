class ContaPoupanca(cliente: String, saldo: Double, numero: String, agencia: Int) : Conta(cliente, saldo, numero, agencia) {
    fun aplicarJuros(dias: Int){
        saldo += saldo * 0.3 * dias
    }
    override fun imprimirExtrato(){
        println("** Conta Poupança **")
        println("Conta/Agência..: $numero/$agencia")
        println("Cliente........: $cliente")
        println("Saldo..........: $saldo")
    }
}