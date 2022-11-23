public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 2015, "Россия", "желтый", 145.5,
                1.7,"механическая", "седан", "р123хх134", 5, "зимняя",
                "бензин");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный",
                220,3.0, "авоматическая", "хэтчбек", "я107нн007", 5, "",
                "дизель");
        Car bmv= new Car("BMW", "Z8", 2021, "Германия", "черный", 5,
                3.0, "автоматическая", "родстер", "а000аа000", 2, "летняя",
                "бензин");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный",
                220, 2.4,"автоматическая", "кроссовер", "а035мр761", 5, "зимняя",
                "бензин");
        Car hyundai = new Car("Hyundai", "Avante", 2016,"Южная Корея", "оранжевый", 180, 1.6,
                "автоматическая", "седан", "у001ук161", 5, "зимняя", "бензин");

        System.out.println(lada.toString());
        lada.refill();


        System.out.println();
        Train lastochka=new Train("Ласточка", "B-901", 2011, "Россия", "",
                301, 3500,0, "Белорусский вокзал", "Минск-Пассажирский", 11,
        "дизель");
        Train leningrad = new Train("Ленинград", " D-125", 2019, "Россия", "",
                270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8,
                "дизель");

        System.out.println(lastochka.toString());
        System.out.println(leningrad.toString());
        lastochka.refill();

        System.out.println();
        Bus liaz = new Bus("Лиаз", "ЛиАЗ-5256", 2011, "Россия", "желтый", 140, "бензин");
        Bus paz = new Bus("ПАЗ", "Вектор", 2000, "Россия", "белый", 180, "бензин");
        Bus gaz = new Bus("Газ", "Газель Next A63R42", 2020, "Россия", "голубой", 200, "дизель");

        System.out.println(liaz.toString());
        System.out.println(paz.toString());
        System.out.println(gaz.toString());
        liaz.refill();
    }
}