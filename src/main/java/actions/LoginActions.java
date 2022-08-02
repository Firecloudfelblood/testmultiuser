package actions;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured.*;
import netscape.javascript.JSException;
import org.json.JSONObject;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class LoginActions {
    public void login(){
        try{
        JSONObject body = new JSONObject();
        body.put("email", "eve.holt@reqres.in");
        body.put("password", "cityslicka");
        given().when()
                .body(body)
                .post("https://reqres.in/api/login")
                .then().log().all()
                .statusCode(200);}
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void google(){
        given().when()
                .get("http://www.google.com")
                .then().log().all()
                .statusCode(200);
    }
}
