# gmdb-gateway-svc

## Docker Instructions
````
$ docker build -t gmdb/gateway .
$ docker run -d -p 8000:8000 --name gmdb-gateway --network gmdb-bridge gmdb/gateway
````
