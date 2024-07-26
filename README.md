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
* @RestController : Controller sẽ trả v JSON
* @Controller : Trả về view (html, pug, ...)
* @GetMapping = @RequestMapping(method = RequestMethod.GET)
* @ResponseBody : Ghi dữ liệu với JSON 



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
  * HTTP status code: 200, 201, 400, 404, 500
  * HTTP header: Content-Type, Authorization, Cookie,...
  * HTTP body: Request body, Response body
  * 