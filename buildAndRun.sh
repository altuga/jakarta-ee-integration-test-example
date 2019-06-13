#!/bin/sh
mvn clean package && docker build -t com.airhacks/airport .
docker rm -f airport || true && docker run -d -p 8080:8080 -p 4848:4848 --name airport com.airhacks/airport 
