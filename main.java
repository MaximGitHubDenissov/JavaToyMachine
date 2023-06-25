

public class main {
    public static void main(String[] args) {
        ToyMachine tm = new ToyMachine();
        Toy bear = new SoftToy(1, "Мишка", 0, 50);
        Toy dog = new SoftToy(2, "Пес", 0, 75);
        Toy pig = new SoftToy(3, "Хрюша", 0, 33);
        tm.LoadToy(bear, 3)
        .LoadToy(dog, 3)
        .LoadToy(pig, 3);
        tm.GetRandomToy();
        System.out.println(tm.toString());
        
    }
}
