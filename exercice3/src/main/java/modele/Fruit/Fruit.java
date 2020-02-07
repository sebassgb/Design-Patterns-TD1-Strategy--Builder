package modele.Fruit;

public  abstract class  Fruit {//interdiction de créer de fruits quelqconque
    private String type;

        public Fruit(String type) {
        this.type = type;
        }

        public String toString() {
        return this.type;
        }
}


