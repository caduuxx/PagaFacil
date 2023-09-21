using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppBackPagaFacilV0._1.dominio
{
    internal class SomarBoleto
    {
        public SomarBoleto() { }

        static double CaulcularSomaBoleto(double[] contas)
        {
            double soma = 0.0;

            foreach (double conta in contas)
            {
                soma += conta;
            }
            return soma;
        }
    }
}
