import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Desafio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int funcionario = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int horas = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double salarioHora= Double.parseDouble(st.nextToken());

        double salario = horas * salarioHora; // Altere o valor da variável com o cálculo esperado
        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}