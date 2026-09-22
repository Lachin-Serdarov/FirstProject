import java.util.Scanner;
public class FirstProject1 {
    public static void main(String[] args) {
        //Dərs 1
        byte a=1;
        short b=13;
        int c=19;
        long d=23;
        float f=1.6f;
        double e=3.14;
        Boolean y=true;
        char h='A';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(e);
        System.out.println(y);
        System.out.println(h);

        //Dərs 2
        int l=240;
        double k=l;
        System.out.println("Implicit Casting: " + k);

        double p=45.987;
        int t= (int) p;
        System.out.println("Explicit Casting: " + t);

        //Dərs 3
        char j='$';

        int ascii=j;
        System.out.println(ascii);

        int aa=89;

        char jj= (char) aa;
        System.out.println(jj);

        //Dərs 4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı daxil edin: ");
        String name = scanner.nextLine();

        System.out.println("Yaşınızı daxil edin: ");
        int age = scanner.nextInt();

        System.out.println("\nSalam, " + name + "! Sən " + age + " yaşındasan.");



        // Dərs 5

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Iki tam ədəd daxil edin: ");
        int a1 = scanner.nextInt();
        int b2 = scanner.nextInt();

        System.out.println("Toplama: " + (a1+b2));
        System.out.println("Çıxma: " + (a1-b2));
        System.out.println("Vurma: " + (a1*b2));
        System.out.println("Bölmə: " + (a1/b2));
        System.out.println("Qalıq: " + (a1%b2));

        // Dərs 6

        System.out.println("\n" + a1 + " > " + b2 + " = " + (a1>b2));
        System.out.println(a1 + " < " + b2 + " = " + (a1<b2));
        System.out.println(a1 + " == " + b2 + " = " + (a1==b2));
        System.out.println(a1 + " != " + b2 + " = " + (a1!=b2));
        System.out.println(a1 + " >= " + b2 + " = " + (a1>=b2));
        System.out.println(a1 + " <= " + b2 + " = " + (a1<=b2));

        // Dərs 7
        Boolean w=true;
        System.out.println("\n" + (!w));

        // Dərs 8
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("I imtahanın qiymətini daxil edin: ");

        double g1 = scanner2.nextDouble();

        System.out.println("II imtahanın qiymətini daxil edin: ");
        double g2 = scanner2.nextDouble();

        System.out.println("III imtahanın qiymətini daxil edin: ");
        double g3 = scanner2.nextDouble();

        System.out.println("\n" + "Yekun Qiymət: " + (g1 + g2 + g3)/3);


        // Dərs 9
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("\n" + "Düzbucaqlının uzunluğunu daxil edin: ");
        double h1 = scanner3.nextDouble();

        System.out.println("Düzbucaqlının enini daxil edin: ");
        double h2 = scanner3.nextDouble();

        System.out.println("Perimetr: " + (h1+h2));
        System.out.println("Sahə: " + h1*h2);

        // Dərs 10
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("\n" + "Dairənin radiusunu daxil edin");
        double r1 = scanner4.nextDouble();
        double pi = 3;

        System.out.println("Dairənin sahəsi: " + pi*r1*r1);
        System.out.println("Dairənin uzunluğu: " + 2*pi*r1);


        scanner.close();




    }
}
