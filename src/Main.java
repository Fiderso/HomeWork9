public class Main {
    public static void main(String[] args) {


        int firstFriday = 3; // Задача 1
        for (int day = 1; day <= 31; day++) {
            if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println();

        int marathonDistance = 42195; // Задача 2 do-while
        int distance = 0;
        do {
            System.out.println("Держитесь! Осталось " + (marathonDistance - distance) + " метров");
            distance += 500;
        } while (distance < marathonDistance);

        System.out.println();

        for (int distanceFor = 0; // Задача 2 for
             distanceFor < marathonDistance;
             distanceFor += 500) {
            System.out.println("Держитесь! Осталось " + (marathonDistance - distanceFor) + " метров");
        }

        System.out.println();

        int budget = 1000; // Задача 3 while
        int money = budget;
        int day = 1;
        while (money > 0) {
            if (day % 5 == 0) {
                day++;
                continue;
            }
            money -= 100;
            day++;
        }
        System.out.println("Бюджета хватит на " + (day - 1) + " дней");

        System.out.println();

        money = budget; // Задача 3 for
        int days = 0;
        for (int currentDay = 1; money > 0; currentDay++) {
            days++;
            if (currentDay % 5 == 0) {
                continue;
            }
            money -= 100;
        }
        System.out.println("Бюджета хватит на " + days + " дней");

        System.out.println();

        int month = 0; // Задание 4
        double total = 0;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total = total * 1.07;
            }
            System.out.println("Месяц " + month + ", сумма накоплений: " + total + " рублей"
            );
            if (total >= 12000000) {
                break;
            }
        }
        System.out.println("Чтобы накопить 12 000 000 рублей, понадобится " + month + " месяцев");

        System.out.println();

        int charge = 20; // Задача 5
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats < 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев! Перерыв на 2 минуты.");
                minute += 2;
                if (overheats >= 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                continue;
            }
            charge += 2;
            if (charge > 100) {
                charge = 100;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут");












    }
}
