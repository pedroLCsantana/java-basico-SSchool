/**
 * Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço.
 *  O monge, necessitando de alimentos, indagou à rainha sobre o pagamento, se poderia ser feito
 *  com grãos de trigo dispostos em um tabuleiro de xadrez, de tal forma que o primeiro quadro 
 *  conter um grão e os quadros subsequentes o dobro do quadro anterior. A rainha achou o 
 *  trabalho barato e pediu que o serviço fosse executado, sem se dar conta de que seria 
 *  impossível efetuar o pagamento. Faça um programa em Java para calcular o número de grãos 
 *  que o monge esperava receber.
    Em qual casa você terá overflow usando respectivamente int e long?
 * 
 * 
 */


class XadrexPagamento
{
    private static long[][] aMatrix;

    public static void main(String[] args)
    {
        createMatrix();
        printMatrix();

        // Casa da linha 5 e coluna 1 acontece o Overflow com int
        // Casa da linha 8 e coluna 8 acontece o Overflow com long
    }

    public static void createMatrix()
    {
        aMatrix = new long[8][];

        for(int i =0; i< aMatrix.length; i++)
        {
            aMatrix[i] = new long[8];

            if(i == 0){
                aMatrix[i][0] = 1;
            }else{
                aMatrix[i][0] = aMatrix[i-1][aMatrix[i].length-1]*2; // O primeiro é 2 vezes o ultimo da linha anterior
            }
            
            for(int j = 0; j < aMatrix[i].length; j++)
            {
                if(j != 0)
                {
                    aMatrix[i][j] = aMatrix[i][j-1]*2;
                }
                
            }
        }
    }

    public static void printMatrix()
    {
        for(int i = 0; i < aMatrix.length; i++)
        {
            for(int j = 0; j < aMatrix[i].length; j++)
            {
                System.out.print(aMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}