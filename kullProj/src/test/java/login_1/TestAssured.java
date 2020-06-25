package login_1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import parentTest1.ParentEndpointTest;

public class TestAssured extends ParentEndpointTest {


    Logger logger = Logger.getLogger(getClass());
    String regiterEndPoint = "https://api.stage.advendor.net/api/v2/user/register";
    String contentTypeAplicationJson = "application/json" ;
    String body =
            "{" +
                    "\"email\":\"o.kulinich+30@codiv.net\",\n" +
                    "\"role\": 8,\n" +
                    "\"first_name\":\"aff_rr_test7\",\n" +
                    "\"last_name\":\"yyy4\",\n" +
                    "\"description\":\"UA\", \n" +
                    "\"password\":\"12345678\",\n" +
                    "\"agree_with_license_agreement\": true\n"

           + "}";


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

