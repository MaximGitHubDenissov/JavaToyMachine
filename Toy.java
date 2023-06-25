
abstract class Toy {
    private int id;
    private String name;
    private int count;
    private int chance;


   public Toy(int id, String name, int count, int chance){
        this.id = id;
        this.name = name;
        this.count = count;
        this.chance = chance;
   } 
   public double getChance() {
       return chance;
   }
   public int getCount() {
       return count;
   }
   public int getId() {
       return id;
   }
   public String getName() {
       return name;
   }
   public void setChance(int chance) {
       this.chance = chance;
   }
   public void setCount(int count) {
       this.count = count;
   }
   public void setId(int id) {
       this.id = id;
   }
   public void setName(String name) {
       this.name = name;
   }
   @Override
   public String toString() {
        return String.format("id:%d, Название:%s, Количество:%d",id, name, count);
   }
}

    
