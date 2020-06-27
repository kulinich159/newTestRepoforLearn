package login_1;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import parentTest1.ParentEndpointTest;

//@RunWith(Parameterized.class)

public class TestAssured extends ParentEndpointTest {


//@Parameterized.Parameters
//public static Collection testData () {
//    return Arrays.asList(new Object[][]{
//            {"email","asdasasdas@asdasd.ss"},
//            {"password","aasdasdas"}
//    });
//  clean
//}

    @Test
    public void registerAffiliateWithMailThatAlreadyExist (){

//        ExcelDriver excelDriver = new ExcelDriver();
//        Map dataForvalidTS = excelDriver.getData(configProperties.DATA_FILE(),"validLogin");
//        dataForvalidTS.get("login").toString();
//        dataForvalidTS.get("pass").toString();


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
        Assert.assertEquals(responseBody.contains("101"),  true);
    }


   // @Issue("ADV-T99")
    @TmsLink("ADV-T99")
    @Severity(SeverityLevel.NORMAL)
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
        traficSourseCreateEndpoint.convertMapToJson();
    }




//
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


//
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

