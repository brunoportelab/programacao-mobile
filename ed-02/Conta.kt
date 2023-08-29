open class Conta(var cliente: String = "", var saldo: Double = 0.0, var numero: String = "", var agencia: Int = 0) : Extrato {
    fun depositar(quantia: Double){
        saldo += quantia
    }
    fun retirar(quantia: Double){
        saldo -= quantia
    }
    fun transferir(quantia: Double){

    }
    override fun imprimirExtrato(){
        println("")
        println("Conta/Agência..: $numero/$agencia")
        println("Cliente........: $cliente")
        println("Saldo..........: $saldo")
    }


}