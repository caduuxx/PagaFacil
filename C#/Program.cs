using AppBackPagaFacilV0._1.dominio;

internal class Program
{
    private static void Main(string[] args)
    {
        SomarBoleto SomarBoleto = new SomarBoleto();

        static void Main(string[] args)
        {
            Console.WriteLine("Qual o valor dos boletos que vc deseja pagar");
            int valorBoleto = int.Parse(Console.ReadLine());

            double[] contas = new double[valorBoleto];

            for (int i = 0; i < valorBoleto; i++)
            {
                Console.WriteLine($"Qual o valor da conta {i + 1}: ");
                contas[i] = double.Parse(Console.ReadLine());

            }
             double total = CalcularSomaBoleto(contas);
            
            Console.WriteLine($"O total dos boletos a serem pagos é : {total:C}");

        }
    }

    private static double CalcularSomaBoleto(double[] contas)
    {
        throw new NotImplementedException();
    }
}