package exercicios1;

public class CalcDias {
    
    //Atributos
    
    private int dia;
    private int mes;
    private int ano;
    private int dias;
    
    // Metódos públicos
    
    public void IdadeEmDias(){
        
        this.dias = (this.getDia()+this.getMes()+this.getAno());
        System.out.println("----------------------------------------");
        System.out.println("Você já viveu: "+this.dias+" dias");
        
    }
    
    // Construtor caso seja necessário passar os dados via parãmetro
    // Deixei como comentário para poder solicitar ao usuário que digitasse os dados
    
    /*public CalcDias(int ano, int mes, int dia){
        
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
           
    }*/
    
    // Métodos Especiais

    public int getDia() {
        return this.dia * 1;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes * 30;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano * 365;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
