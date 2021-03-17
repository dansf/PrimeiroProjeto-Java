import java.util.Scanner;
import javax.swing.JOptionPane;

public class Carro {
    Scanner ler = new Scanner(System.in);
    private String cor = null, modelo = null, marca = null, motor = null;
    private int vel = 0, velfinal = 0, aceleracao = 0, marcha = 0;
    private boolean ligado;

    //Getters e Setters
    //Cor
    public String getCor(){
        return this.cor;
    }
    public void setCor(String option){
        this.cor = option;
    }

    //Estado do motor
    public String getMotor(){
        return this.motor;
    }
    public void setMotor(String option){
        this.motor = option;
    }

    //Modelo
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String option){
        this.modelo = option;
    }

    //Marca
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String option){
        this.marca = option;
    }
    
    //Velocidade inicial
    public int getVel(){
        return this.vel;
    }
    public void setVel(int option){
        this.vel = option;
        this.atribuirMarcha();
        this.getMarcha();
    }
    
    //Velocidade final
    public int getVelfinal() {
        return velfinal;
    }
    public void setVelfinal(int velfinal) {
        this.velfinal = velfinal;
    }
    
    //Aceleracao
    public int getAcelera(){
        return this.aceleracao;
    }
    public void setAcelera(int option){
        this.aceleracao = option;
        this.velfinal = this.vel + this.aceleracao;
    }

    //Marcha do carro
    public int getMarcha(){
        return this.marcha;
    }
    public void setMarcha(int option){
        this.marcha = option;
    }

    //Boolean de ligar o carro
    public boolean getLigar(){
        return this.ligado;
    }
    public void setLigar(boolean option){
        this.ligado = option;
    }
    
    //Metodos especiais
    //Movimento do carro
    public void getMovimento(){
        if(this.getLigar() == true){
            System.out.println("Carro ligado.");
            System.out.println("Digite a velocidade: ");
            this.setVel(ler.nextInt());
            this.setMotor("Ligado");
        }
        else if(this.getLigar() == true && this.getVel() <= 0){
            System.out.println("Carro ligado, porem esta parado. Gasolina indo embora...");
            this.setMotor("Ligado");
        }
        else{
            System.out.println("Carro desligado.");
            this.setMotor("Desligado");
        }
    }

    //Metodo para ligar o carro, diferente do get e set esse aqui eh mais voltado pra ser uma ação
    public void ligarCarro(String option){
        switch(option){
            case "S":
                this.setLigar(true);
                break;

            case "N":
                this.setLigar(false);
                break;

            default:
                System.out.println("Digite uma opcao valida.");
                break;
        }
    }

    //Atribuindo a marcha do carro a partir da velocidade, por isso está privado
    private void atribuirMarcha(){
        if (this.getVel() >= 0 && this.getVel() <= 20){
            this.setMarcha(1);
        }
        else if (this.getVel() >= 21 && this.getVel() <= 40){
            this.setMarcha(2);

        }
        else if (this.getVel() >= 41 && this.getVel() <= 60){
            this.setMarcha(3);
 
        }
        else if (this.getVel() >= 61 && this.getVel() <= 100){
            this.setMarcha(4);

        }
        else if(this.getVel() >= 101){
            this.setMarcha(5);
      
        }
        else{
            System.out.println("O carro bugou");
            this.setMarcha(0);
        }
    }
    
    //Status do carro | Metodos apenas pra mostrar as informações do carro
    public void status(){
        System.out.println("\nModelo: " + this.getModelo() + "\nCor: " + this.getCor() + "\nMarca: " + this.getMarca() +"\nEstado Motor: " + this.getMotor() + "\nVelocidade: " + this.getVel() + "\nAceleracao: " + this.getAcelera() + "\nVelocidade Final: " + this.getVelfinal()+ "\nMarcha: " + this.getMarcha());
    }
    
}
