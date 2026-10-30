public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(" ");
        
        int ika = 18;

        if (ika >= 0 && ika < 18)
        {
            System.out.println("Olet alaikäinen");
        }
        else
        {
            System.out.println("Olet aikuinen");
        }
        if (ika == 15)
        {
            System.out.println("Saat ajaa mopoa");
        }
        if (ika >= 16 && ika <= 17)
        {
            System.out.println("Voit ajaa kevaria");
        }
        if (ika == 18)
        {
            System.out.println("Olet täysi-ikäinen ja saat ajaa autoa");
        }
        if (ika >= 40 && ika <= 50)
        {
            System.out.println("Parasta keski-ikää");
        }
        if (ika >= 58 && ika < 65)
        {
            System.out.println("Voit mennä varhaiseläkkeelle");
        }
        if (ika >= 65 && ika < 100)
        {
            System.out.println("Olet eläkeläinen");
            System.out.println("Hyviä eläkepäiviä!");
        }
        if (ika == 100)
        {
            System.out.println("Onnea!");
            System.out.println("Onnea!");
            System.out.println("Onnea!");
        }

        System.out.println(" ");



    }
}
