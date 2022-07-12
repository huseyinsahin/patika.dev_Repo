public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void start(){
        if(isCheckWeight()){
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======NEW ROUND======");
                int chance = Math.round((float)Math.random());
                System.out.println("Chance : "+ chance);
                if (chance == 0) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                if (chance == 1) {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                printScore();
            }
        }else{
            System.out.println("The weights of the athletes do not match.");
        }
    }

    public boolean isCheckWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin(){
        if(f1.health == 0){
            System.out.println(f2.name + " won.");
            return true;
        }

        if (f2.health == 0) {
            System.out.println(f1.name + " won.");
            return true;
        }

        return false;
    }

    public void printScore(){
        System.out.println(f1.name + " Health = " + f1.health);
        System.out.println(f2.name + " Health = " + f2.health);
    }
}
