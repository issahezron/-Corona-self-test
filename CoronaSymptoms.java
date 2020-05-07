package com.inform;

import java.util.Scanner;

public class CoronaSymptoms {
    //Homa
    //Mafua
    //Kikohozi
    //Joto
    
    public static void coronaSymptoms() {
        String corona;
        float jotoMwili = 0;
        boolean homa=true;
        boolean mafua=true;
        boolean kikohozi=true;
        Scanner inn=new Scanner(System.in);
        System.out.println("Chunguza joto la mwili wako:  ");
        float joto=inn.nextFloat();
        if (joto>38) {
            System.out.println("Nenda kituo cha afya haraka!Joto mwili wako limezidi kiwango.");
        } else if (homa && mafua && kikohozi){
            //System.out.println("Chunguza dalili nyinginezo");
            System.out.print(("Je ,Unajisikia homa? \n 1 - ndio \n2 - hapana \nJIBU:"));
            Scanner in = new Scanner(System.in);
            String ninaHoma = in.nextLine();
            //System.out.println("Homa: " + ninaHoma);
            // Mafua na kikohozi
           //System.out.println("Taarifa za mafua na kikohozi ");
            Scanner in2= new Scanner(System.in);
            System.out.println("Je una Mafua? \n1 - Ndio\n2 - Hapana ");
            String mafuaa = in2.nextLine();
            //System.out.println("Ana Mafua: " + mafuaa);
            System.out.println("Je unakohoa? \n1 - Ndio\n2 - hapana");
            String kohoa = in2.nextLine();
            //System.out.println("Anakohoa : " + kohoa);
            System.out.println("Tafathali fika kituo cha afya kwa uchunguzi zaidi wa CORONA");
        }
        else if ((homa && mafua && kikohozi) == false){
            System.out.println("Hauna maambuki ya CORONA");
        }



    }
}
