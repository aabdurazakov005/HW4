public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 18;
        if (age <= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        }
        int age1 = 7;
        if (age1 >= 7) {
            System.out.println("Если возраст человека равен " + age1 + " он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println(" ");

        System.out.println("Task 2");
        int temp1 = 3;
        if (temp1 < 5) {
            System.out.println("На улице " + temp1 + " градусов, нужно надеть шапку.");
        }
        int temp2 = 10;
        if (temp2 > 5) {
            System.out.println("На улице " + temp2 + " градусов, можно идти без шапки.");
        }
        System.out.println("");

        System.out.println("Task 3");
        int speed1 = 90;
        if (speed1 >=60){
            System.out.println("Если скорость " + speed1 + ",то придется заплатить штраф.");
        }
        int speed2 = 55;
        if (speed2 <=60){
            System.out.println("Если скорость " + speed2 + ",то можно ездить спокойно.");
            System.out.println("");
        }

        System.out.println("Task 4");
        int age01 = 4;
        if (age01>2 && age01<6 ){
            System.out.println("Если возраст человека равен " + age01 + ", то ему нужно ходить в детский сад.");
        }
        int age2 = 15;
        if (age2>7 && age2<17){
            System.out.println("Если возраст человека равен "+age2+", то ему нужно ходить в школу.");
        }
        int age3 = 20;
        if (age3>=18 && age3<=24){
            System.out.println("Если возраст человека равен "+age3+", то его место в университете.");
        }
        int age4=26;
        if (age4>24){
            System.out.println("Если возраст человека равен "+age4+", то ему пора ходить на работу.");
        }
        System.out.println("");

        System.out.println("Task 5");
        int age001 = 3;
        if (age001<5){
            System.out.println("Если возраст ребенка равен "+age001+", то ему нельзя кататься на аттракционе.");
        }
        int age002=12;
        if (age002>5 || age002<14){
            System.out.println("Eсли возраст ребенка равен "+age002+", то ему можно кататься на аттракционе в сопровождении.");
        }
        int age003=17;
        if(age003>14){
            System.out.println("Если возраст ребенка равен "+age003+", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println("");

        System.out.println("Task 6");
        int trainCapacity=102;
        int seatPlace=60;
        int passengers= 33;
        if (passengers<=seatPlace){
            System.out.println("В вагоне есть места");
        }
        if (passengers>=seatPlace && passengers<=trainCapacity){
            System.out.println("В вагоне остались только стоячие места.");
        }else if (passengers>=trainCapacity){
            System.out.println("В вагоне мест нет.");
        }
        System.out.println("");
        System.out.println("Task 7");
        int one = 15;
        int two = 74;
        int three = 29;
        if (one>two && one>three){
            System.out.println("Самое большее - число one.");
        }else if (two>one && two>three){
            System.out.println("Самое большее - число two.");
        }else{
            System.out.println("Самое большее - число three.");
        }
    }
}

