package reto5.model.vo;

public class CompraPorProveedor {
    
    private Integer ID_Compra;
    private String Constructora;
    private String Banco_Vinculado;
    
    public CompraPorProveedor() {
    }

    public CompraPorProveedor(Integer iD_Compra, String constructora, String banco_Vinculado) {
        ID_Compra = iD_Compra;
        Constructora = constructora;
        Banco_Vinculado = banco_Vinculado;
    }

    public Integer getID_Compra() {
        return ID_Compra;
    }

    public void setID_Compra(Integer iD_Compra) {
        ID_Compra = iD_Compra;
    }
    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }

    public void setBanco_Vinculado(String banco_Vinculado) {
        Banco_Vinculado = banco_Vinculado;
    }

    
}
