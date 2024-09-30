public class Main {
    public static void main(String[] args) {
        String[] features = {"Мультиплеер", "Высший балл", "Достижения"};

        Weather weatherApp1 = new Weather("Weather", "Weather inc.", "Android", "Европа");
        weatherApp1.run();
        weatherApp1.displayInfo();

        Weather weatherApp2 = new Weather("Sunny", "TechLabs", "iOS", "Азия");
        weatherApp2.run();
        weatherApp2.displayInfo();

        Social snApp1 = new Social("Facebook", "Meta", "Android", "Global", 2000000000);
        snApp1.run();
        snApp1.displayInfo();

        Social snApp2 = new Social("VK", "Mail.ru", "iOS", "Regional", 90000000);
        snApp2.run();
        snApp2.displayInfo();

        Game game1 = new Game("Шахматы", "Неизвестен", "PC", "Стратегия", features);
        game1.run();
        game1.displayInfo();

        Mobile mobileGame1 = new Mobile("Subway Surf", "Sybo", "iOS", "Аркада", new String[]{"Colorful", "Simple Controls"}, true);
        mobileGame1.run();
        mobileGame1.displayInfo();

        System.out.println("Общее количество приложений: " + Weather.getWeatherAppCount());
        System.out.println("Общее количество соц.сетей: " + Social.getSocialNetworkAppCount());
        System.out.println("Общее количество игр: " + Game.getGameCount());
    }
}