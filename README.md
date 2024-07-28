# spring-boot-non-jwt

## Web Services
* Đồng bộ dữ liệu về 1 dữ liệu chung(app, web chung 1 api)
* Các chương trình giao tiếp với nhau sử dụng XML
* Các thành phần của một Web Service
    * SOAP (Giao thức truy cập đối tượng đơn giản)
    * UDDI (Mô tả chung, Khám phá và Tích hợp)
    * WSDL (Ngôn ngữ mô tả Web Service)

![Web service](https://lh5.googleusercontent.com/mFXHmBCcEW7yEC4Y0JycTQ83OJM538cCLwAOcXqQ2Co1NKuwBcQlUznIh4mpvwwjUuQp0iPvSsrVnqWm42vGyzVbXCytKvb84a8Qj6_ZRBAVaeCMZaLf4gFstVmI3wXJiUZmBXzwKBzp2-Atii0-GNFnhQtgmGIHHQkTctsgnRzHv6VU3ZgLfKyWj-LCfA)

## Maven Project
Apache Maven là một chương trình quản lý dự án cho phép các developers
có thể quan lý các version, dependencies, quản lý build, tự động download javadoc & source,..

* Group Id : Tên dự án
* Artifact Id : Tên của package, dự án
* Version
* File pom.xml là nơi khai báo tất cả những gì liên quan đến dự án 
được cấu hình qua maven

## Controller
* @RestController : Controller sẽ trả v JSON, chuyển đổi java thông thường thành RESTFUL API
* @Controller : Trả về view (html, pug, ...)
* @GetMapping = @RequestMapping(method = RequestMethod.GET)
* @ResponseBody : Trả dữ liệu cho client dạng JSON
* @RestController = @Controller + @ResponseBody
* @ControllerAdvice, @ExceptionHandler : là một Annotation xử lí các Exception

## Server-side rendering và Client-side rendering
### Server-side rendering
* Khi người dùng vào một trang web, trình duyệt sẽ gửi GET request tới web server
* Web server sẽ nhận request và đọc dữ liệu DB
* Web server sẽ rendering HTML (PUG) trả v browser để hiển thị cho người dùng.
* Làm cả FE và BE nên dễ gây ra load chậm

### Client-side rendering
* FE gửi request cho BE và BE sẽ trả DB dạng JSON
* Quá trình render thay vì ở trên máy chủ như Server Side Rendering thì nó render ngay trên trình duyệt. Khi người dùng yêu cầu truy cập một trang web, thì trình duyệt sẽ nhận dữ liệu thô từ máy chủ và lắp ráp các dữ liệu đó để hiển thị cho người dùng cuối.

## RESTful API
1. Learn the basic concepts of HTTP applied to RESTful API
  * HTTP method: GET, POST, PUT, PATCH, DELETE
  * HTTP status code: 1xx for information, 2xx for success, 3xx for redirection, 4xx for client error(FE), 5xx for server error(BE)
  * HTTP header: Content-Type, Authorization, Cookie,...
  * HTTP body: Request body, Response body
2. Don't return plain text
3. Avoid using verbs in URIs
For examples, when you create a article you should use the path as `POST: /articles/` , don't
`POST: /articles/createNewArticle/`
4. Use plural resources nouns

Why? Because it fits all types of endpoints very well.

I'd agree that GET /article/2/ is fine, but what about GET /article/? Are we getting the one and only article in the system, or all of them?
```chatinput
GET: /articles/2/
POST: /articles/
...
```
5. Return error details in the response body
6. Pay attention to status codes

    `The worst thing your API could do is return an error response with 200 OK`
7. Use status codes consistently
```chatinput
GET: 200 OK
POST: 201 Created
PUT: 200 OK
PATCH: 200 OK
DELETE: 204 No Content
```
8. Don't nest resources in the URL
   * Don't use `GET : /authors/2/articles/`
   * Recomend using `GET: /articles/?author_id=12`
