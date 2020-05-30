package com.pingan.wqrg;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateUtils {
    public static void main(String[] args) {
        //Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //System.out.println(sdf.format(date));
        //Date date1 = "2020-05-16";
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        /*String D1
        String D1
        String D1
        String D1
        String D1
        String D1*/
        //List<Date> dateList = new ArrayList<>();
        
        try {
            Date Bstart = sdf.parse("2020-05-05");
            //Date Bend = sdf.parse("2020-05-10");
            Date Bend = null;
            Date Astart = sdf.parse("2020-05-06");
            Date Aend = sdf.parse("2020-05-08");
            //Date Aend = null;
            boolean b = checkDate(Astart, Aend, Bstart, Bend);

            System.out.println(b);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    static boolean checkDate(Date Astart, Date Aend, Date Bstart, Date Bend){
        if (Bend==null){
            if (Aend==null){
                return true;//时间冲突
            }
            if (Aend.before(Bstart)){
                return false;//时间不冲突
            }
        }else{
            if (Aend==null){
                /*if (Astart.after(Bend)){
                    return false;
                }else {
                    return true;
                }*/
                return !Astart.after(Bend);
            }
            if (Aend.before(Bstart)){
                return false;//时间不冲突
            }else if (Astart.after(Bend)){
                return false;//时间冲突
            }else {
                return true;
            }
        }
        return false;
    }
}
