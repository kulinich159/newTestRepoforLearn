package parentTest1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import pages.TraficSourseCreateEndpoint;

public class ParentEndpointTest {




//    JSONObject requestParams1 = new JSONObject();
//        requestParams1.put("email", "o.kulinich+30@codiv.net");
//        requestParams1.put("role", "8");
//        requestParams1.put("first_name", "aff_rr_test7");
//        requestParams1.put("last_name", "yyy4");
//        requestParams1.put("description", "UA");
//        requestParams1.put("password", "12345678");
//        requestParams1.put("agree_with_license_agreement", "true");



//    public String getBody2() {
//
//        RequestSpecification request = RestAssured.given();
//
//        JSONObject requestParams1 = new JSONObject();
//        requestParams1.put("email", "o.kulinich+30@codiv.net");
//        requestParams1.put("role", "8");
//        requestParams1.put("first_name", "aff_rr_test7");
//        requestParams1.put("last_name", "yyy4");
//        requestParams1.put("description", "UA");
//        requestParams1.put("password", "12345678");
//        requestParams1.put("agree_with_license_agreement", "true");
//        request.body(requestParams1.toString());
//        Map<String, Object> map = new HashMap<>();
//        map.put("FirstName", "Virender");
//        map.put("LastName", "Singh");
//        map.put("Address", Arrays.asList(new HashMap<String, Object>() {{
//            put("Line1", "Flat no 101");
//            put("Area", "Andheri");
//            put("City", "Mumbai");
//        }};
//        return getBody2();
//    }

    public TraficSourseCreateEndpoint traficSourseCreateEndpoint;


    @Before
    public void setup() {

        traficSourseCreateEndpoint = new TraficSourseCreateEndpoint();
        RestAssured.baseURI = "https://api.stage.advendor.net/api/v2/user";
        RestAssured.port = 443;

    }




    public void registerAffiliateWithMailThatAlreadyExist111() {


        RequestSpecification httpRequest = RestAssured.given()
                .header("Content-Type", "application/json");


        Response response = httpRequest.post("/register");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

    }
}
