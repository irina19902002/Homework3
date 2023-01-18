import java.util.Scanner;

//2. Необходимо написать программу конвертер физических величин. Пользователю сначала предлагается выбрать что переводить (масса или расстояние), затем предлагается выбрать единицу измерения. Далее пользователь должен ввести
//число. В результате программа должна вывести 4 строки с переведенными величинами.
//
//Масса: кг, грамм, фунт(lb), карат в любую сторону
//Длина (расстояние):
//метр, миля, ярд, фут в любую сторону
public class ConverterPQ {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить:");
        System.out.println("[1] - масса ");
        System.out.println("[2] - расстояние");
        Scanner sc = new Scanner(System.in);
        int oblast;
        oblast = sc.nextInt();
        if (oblast == 1) {
            System.out.println("Выберите единицу измерения массы:");
            System.out.println("[1] - килограмм");
            System.out.println("[2] - грамм");
            System.out.println("[3] - фунт");
            System.out.println("[4] - карат");
            int Ed = sc.nextInt();
            System.out.println("Ввведите число: ");
            double massa = sc.nextDouble();
            convertMass(massa, Ed);
        } else {
            System.out.println("Выберите единицу измерения:");
            System.out.println("[1] - метр");
            System.out.println("[2] - миля");
            System.out.println("[3] - ярд");
            System.out.println("[4] - фут");
            int EdIzm = sc.nextInt();
            System.out.println("Ввведите число: ");
            double dlina = sc.nextDouble();
            convertDistance(dlina, EdIzm);
        }
    }

    public static void convertDistance(double dist, int Ed) {
        switch (Ed) {
            case 1://metr
                System.out.println("метры: " + dist);
                System.out.println("миля: " + dist / 1609);
                System.out.println("ярд: " + dist * 1.094);
                System.out.println("фут: " + dist * 3.281);
                break;
            case 2://milya
                System.out.println("метры: " + dist * 1609);
                System.out.println("миля: " + dist);
                System.out.println("ярд: " + dist * 1760);
                System.out.println("фут: " + dist * 5280);
                break;
            case 3://yard
                System.out.println("метры: " + dist * 1.094);
                System.out.println("миля: " + dist / 1760);
                System.out.println("ярд: " + dist);
                System.out.println("фут: " + dist * 3);
                break;

            case 4://fut
                System.out.println("метры: " + dist / 3.281);
                System.out.println("миля: " + dist / 5280);
                System.out.println("ярд: " + dist / 3);
                System.out.println("фут: " + dist);
                break;
            default:
                System.out.println("Вы ввели недопустимое значение");
        }

    }

    public static void convertMass(double mass, int Ed) {
        switch (Ed) {
            case 1://килограмм
                System.out.println("килограммы: " + mass);
                System.out.println("граммы: " + mass * 1000);
                System.out.println("фунт: " + mass * 2.205);
                System.out.println("карат: " + mass * 5000);
                break;
            case 2://грамм
                System.out.println("килограммы: " + mass / 1000);
                System.out.println("граммы: " + mass);
                System.out.println("фунт: " + mass / 453.6);
                System.out.println("карат: " + mass * 5);
                break;
            case 3://фунт
                System.out.println("килограммы: " + mass / 2.205);
                System.out.println("граммы: " + mass * 453.6);
                System.out.println("фунт: " + mass);
                System.out.println("карат: " + mass * 2268);
                break;

            case 4://карат
                System.out.println("килограммы: " + mass / 5000);
                System.out.println("граммы: " + mass / 5);
                System.out.println("фунт: " + mass / 2268);
                System.out.println("карат: " + mass);
                break;
            default:
                System.out.println("Вы ввели недопустимое значение");
        }
    }
}


