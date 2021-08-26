#!/bin/bash

docker run -d --restart=always -p 33060:3306 --name mysql-server -e MYSQL_ROOT_PASSWORD=mysqlpassword mysql:8
docker run -d -p 6379:6379 redis