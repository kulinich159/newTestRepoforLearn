package pages;

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

    public String getBody1() {

        return body1;
    }
    public String getdataWithouAgreeLicense() {

        return dataWithouAgreeLicense;
    }

    public String body4 =

            "{" +
                    "\"email\":\"o.kulinich+30@codiv.net\",\n" +
                    "\"role\": 8,\n" +
                    "\"first_name\":\"aff_rr_test7\",\n" +
                    "\"last_name\":\"yyy4\",\n" +
                    "\"description\":\"UA\", \n" +
                    "\"password\":\"12345678\",\n" +
                    "\"agree_with_license_agreement\": true\n"

                    + "}";

}
