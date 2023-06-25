
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class ToyMachine {
    private List<Toy>toys = new ArrayList<>();

    public ToyMachine LoadToy (Toy type, int count){
        type.setCount(count);
        toys.add(type);
        return this;
    }

    public List<Toy> GetRandomToy(){
        List<Toy>result = new ArrayList<>();
        Random random = new Random();
        for (int i =0; i<3; i++){
            int index = random.nextInt(toys.size());
            Toy toy = toys.get(index);
            int num = (int)(Math.random()*100);
            if (num <= toy.getChance() && num >=0){
                result.add(toy);
                System.out.printf("Поздравляем, Вы выигали %s!\n",toy.getName());
                toy.setCount(toy.getCount()-1);
            }
            else{
                result.add(null);
                System.out.println("К сожалению Вы ничего не выиграли!\n");
            }
        }
        return result;

    
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Toy item : toys) {
            sb.append(item);
            sb.append("\n");

        }
        return sb.toString();
    }
    


}
