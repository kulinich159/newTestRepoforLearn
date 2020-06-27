package pages;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class TraficSourseCreateEndpoint extends ParentEndpoint {

    String body1 =

            "{" +
                    "\"email\":\"o.kulinich+30@codiv.net\",\n" +
                    "\"role\": 8,\n" +
                    "\"first_name\":\"aff_rr_test7\",\n" +
                    "\"last_name\":\"yyy4\",\n" +
                    "\"description\":\"UA\", \n" +
                    "\"password\":\"12345678\",\n" +
                    "\"agree_with_license_agreement\": true\n"

                    + "}";
    String dataWithouAgreeLicense =

            "{" +
                    "\"email\":\"o.kulinich+307@codiv.net\",\n" +
                    "\"role\": 8,\n" +
                    "\"first_name\":\"aff_rr_test7\",\n" +
                    "\"last_name\":\"yyy4\",\n" +
                    "\"description\":\"UA\", \n" +
                    "\"password\":\"12345678\",\n" +
                    "\"agree_with_license_agreement\": false\n"

                    + "}";


    public void convertMapToJson() {

        Map<String, String> elements = new HashMap();
        elements.put("Key1", "Value1");
        elements.put("Key2", "Value2");
        elements.put("Key3", "Value3");

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String json = objectMapper.writeValueAsString(elements);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public String getBody1() {

        return body1;
    }
    public String getdataWithouAgreeLicense() {

        return dataWithouAgreeLicense;
    }


}
