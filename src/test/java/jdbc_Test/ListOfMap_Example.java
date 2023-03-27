package jdbc_Test;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ListOfMap_Example {

    String dbUrl = "jdbc:oracle:thin:@34.229.184.88:1521:XE";
    String dbUsername = "hr";
    String dbPassword = "hr";

    @Test
    public void test1(){

        List<Map<String,Object>> queryData = new ArrayList<>();


        Map<String , Object> row1 = new HashMap<>();

        row1.put("first_name","Steven");
        row1.put("last_name","King");
        row1.put("salary",24000);
        row1.put("job_id","AD_PRES");

        //{job_id=AD_PRES, last_name=King, salary=24000, first_name=Steven}
        System.out.println(row1.toString());




        Map<String,Object> row2 = new HashMap<>();

        row2.put("first_name","Neena");
        row2.put("last_name","Kochhar");
        row2.put("salary",17000);
        row2.put("job_id","AD_VP");

        System.out.println(row2.toString());
        //{job_id=AD_VP, last_name=Kochhar, salary=17000, first_name=Neena}


        //adding rows one by one to my List
        queryData.add(row1);
        queryData.add(row2);


        // get Steven's last name directly frm the List
        System.out.println(queryData.get(0).get("last_name"));
        //birinci get list icin ikincisi map


    }


}
