#!/bin/bash

docker run -d --restart=always -p 3307:3306 --name wanli-mysql -e MYSQL_ROOT_PASSWORD=mysqlpassword mysql
docker run -d --restart=always -p 6380:6379 --name wanli-redis redis


#login
curl --location --request POST '127.0.0.1:9000/oauth/token' \
--header 'Authorization: Basic d2ViY2xpZW50OnNlY3JldA==' \
--header 'Cookie: JSESSIONID=B4ED5E1BB2F155721DC9BC1205621BF9' \
--form 'username="root"' \
--form 'password="123456"' \
--form 'grant_type="password"' \
--form 'scope="read write"'

#获取用户信息
curl --location --request GET 'http://127.0.0.1/auth/account' \
--header 'Authorization: Bearer 65086c1f-7eb2-4f3b-9c90-7fcb6218e00a' \
--header 'Cookie: JSESSIONID=00132869B581252DB8D0D0895CFF7D1C'