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

![스크린샷, 2021-02-11 18-26-22](https://user-images.githubusercontent.com/67194430/107732808-a5ad5e80-6d3c-11eb-8f74-f475c0f63370.png)


#### update()

- Request

![스크린샷, 2021-02-11 18-18-14](https://user-images.githubusercontent.com/67194430/107690965-327cfb80-6cee-11eb-8564-515b4f8e3404.png)


#### delete()

- Request

![스크린샷, 2021-02-12 05-39-47](https://user-images.githubusercontent.com/67194430/107696196-ff8a3600-6cf4-11eb-98f0-8abfa1c19385.png)

- Response

![delete_response](https://user-images.githubusercontent.com/67194430/107696334-29dbf380-6cf5-11eb-9629-be921c9c365f.png)



### Item

#### create()

- Request

![item_create](https://user-images.githubusercontent.com/67194430/107731033-43525f00-6d38-11eb-8996-97f87a131f35.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "status":"REGISTERED",
    "name":"전자노트북 S10",
    "title":"전자노트북",
    "content":"2021년 여름 한정판 노트북!!!",
    "price":99800,
    "brand_name":"전자가전",
    "partner_id":1
  }
}
</code>
</pre>

- Response

![item_response](https://user-images.githubusercontent.com/67194430/107732595-1b64fa80-6d3c-11eb-9b75-b46a891aa854.png)


<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "status":"REGISTERED",
    "name":"전자노트북 S10",
    "title":"전자노트북",
    "content":"2021년 여름 한정판 노트북!!!",
    "price":99800,
    "brand_name":"전자가전",
    "partner_id":1
  }
}
</code>
</pre>

#### read()

- Request

![item_read_request](https://user-images.githubusercontent.com/67194430/108489281-b897d400-72e4-11eb-8315-18804725e393.png)

- Response

![item_read_response](https://user-images.githubusercontent.com/67194430/108489293-bdf51e80-72e4-11eb-98ef-212313dab53f.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "status":"REGISTERED",
    "name":"전자노트북 S10",
    "title":"전자노트북",
    "content":"2021년 여름 한정판 노트북!!!",
    "price":99800,
    "brand_name":"전자가전",
    "partner_id":1
  }
}
</code>
</pre>

#### update()

- Request

![item_update_request](https://user-images.githubusercontent.com/67194430/108489892-73c06d00-72e5-11eb-9598-e1e5a79cbf2e.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "status":"REGISTERED",
    "name":"전자노트북 S10",
    "title":"전자노트북",
    "content":"2021년 여름 한정판 노트북!!!",
    "price":89800,
    "brand_name":"전자가전",
    "partner_id":1,
    "registered_at":"2021-02-19T19:03:02.231"
  }
}
</code>
</pre>

- Response

![item_update_response](https://user-images.githubusercontent.com/67194430/108489898-758a3080-72e5-11eb-833e-f0875baa14b8.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "id":2,
    "status":"REGISTERED",
    "name":"전자노트북 S10",
    "title":"전자노트북",
    "content":"2021년 여름 한정판 노트북!!!",
    "price":89800,
    "brand_name":"전자가전",
    "partner_id":1,
    "registered_at":"2021-02-19T19:03:02.231",
    "unregistered_at":null
  }
}
</code>
</pre>

#### delete()

- Request

![item_delete_request](https://user-images.githubusercontent.com/67194430/108509605-c9eed980-7300-11eb-8217-074e96fc7b7f.png)


- Response

![delete_response](https://user-images.githubusercontent.com/67194430/108509618-ce1af700-7300-11eb-868e-f8dc295698ab.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
}
</code>
</pre>

## OrderGroup

#### update()

- Request

![orderGroup_update_request](https://user-images.githubusercontent.com/67194430/108521874-88195f80-730f-11eb-9e10-2f19b80487a3.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "status":"COMPLETE",
    "order_type":"ALL",
    "rev_address":"서울시 강남구",
    "rev_name":"홍길동",
    "payment_type":"CARD",
    "total_price":75000,
    "total_quantity":3,
    "order_at":"2021-02-20T00:05:02.231",
    "user_id":2
  }
}
</code>
</pre>

- Response

![orderGroup_update_response](https://user-images.githubusercontent.com/67194430/108524804-c6fce480-7312-11eb-8aea-ce5dfcb12799.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "id":2,
    "status":"COMPLETE",
    "order_type":"ALL",
    "rev_address":"서울시 강남구",
    "rev_name":"홍길동",
    "payment_type":"CARD",
    "total_price":75000,
    "total_quantity":3,
    "order_at":"2021-02-20T00:05:02.231",
    "arrival_date":null,
    "user_id":2
  }
}
</code>
</pre>

#### read()

- Request

![orderGroup_read_request](https://user-images.githubusercontent.com/67194430/108535568-d124e000-731e-11eb-9fc4-64d8a1fff9cc.png)

- Response

![orderGroup_read_response](https://user-images.githubusercontent.com/67194430/108535574-d1bd7680-731e-11eb-92e3-c898e4d9947b.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "id":2,
    "status":"COMPLETE",
    "order_type":"ALL",
    "rev_address":"서울시 강남구",
    "rev_name":"홍길동",
    "payment_type":"CARD",
    "total_price":75000,
    "total_quantity":3,
    "order_at":"2021-02-20T00:05:02.231",
    "arrival_date":null,
    "user_id":2
  }
}
</code>
</pre>

#### update()

- Request

![orderGroup_update_response](https://user-images.githubusercontent.com/67194430/108540304-5eb6fe80-7324-11eb-818b-b5c8242f69a7.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "id":2,
    "status":"COMPLETE",
    "order_type":"ALL",
    "rev_address":"서울시 강남구",
    "rev_name":"홍길동",
    "payment_type":"CARD",
    "total_price":75000,
    "total_quantity":3,
    "order_at":"2021-02-20T00:05:02.231",
    "user_id":2
  }
}
</code>
</pre>

- Response

![orderGroup_update_response](https://user-images.githubusercontent.com/67194430/108540619-c1a89580-7324-11eb-9942-363fcadd727f.png)

<pre>
<code>
{
  "transaction_time":"2021-02-12T13:46:47.624",
  "result_code":"OK",
  "description":"OK",
  "data":{
    "id":2,
    "status":"COMPLETE",
    "order_type":"ALL",
    "rev_address":"서울시 강남구",
    "rev_name":"홍길동",
    "payment_type":"CARD",
    "total_price":75000,
    "total_quantity":3,
    "order_at":"2021-02-20T00:05:02.231",
    "arrival_date":null,
    "user_id":2
  }
}
</code>
</pre>

#### delete()

- Response

![orderGroup_delete_request](https://user-images.githubusercontent.com/67194430/108542489-27961c80-7327-11eb-8200-0911b08b81e0.png)

- Request

![orderGroup_delete_response](https://user-images.githubusercontent.com/67194430/108542491-282eb300-7327-11eb-9df3-176f9de7366d.png)

<pre>
<code>
{
  "transaction_time":"2021-02-20T03:01:34.231",
  "result_code":"OK",
  "description":"OK"
}
</code>
</pre>
