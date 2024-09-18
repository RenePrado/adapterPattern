public class App
{
    public static void main(String[] args)
    {
        Laptop laptop = new Laptop();
        laptopAdapter laptopAdapter = new laptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        refrigeratorAdapter refrigeratorAdapter = new refrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
        
        System.out.println(laptopAdapter.plugIn());
        System.out.println();

        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println();

        System.out.println(smartphoneAdapter.plugIn());
    }
}
