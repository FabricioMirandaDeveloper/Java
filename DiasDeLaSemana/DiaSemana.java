package DiasDeLaSemana;

public enum DiaSemana {
        LUNES(1),
        MARTES(2),
        MIERCOLES(3),
        JUEVES(4),
        VIERNES(5),
        SABADO(6),
        DOMINGO(7);

        private int numero;

        private DiaSemana(int numero) {
            this.numero = numero;
        }

        public int getValorDia(){
            return numero;
        }
}