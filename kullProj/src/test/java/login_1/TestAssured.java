package login_1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import parentTest1.ParentEndpointTest;

import java.util.HashMap;
import java.util.Map;

public class TestAssured extends ParentEndpointTest {


    Logger logger = Logger.getLogger(getClass());


    @Test
    public void registerAffiliateWithMailThatAlreadyExist (){


        RequestSpecification httpRequest = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(traficSourseCreateEndpoint.getBody1());

        Response response = httpRequest.post("/register");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();


        System.out.println("Response Status Code is =>  " + statusCode);
        System.out.println("Response Body is =>  " + responseBody);

        Assert.assertEquals(statusCode , 400);

        Assert.assertEquals("{\"error\":101,\"message\":\"User with this email already exists\",\"fields\":[\"email\"]}" ,responseBody);
        Assert.assertEquals(responseBody.contains("101"), true);
    }

    @Test
    public void registerAffiliateWithFalseAgreementLicense (){


        RequestSpecification httpRequest = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(traficSourseCreateEndpoint.getdataWithouAgreeLicense());

        Response response = httpRequest.post("/register");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();


        System.out.println("Response Status Code is =>  " + statusCode);
        System.out.println("Response Body is =>  " + responseBody);

        Assert.assertEquals(statusCode , 400);

        Assert.assertEquals("{\"error\":1,\"message\":\"Field is required\",\"fields\":[\"recaptcha\"]}" ,responseBody);
        Assert.assertEquals(responseBody.contains("recaptcha"), true);
    }

    @Test
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


//    @Test
//    public void registerAffiliateWithMailThatAlreadyExist() {
//
//        given().log().body()
//                .contentType(contentTypeAplicationJson)
//                .body(body)
//
//                .when()
//                .post(regiterEndPoint)
//
//                .then().log().body()
//                .statusCode(HttpStatus.SC_BAD_REQUEST);
//                logger.info(requestSpecification);
//
//    }


//    @Test
//    public Response registerNewAffiliate(){
//
//        Response response =
//                given().header("Content-Type", "application/json")
//                        .body(body)
//                        .when()
//                        .post("https://api.stage.advendor.net/api/v2/user/register");
//
//        Assert.that(response.getStatusCode() == 201, "Wrong status code");
//        return response;
//
//    }
}

