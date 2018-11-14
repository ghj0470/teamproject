<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<script>
HTTP/1.1 200 OK
Content-type: application/json;charset=UTF-8
{
 "page": {
  "current_page": 1,
  "current_size": 1,
  "first": true,
  "last": true,
  "total_pages": 1,
  "total_size": 1
 },
 "payment_request_date": "2017-01-18",
 "cid": "TC0ONETIME",
 "orders": [
    {
     "tid": "T1234567890123456789",
     "cid": "TC0ONETIME",
     "status": "SUCCESS_PAYMENT",
     "partner_order_id": "partner_order_id",
     "partner_user_id": "partner_user_id",
     "payment_method_type": "MONEY",
     "item_name": "초코파이",
     "quantity": 1,
     "amount": {
      "total": 2200,
      "tax_free": 0,
      "vat": 200,
      "discount": 0
     },
     "canceled_amount": {
       "total": 0,
       "tax_free": 0,
       "vat": 0,
       "discount": 0
     },
     "cancel_available_amount": {
      "total": 2200,
      "tax_free": 0,
      "vat": 200,
      "discount": 0
     },
     "created_at": "2016-11-15T21:18:22",
     "approved_at": "2016-11-15T21:20:48",
     "payment_action_details": [
       {
        "aid": "A5678901234567890123",
        "payment_action_type": "PAYMENT",
        "payment_method_type": "MONEY",
        "amount": 2200,
        "point_amount": 0,
        "discount_amount": 0,
        "approved_at": "2016-11-15T21:20:48"
       }
      ]
    }
 ]
}
</script>
</body>
</html>