import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro car = new Carro();
        String ligar = null;

        System.out.println("Digite a cor do carro: ");
        car.setCor(ler.next());
        System.out.println("Digite o modelo do carro: ");
        car.setModelo(ler.next());
        System.out.println("Digite a marca do carro: ");
        car.setMarca(ler.next());
        System.out.println("Deseja ligar o carro? (S)im || (N)ao");
        ligar = ler.next().toUpperCase();

        car.ligarCarro(ligar);

        if(car.getLigar() == true){
            car.getMovimento();

            System.out.println("Digite o valor que será acelerado no carro: ");
            car.setAcelera(ler.nextInt());
            
        } 
        else {
            System.out.println("Carro desligado, ligue para poder dirigir");
            System.out.println("Deseja ligar o carro? (S)im || (N)ao");
            ligar = ler.next().toUpperCase();

            car.ligarCarro(ligar);

            if(car.getLigar() == true){
                car.getMovimento();
    
                System.out.println("Digite o valor que será acelerado no carro: ");
                car.setAcelera(ler.nextInt());
            }
        }
        car.status();
        
    }
}
