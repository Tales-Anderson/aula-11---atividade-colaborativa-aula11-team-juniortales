public class ContaPoupanca extends Conta{
    public ContaPoupanca (int numero, String nome_titular) {
        super(numero, nome_titular);
    }

    @Override
    public boolean sacar (double valor) {
        if (this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }


    public void reajustar (double percentual) {
        saldo = saldo + saldo * percentual;
    }
}