package VictorLi_Java;


import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {


        Scanner in = new Scanner(System.in);
        String s = in.nextLine();


        String[] massiv2  = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X" };
        boolean vseRimskie=false;
        boolean chislo_2_rimsk =false;
        Main class1 = new Main();
        boolean estRimsk= false;
        for (String str:
            massiv2 ) {
            if(s.contains(str))
            {
                estRimsk = true;
            }
        }

        if(estRimsk==true)
        {
            if(s.contains(" + "))
            {
                vseRimskie = class1.ProverkaPlus(s);

            }
            else if(s.contains(" - "))
            {
                vseRimskie = class1.ProverkaMinus(s);

            }

            else if(s.contains(" * "))
            {
                vseRimskie = class1.ProverkaUmnozhit(s);

            }

            else if(s.contains(" / "))
            {
                vseRimskie = class1.ProverkaDelit(s);

            }
        }
        if(vseRimskie==true)
        {
            Main class_1 = new Main();
            if(s.contains(" + "))
            {
                class_1.SummaRimsk(s);
                return;
            }
            else if(s.contains(" - "))
            {
                class_1.Raznitsa(s);
                return;
            }

            else if(s.contains(" * "))
            {
                class_1.UmnzohRimsk(s);
                return;
            }

            else if(s.contains(" / "))
            {
                class_1.DelitRimsk(s);
                return;
            }
        }
        else
            {
                if(estRimsk==true) {
                    throw new Exception();
                }
            }

        String[] massivChisel = new String[]{"1","2","3","4","5","6","7","8","9","10"};
        boolean vseCifri=false;
        boolean chislo_2_cifra =false;

        boolean estCifra= false;
        for (String str:
                massivChisel ) {
            if(s.contains(str))
            {
                estCifra = true;
                break;
            }
        }

        if(estCifra==true)
        {
            if(s.contains(" + "))
            {
               vseCifri =class1.ProverkaPlusCifri(s);
            }
            else if(s.contains(" - "))
            {
                vseCifri=class1.ProverkaMinusCifri(s);
            }

            else if(s.contains(" * "))
            {
                vseCifri = class1.ProverkaUmnozhitCifri(s);
            }

            else if(s.contains(" / "))
            {
                vseCifri = class1.ProverkaDelitCifri(s);
            }
        }


        if(vseCifri==true)
        {
            Main class_1 = new Main();
            if(s.contains(" + "))
            {
                class1.Plus_KogdaChislaVvodyatsyaSProbelom(s);
            }
            else if(s.contains(" - "))
            {
                class1.Minus_KogdaChislaVvodyatsyaSProbelom(s);
            }

            else if(s.contains(" * "))
            {
                class1.Umnozhit_KogdaChislaVvodyatsyaSProbelom(s);
            }

            else if(s.contains(" / "))
            {
                class1.Delit_KogdaChislaVvodyatsyaSProbelom(s);
            }
        }
        else
            {
                throw  new Exception();
            }

    }





    public  boolean ProverkaDelitCifri(String s)
    {
        boolean chislo_1_cifra=false;
        boolean chislo_2_cifra =false;
        String[] massiv  = new String[]{"1","2","3","4","5","6","7","8","9","10"};


        int znak = s.indexOf(" / ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " / ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());

        for (int i =0;i<massiv.length;i++) {
            if(pervoe.equals(massiv[i]))
            {
                chislo_1_cifra = true;
                break;
            }

        }
        for (int i =0;i<massiv.length;i++) {
            if(vtoroe.equals(massiv[i]))
            {
                chislo_2_cifra = true;
                break;
            }

        }
        if(chislo_1_cifra ==true && chislo_2_cifra==true)
        {
            return true;

        }
        else
        {
            return false;
        }
    }




    public  boolean ProverkaUmnozhitCifri(String s)
    {
        boolean chislo_1_cifra=false;
        boolean chislo_2_cifra =false;
        String[] massiv  = new String[]{"1","2","3","4","5","6","7","8","9","10"};


        int znak = s.indexOf(" * ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " * ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());

        for (int i =0;i<massiv.length;i++) {
            if(pervoe.equals(massiv[i]))
            {
                chislo_1_cifra = true;
                break;
            }

        }
        for (int i =0;i<massiv.length;i++) {
            if(vtoroe.equals(massiv[i]))
            {
                chislo_2_cifra = true;
                break;
            }

        }
        if(chislo_1_cifra ==true && chislo_2_cifra==true)
        {
            return true;

        }
        else
        {
            return false;
        }
    }


    public  boolean ProverkaMinusCifri(String s)
    {
        boolean chislo_1_cifra=false;
        boolean chislo_2_cifra =false;
        String[] massiv  = new String[]{"1","2","3","4","5","6","7","8","9","10"};


        int znak = s.indexOf(" - ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " - ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());

        for (int i =0;i<massiv.length;i++) {
            if(pervoe.equals(massiv[i]))
            {
                chislo_1_cifra = true;
                break;
            }

        }
        for (int i =0;i<massiv.length;i++) {
            if(vtoroe.equals(massiv[i]))
            {
                chislo_2_cifra = true;
                break;
            }

        }
        if(chislo_1_cifra ==true && chislo_2_cifra==true)
        {
            return true;

        }
        else
        {
            return false;
        }
    }




    public  boolean ProverkaPlusCifri(String s)
    {
        boolean chislo_1_cifra=false;
        boolean chislo_2_cifra =false;
        String[] massiv  = new String[]{"1","2","3","4","5","6","7","8","9","10"};


        int znak = s.indexOf(" + ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " + ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());

        for (int i =0;i<massiv.length;i++) {
            if(pervoe.equals(massiv[i]))
            {
                chislo_1_cifra = true;
                break;
            }

        }
        for (int i =0;i<massiv.length;i++) {
            if(vtoroe.equals(massiv[i]))
            {
                chislo_2_cifra = true;
                break;
            }

        }
        if(chislo_1_cifra ==true && chislo_2_cifra==true)
        {
            return true;

        }
        else
        {
            return false;
        }
    }




    public  boolean ProverkaDelit(String s)
    {
        boolean chislo_1_rimsk=false;
        boolean chislo_2_rimsk =false;
        String[] massiv  = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        int znak = s.indexOf(" / ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " / ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());

        for (int i =0;i<massiv.length;i++) {
            if(pervoe.equals(massiv[i]))
            {
                chislo_1_rimsk = true;
                break;
            }

        }
        for (int i =0;i<massiv.length;i++) {
            if(vtoroe.equals(massiv[i]))
            {
                chislo_2_rimsk = true;
                break;
            }

        }
        if(chislo_1_rimsk ==true && chislo_2_rimsk==true)
        {
            return true;

        }
        else
        {
            return false;
        }
    }



    public  boolean ProverkaUmnozhit(String s)
    {
        boolean chislo_1_rimsk=false;
        boolean chislo_2_rimsk =false;
        String[] massiv  = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};


        int znak = s.indexOf(" * ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " * ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());

        for (int i =0;i<massiv.length;i++) {
            if(pervoe.equals(massiv[i]))
            {
                chislo_1_rimsk = true;
                break;
            }

        }
        for (int i =0;i<massiv.length;i++) {
            if(vtoroe.equals(massiv[i]))
            {
                chislo_2_rimsk = true;
                break;
            }

        }
        if(chislo_1_rimsk ==true && chislo_2_rimsk==true)
        {
            return true;

        }
        else
        {
            return false;
        }
    }




    public  boolean ProverkaMinus(String s)
    {
        boolean chislo_1_rimsk=false;
        boolean chislo_2_rimsk =false;
        String[] massiv  = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};


        int znak = s.indexOf(" - ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " - ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());

        for (int i =0;i<massiv.length;i++) {
            if(pervoe.equals(massiv[i]))
            {
                chislo_1_rimsk = true;
                break;
            }

        }
        for (int i =0;i<massiv.length;i++) {
            if(vtoroe.equals(massiv[i]))
            {
                chislo_2_rimsk = true;
                break;
            }

        }
        if(chislo_1_rimsk ==true && chislo_2_rimsk==true)
        {
            return true;

        }
        else
        {
            return false;
        }
    }



    public  boolean ProverkaPlus(String s)
    {
        boolean chislo_1_rimsk=false;
        boolean chislo_2_rimsk =false;
        String[] massiv  = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};


        int znak = s.indexOf(" + ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " + ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());

        for (int i =0;i<massiv.length;i++) {
        if(pervoe.equals(massiv[i]))
        {
            chislo_1_rimsk = true;
            break;
        }

    }
        for (int i =0;i<massiv.length;i++) {
            if(vtoroe.equals(massiv[i]))
            {
                chislo_2_rimsk = true;
                break;
            }

        }
        if(chislo_1_rimsk ==true && chislo_2_rimsk==true)
        {
            return true;

        }
        else
            {
                return false;
            }
    }

    public void DelitRimsk(String s)
    {
        String[] massiv  = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X",
                "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"

        };

        int znak = s.indexOf(" / ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " / ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());
        int chisloPErvoe=0;
        int chisloVtoroe=0;
        for (int i = 0;i<massiv.length;i++)
        {
            if(massiv[i].equals(pervoe))
            {
                chisloPErvoe = i+1;
            }
        }
        for (int i = 0;i<massiv.length;i++)
        {
            if(massiv[i].equals(vtoroe))
            {
                chisloVtoroe = i+1;
            }
        }
        int rez = chisloPErvoe/chisloVtoroe;
        if(rez<=10)
        {
            System.out.println(massiv[rez-1]);
        }

    }





    public void UmnzohRimsk(String s)
    {
        String[] massiv  = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X",
                "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"

        };

        int znak = s.indexOf(" * ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " * ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());
        int chisloPErvoe=0;
        int chisloVtoroe=0;
        for (int i = 0;i<massiv.length;i++)
        {
            if(massiv[i].equals(pervoe))
            {
                chisloPErvoe = i+1;
            }
        }
        for (int i = 0;i<massiv.length;i++)
        {
            if(massiv[i].equals(vtoroe))
            {
                chisloVtoroe = i+1;
            }
        }
        int rez = chisloPErvoe*chisloVtoroe;
        if(rez<=10)
        {
            System.out.println(massiv[rez-1]);
        }

        if(rez>10 && rez<=20)
        {
            rez=rez-10;
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="XX";
                System.out.println("XX");
                return;
            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "X"+vtorayaTsifra;
            System.out.println(otvet);
        }

        if(rez>20 && rez<=30)
        {
            rez = rez-10;
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="XXX";
                System.out.println("XXX");
                return;
            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "XX"+vtorayaTsifra;
            System.out.println(otvet);
        }
        if(rez>30 && rez<=40)
        {
            rez = rez-20;
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="XL";
                System.out.println("XL");
                return;

            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "XXX"+vtorayaTsifra;
            System.out.println(otvet);
        }
        if(rez>40 && rez<=50)
        {
            rez = rez-30;
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="L";
                System.out.println("L");
                return;
            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "XL"+vtorayaTsifra;
            System.out.println(otvet);
        }
        if(rez>50 && rez<=60)
        {
            rez = rez-40;
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="LX";
                System.out.println("LX");
                return;
            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "L"+vtorayaTsifra;
            System.out.println(otvet);
        }
        if(rez>60 && rez<=70)
        {
            rez = rez-50;
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="LXX";
                System.out.println("LXX");
                return;
            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "LX"+vtorayaTsifra;
            System.out.println(otvet);
        }
        if(rez>70 && rez<=80)
        {
            rez = rez-60;
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="LXXX";
                System.out.println("LXXX");
                return;
            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "LXX"+vtorayaTsifra;
            System.out.println(otvet);
        }
        if(rez>80 && rez<=90)
        {
            rez = rez-70;
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="XC";
                System.out.println("XC");
                return;
            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "LXXX"+vtorayaTsifra;
            System.out.println(otvet);
        }
        if(rez>90 && rez<=100)
        {
            rez = rez-80;
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="C";
                System.out.println("C");
                return;
            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "XC"+vtorayaTsifra;
            System.out.println(otvet);
        }




    }




    public void Raznitsa(String s)
    {String[] massiv  = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"
    };

        int znak = s.indexOf(" - ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " - ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());
        int chisloPErvoe=0;
        int chisloVtoroe=0;
        for (int i = 0;i<massiv.length;i++)
        {
            if(massiv[i].equals(pervoe))
            {
                chisloPErvoe = i+1;
            }
        }
        for (int i = 0;i<massiv.length;i++)
        {
            if(massiv[i].equals(vtoroe))
            {
                chisloVtoroe = i+1;
            }
        }
        int rez = chisloPErvoe-chisloVtoroe;
        if(rez<=10)
        {
            System.out.println(massiv[rez-1]);
        }



    }

        //////
    public void SummaRimsk(String s)
    {
        String[] massiv  = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X",
                                        "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"

        };

        int znak = s.indexOf(" + ");
        String pervoe = s.substring(0,znak);

        int dlinaZnaka = " + ".length();
        String vtoroe = s.substring(znak+dlinaZnaka,s.length());
        int chisloPErvoe=0;
        int chisloVtoroe=0;
        for (int i = 0;i<massiv.length;i++)
        {
            if(massiv[i].equals(pervoe))
            {
                chisloPErvoe = i+1;
            }
        }
        for (int i = 0;i<massiv.length;i++)
        {
            if(massiv[i].equals(vtoroe))
            {
                chisloVtoroe = i+1;
            }
        }
        int rez = chisloPErvoe+chisloVtoroe;
        if(rez<=10)
        {
            System.out.println(massiv[rez-1]);
        }

        if(rez>10 && rez<=20)
        {
            String rezStr = ""+rez;
            int vtoraya_tsifra = rez%10;



            String vtorayaTsifra = "";

            if(vtoraya_tsifra==0)
            {
                vtorayaTsifra="X";
            }
            else{
                vtorayaTsifra = massiv[vtoraya_tsifra-1];
            }

            String otvet = "X"+vtorayaTsifra;
            System.out.println(otvet);
        }


    }









        /*
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Main class1 = new Main();

        if(s.contains(" + "))
        {
            class1.Plus_KogdaChislaVvodyatsyaSProbelom(s);
        }
        else if(s.contains(" - "))
        {
            class1.Minus_KogdaChislaVvodyatsyaSProbelom(s);
        }
        else if(s.contains(" * "))
        {
            class1.Umnozhit_KogdaChislaVvodyatsyaSProbelom(s);
        }
        else if(s.contains(" / "))
        {
            class1.Delit_KogdaChislaVvodyatsyaSProbelom(s);
        }
        else {
            System.out.println("");

        }

        */





    void Delit_KogdaChislaVvodyatsyaSProbelom(String s)
    {
        char desyat_1[] = new char[2];
        char desyat_2[] = new char[2];
        int znak = s.indexOf(" / ");
        int dlinaznaka = " / ".length();

        int dlina = s.length();

        if(dlina == 5)
        {
            char charObichnoeChislo1 = s.charAt((znak-1));
            String strObichn1 = ""+charObichnoeChislo1;
            int obich1 = Integer.parseInt(strObichn1);


            char charObichnoeChislo2 = s.charAt((znak+3));
            String strObichn2 = ""+charObichnoeChislo2;
            int obich2 = Integer.parseInt(strObichn2);

            int rez =  obich1 / obich2 ;
            System.out.println(rez);
        }


        if (dlina==6)
        {
            int index_10_perviy = s.indexOf("10");

            if(index_10_perviy != 0)
            {
                s.getChars(index_10_perviy,s.length(),desyat_1,0);
                String str10 = new String(desyat_1);
                int des=Integer.parseInt(str10);
                char charObichnoeChislo = s.charAt((znak-1));
                String strObichn = ""+charObichnoeChislo;
                int obich = Integer.parseInt(strObichn);

                int rez = obich / des;
                System.out.println(rez);
            }
            if(index_10_perviy == 0)
            {
                s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
                String str10 = new String(desyat_1);

                int des=Integer.parseInt(str10);
                char charObichnoeChislo = s.charAt((znak+ dlinaznaka));
                String strObichn = ""+charObichnoeChislo;
                int obich = Integer.parseInt(strObichn);
                int rez = des / obich;
                System.out.println(rez);
            }

        }
        if(dlina == 7)
        {
            int index_10_perviy = s.indexOf("10");
            s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
            String str10 = new String(desyat_1);

            int des1=Integer.parseInt(str10);

            int index_10_vtoroy = s.indexOf("10",znak);
            s.getChars(index_10_vtoroy,index_10_vtoroy+2,desyat_2,0);
            String str10_2 = new String(desyat_1);

            int des2=Integer.parseInt(str10_2);
            int rez = des1/des2;
            System.out.println(rez);
        }

    }






    void Umnozhit_KogdaChislaVvodyatsyaSProbelom(String s)
    {
        char desyat_1[] = new char[2];
        char desyat_2[] = new char[2];
        int znak = s.indexOf(" * ");
        int dlinaznaka = " * ".length();

        int dlina = s.length();

        if(dlina == 5)
        {
            char charObichnoeChislo1 = s.charAt((znak-1));
            String strObichn1 = ""+charObichnoeChislo1;
            int obich1 = Integer.parseInt(strObichn1);


            char charObichnoeChislo2 = s.charAt((znak+3));
            String strObichn2 = ""+charObichnoeChislo2;
            int obich2 = Integer.parseInt(strObichn2);

            int rez =  obich1 * obich2 ;
            System.out.println(rez);
        }


        if (dlina==6)
        {
            int index_10_perviy = s.indexOf("10");

            if(index_10_perviy != 0)
            {
                s.getChars(index_10_perviy,s.length(),desyat_1,0);
                String str10 = new String(desyat_1);
                int des=Integer.parseInt(str10);
                char charObichnoeChislo = s.charAt((znak-1));
                String strObichn = ""+charObichnoeChislo;
                int obich = Integer.parseInt(strObichn);

                int rez = obich * des;
                System.out.println(rez);
            }
            if(index_10_perviy == 0)
            {
                s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
                String str10 = new String(desyat_1);

                int des=Integer.parseInt(str10);
                char charObichnoeChislo = s.charAt((znak+ dlinaznaka));
                String strObichn = ""+charObichnoeChislo;
                int obich = Integer.parseInt(strObichn);
                int rez = des * obich;
                System.out.println(rez);
            }

        }
        if(dlina == 7)
        {
            int index_10_perviy = s.indexOf("10");
            s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
            String str10 = new String(desyat_1);

            int des1=Integer.parseInt(str10);

            int index_10_vtoroy = s.indexOf("10",znak);
            s.getChars(index_10_vtoroy,index_10_vtoroy+2,desyat_2,0);
            String str10_2 = new String(desyat_1);

            int des2=Integer.parseInt(str10_2);
            int rez = des1*des2;
            System.out.println(rez);
        }

    }






    void Minus_KogdaChislaVvodyatsyaSProbelom(String s)
    {
        char desyat_1[] = new char[2];
        char desyat_2[] = new char[2];
        int znak = s.indexOf(" - ");
        int dlinaznaka = " - ".length();

        int dlina = s.length();

        if(dlina == 5)
        {
            char charObichnoeChislo1 = s.charAt((znak-1));
            String strObichn1 = ""+charObichnoeChislo1;
            int obich1 = Integer.parseInt(strObichn1);


            char charObichnoeChislo2 = s.charAt((znak+3));
            String strObichn2 = ""+charObichnoeChislo2;
            int obich2 = Integer.parseInt(strObichn2);

            int rez =  obich1 - obich2 ;
            System.out.println(rez);
        }


        if (dlina==6)
        {
            int index_10_perviy = s.indexOf("10");

            if(index_10_perviy != 0)
            {
                s.getChars(index_10_perviy,s.length(),desyat_1,0);
                String str10 = new String(desyat_1);
                int des=Integer.parseInt(str10);
                char charObichnoeChislo = s.charAt((znak-1));
                String strObichn = ""+charObichnoeChislo;
                int obich = Integer.parseInt(strObichn);

                int rez = obich - des;
                System.out.println(rez);
            }
            if(index_10_perviy == 0)
            {
                s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
                String str10 = new String(desyat_1);

                int des=Integer.parseInt(str10);
                char charObichnoeChislo = s.charAt((znak+ dlinaznaka));
                String strObichn = ""+charObichnoeChislo;
                int obich = Integer.parseInt(strObichn);
                int rez = des - obich;
                System.out.println(rez);
            }

        }
        if(dlina == 7)
        {
            int index_10_perviy = s.indexOf("10");
            s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
            String str10 = new String(desyat_1);

            int des1=Integer.parseInt(str10);

            int index_10_vtoroy = s.indexOf("10",znak);
            s.getChars(index_10_vtoroy,index_10_vtoroy+2,desyat_2,0);
            String str10_2 = new String(desyat_1);

            int des2=Integer.parseInt(str10_2);
            int rez = des1-des2;
            System.out.println(rez);
        }

    }









    void Plus_KogdaChislaVvodyatsyaSProbelom(String s)
    {


            char desyat_1[] = new char[2];
            char desyat_2[] = new char[2];
            int znak = s.indexOf(" + ");
            int dlinaznaka = " + ".length();

            int dlina = s.length();

            if(dlina == 5)
            {
                char charObichnoeChislo1 = s.charAt((znak-1));
                String strObichn1 = ""+charObichnoeChislo1;
                int obich1 = Integer.parseInt(strObichn1);


                char charObichnoeChislo2 = s.charAt((znak+3));
                String strObichn2 = ""+charObichnoeChislo2;
                int obich2 = Integer.parseInt(strObichn2);

                int rez =  obich1 + obich2 ;
                System.out.println(rez);
            }


            if (dlina==6)
            {
                int index_10_perviy = s.indexOf("10");

                if(index_10_perviy != 0)
                {
                    s.getChars(index_10_perviy,s.length(),desyat_1,0);
                    String str10 = new String(desyat_1);
                    int des=Integer.parseInt(str10);
                    char charObichnoeChislo = s.charAt((znak-1));
                    String strObichn = ""+charObichnoeChislo;
                    int obich = Integer.parseInt(strObichn);

                    int rez = obich + des;
                    System.out.println(rez);
                }
                if(index_10_perviy == 0)
                {
                    s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
                    String str10 = new String(desyat_1);

                    int des=Integer.parseInt(str10);
                    char charObichnoeChislo = s.charAt((znak+ dlinaznaka));
                    String strObichn = ""+charObichnoeChislo;
                    int obich = Integer.parseInt(strObichn);
                    int rez = des + obich;
                    System.out.println(rez);
                }

            }
            if(dlina == 7)
            {
                int index_10_perviy = s.indexOf("10");
                s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
                String str10 = new String(desyat_1);

                int des1=Integer.parseInt(str10);

                int index_10_vtoroy = s.indexOf("10",znak);
                s.getChars(index_10_vtoroy,index_10_vtoroy+2,desyat_2,0);
                String str10_2 = new String(desyat_1);

                int des2=Integer.parseInt(str10_2);
                int rez = des1+des2;
                System.out.println(rez);
            }


    }



    void KogdaChislaVvodyatsyaBezProbela(String s)
    {
        char desyat_1[] = new char[2];
        char desyat_2[] = new char[2];
        int plus = s.indexOf("+");
        System.out.println(plus);
        int dlina = s.length();

        if(dlina == 3)
        {
            char charObichnoeChislo1 = s.charAt((plus-1));
            String strObichn1 = ""+charObichnoeChislo1;
            int obich1 = Integer.parseInt(strObichn1);


            char charObichnoeChislo2 = s.charAt((plus+1));
            String strObichn2 = ""+charObichnoeChislo2;
            int obich2 = Integer.parseInt(strObichn2);

            int rez =  obich1 + obich2 ;
            System.out.println("rez = " + rez);
        }


        if (dlina==4)
        {
            int index_10_perviy = s.indexOf("10");
            System.out.println("Perviy index = " + index_10_perviy);
            if(index_10_perviy != 0)
            {
                s.getChars(index_10_perviy,s.length(),desyat_1,0);
                String str10 = new String(desyat_1);
                System.out.println(str10);
                int des=Integer.parseInt(str10);
                char charObichnoeChislo = s.charAt((plus-1));
                String strObichn = ""+charObichnoeChislo;
                int obich = Integer.parseInt(strObichn);
                System.out.println("obichnoe chislo = "+charObichnoeChislo);
                int rez = des + obich;
                System.out.println("rezultat = " + rez);
            }
            if(index_10_perviy == 0)
            {
                s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
                String str10 = new String(desyat_1);
                System.out.println(str10);
                int des=Integer.parseInt(str10);
                char charObichnoeChislo = s.charAt((plus+1));
                String strObichn = ""+charObichnoeChislo;
                int obich = Integer.parseInt(strObichn);
                System.out.println("obichnoe chislo = "+charObichnoeChislo);
                int rez = des + obich;
                System.out.println("rezultat = " + rez);
            }

        }
        if(dlina == 5)
        {
            int index_10_perviy = s.indexOf("10");
            s.getChars(index_10_perviy,index_10_perviy+2,desyat_1,0);
            String str10 = new String(desyat_1);
            System.out.println(str10);
            int des1=Integer.parseInt(str10);

            int index_10_vtoroy = s.indexOf("10",plus);
            s.getChars(index_10_vtoroy,index_10_vtoroy+2,desyat_2,0);
            String str10_2 = new String(desyat_1);
            System.out.println(str10_2);
            int des2=Integer.parseInt(str10_2);
            int rez = des1+des2;
            System.out.println("rez = " + rez);
        }

    }



}






