package com.ugps.orzanizzeclone.helper;

import java.text.SimpleDateFormat;

public class DateCustom {

    public static String dataAtual(){

        long data = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = sdf.format(data);

        return dataString;
    }

    public static String mesAnoDataEscolhida(String data){

        //formato do data = dd/MM/yyyy
        String retornoData[] = data.split("/");
        return retornoData[1]+retornoData[2];

    }

}
