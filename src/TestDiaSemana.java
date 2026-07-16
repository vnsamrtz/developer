public class TestDiaSemana {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SABADO;
        System.out.println(dia);

        if (dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("Es día laborable");
        }
    }
}
