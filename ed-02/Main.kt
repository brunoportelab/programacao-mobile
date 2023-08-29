fun main() {
//    var conta1 = ContaCorrente(cliente = "Hommer Simpson", saldo = 12.00, numero = "0000123", agencia = 12)
//    var conta2 = ContaPoupanca(cliente = "Bart Simpson", saldo = 12.00, numero = "0000123", agencia = 12)
    val contas = mutableListOf<Conta>()

    contas.add(ContaPoupanca(cliente = "Hommer Simpson", saldo = 2000.00, numero = "0000124", agencia = 12))
    contas.add(ContaPoupanca(cliente = "Bart Simpson", saldo = 2000.00, numero = "0000136", agencia = 12))
    contas.add(ContaCorrente(cliente = "Marge Simpson", saldo = 3000.00, numero = "0000115", agencia = 12))

    for(conta in contas){
        conta.imprimirExtrato()
    }
}