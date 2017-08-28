public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    
    public Libro(String tLibro, String aLibro, int pLibro)
    {
        titulo = tLibro;
        autor = aLibro;
        paginas = pLibro;
        numeroDeReferencia = "";
    }
    
    String dimeAutor()
    {
        return autor;
    }
    
    String dimeTitulo()
    {
        return titulo;
    }
    
    int dimePaginas()
    {
        return paginas;
    }
    
    String dimeDetalles()
    {
        String datos = " ";
        String compara = "";
        
        datos += "Título:";
        datos += titulo;
        datos += ", Autor:";
        datos += autor;
        datos += ", Páginas:";
        datos += paginas;
        if(numeroDeReferencia.length() != compara.length())
        {
            datos += ", Numero de Referencia:";
            datos += numeroDeReferencia;
        }
        else
        {
            numeroDeReferencia = "ZZZ";
        }
        
        return datos;
    }
    
    void cambiaNumRef(String numReferencia)
    {
        String compara = "100";
        
        if(numReferencia.length() >= compara.length())
        {
            numeroDeReferencia = numReferencia;
        }
    }
    
    String dimeNumRef()
    {
        return numeroDeReferencia;
    }
}