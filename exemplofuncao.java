class programa{
    public static void main(String args[]){
        double paramero1,parametro2;
        funcao(parametro1,parametro2);
    }
// Public -> pode ser uzada por todos;
// Static -> não precisa ser objeto
// double -> Tipo de retorno (retorna um valor Double no caso);
// funcao(double a,double b) ->passa o nome da função e os parametros de entrada
// return -> é o valor a ser retrnado
    public static double funcao(double a,double b){
        double resultado;
        resultado = a+b;
        return resultado;
    }
}
