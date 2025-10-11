class Game{
    String name;
    String genre;
    double price;

    void applyDiscount(double percent){
        price -= price*(percent/100);
        if (price <= 0){
            System.out.println("Você teve muita sorte com esse desconto, o jogo " + name + " está de graça agora!!");
            price = 0.00;
        }
    }
