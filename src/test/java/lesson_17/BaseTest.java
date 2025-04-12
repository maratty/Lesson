package lesson_17;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class BaseTest {

    @Test
    public void testGetRequest() {
        // Устанавливаем базовый URI
        RestAssured.baseURI = "https://postman-echo.com";

        // Параметры запроса
        String param1 = "bar1";
        String param2 = "bar2";

        // Отправляем GET-запрос с параметрами и получаем ответ
        given()
                .queryParam("foo1", param1)
                .queryParam("foo2", param2)
                .when()
                .get("/get")//метод
                .then()
                .statusCode(200) // Проверяем код ответа
                .body("args.foo1", equalTo(param1)) // Проверяем тело ответа
                .body("args.foo2", equalTo(param2));
    }

    @Test
    public void testPostRawText() {
        // Устанавливаем базовый URI
        RestAssured.baseURI = "https://postman-echo.com";

        // Параметры запроса
        String raw = "This is expected to be sent back as part of response body.";

        // Выполнение POST-запроса и проверка ответа
        given()
                .contentType(ContentType.TEXT) // Указание типа контента
                .body(raw) // Отправка тела запроса
                .when()
                .post("/post") // метод
                .then()
                .statusCode(200) // Проверяем код ответа
                .body("data", equalTo(raw)); // Проверяем тело ответа

    }

    @Test
    public void testPostFormData() {
        // Устанавливаем базовый URI
        RestAssured.baseURI = "https://postman-echo.com";

        // Отправляем POST-запрос с данными формы
        given()
                .contentType(ContentType.JSON) // Указываем тип контента
                .formParam("foo", "bar") // Добавляем параметры формы
                .when()
                .post("/post")
                .then()
                .statusCode(200) // Проверяем код ответа
                .body("data", equalTo("foo=bar")); // Проверяем тело ответа

    }

    @Test
    public void testPutRequest() {
        // Устанавливаем базовый URI
        RestAssured.baseURI = "https://postman-echo.com";

        // Создаем тело запроса
        String requestBody = "{\"name\":\"Барсик\", \"mail\":\"котик@mail.ru\"}";

        // Отправляем PUT-запрос и получаем ответ
        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/put") // метод put
                .then()
                .extract().response();

        // Проверяем код ответа
        response.then().statusCode(200);

        // Проверяем тело ответа
        response.then().body("json.name", equalTo("Барсик"));
        response.then().body("json.mail", equalTo("котик@mail.ru"));
    }


    @Test
    public void testPatchRequest() {
        // Устанавливаем базовый URI
        RestAssured.baseURI = "https://postman-echo.com";

        // Данные для PATCH-запроса
        String requestBody = "{\"key\": \"value\"}";

        // Выполняем PATCH-запрос и проверяем ответ
        given()
                .contentType(ContentType.JSON) // Указываем, что отправляем JSON
                .body(requestBody)
                .when()
                .patch("/patch") // метод patch
                .then()
                .statusCode(200) // Проверяем код ответа
                .body("json.key", equalTo("value")); // Проверяем тело ответа
    }

    @Test
    public void testDeleteRequest() {
        // ID или данные, которые мы хотим удалить
        String idToDelete = "12345";

        // Отправка DELETE-запроса
        Response response = given()
                .contentType(ContentType.JSON) // Указываем, что отправляем JSON
                .when()
                .delete("https://postman-echo.com/delete?id=" + idToDelete);

        // Проверка кода ответа
        response.then().statusCode(200);

        // Проверка тела ответа
        response.then()
                .body("url", equalTo("https://postman-echo.com/delete?id=" + idToDelete))
                .body("args.id", equalTo(idToDelete)); // Проверяем, что аргумент id совпадает
    }

}