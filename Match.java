package Programs2.KickBox;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    public void run() {
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== New Round ===========");
                if(isFirst()){ //f1 starts first
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
                else{ //f2 starts first
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
            }
        } else {
            System.out.println("Weight difference is too high!");
        }
    }

     public boolean checkWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            printScore();
            System.out.println("The winner is " + f2.name);
            return true;
        } else if (f2.health == 0){
            printScore();
            System.out.println("The winner is " + f1.name);
            return true;
        }
        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + "'s health is " + f1.health);
        System.out.println(f2.name + "'s health is " + f2.health);
    }

    public boolean isFirst(){
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        if (randomValue >= 50){
            return true;
        }
        else{
            return false;
        }
    }


}



