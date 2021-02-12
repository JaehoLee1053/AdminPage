# AdminPage

## API

---

### User

#### Response Sample

<pre>
<code>
 {
   "transaction_time":"2021-02-11T00:30:39.342:,
   "result_code":"OK",
   "description":"OK",
    "data":{
    "id":1,
    "account":"TestUser1",
    "password":"password1",
    "status":"REGISTERED",
    "email":"TestUser1@gmail.com",
    "phone_number":010-1111-0001:,
    "last_login_at":null
  },
  "pagination":null
}
</code>
</pre>

- data를 제외한 나머지 부분은 기본적으로 사용하는 부분으로 Header로 정의, 통신할 때마다 달라질 수 있는 data 부분은 data/Body로 부름

![api_request_table](https://user-images.githubusercontent.com/67194430/107545329-80bacd80-6c0e-11eb-9b2d-7ec090f9bc30.png)


#### read()

- Request

![스크린샷, 2021-02-11 18-18-14](https://user-images.githubusercontent.com/67194430/107618911-aa6b0780-6c95-11eb-96e9-359372580125.png)


- Response

![스크린샷, 2021-02-11 18-18-14](https://user-images.githubusercontent.com/67194430/107619562-b4413a80-6c96-11eb-9753-02099f001ec6.png)


#### update()

- Request

![스크린샷, 2021-02-11 18-18-14](https://user-images.githubusercontent.com/67194430/107690965-327cfb80-6cee-11eb-8564-515b4f8e3404.png)


#### delete()

- Request

![스크린샷, 2021-02-12 05-39-47](https://user-images.githubusercontent.com/67194430/107696196-ff8a3600-6cf4-11eb-98f0-8abfa1c19385.png)

- Response

![delete_response](https://user-images.githubusercontent.com/67194430/107696334-29dbf380-6cf5-11eb-9629-be921c9c365f.png)

