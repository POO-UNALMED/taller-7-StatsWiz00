package comunicacion;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;


    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }
    @Override
    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString() {
        String letricas = "";
        for (String letra: letras){
            letricas.concat(letra + ", ");
        }
        return letricas.substring(0, letricas.length() -2);
    }
}
