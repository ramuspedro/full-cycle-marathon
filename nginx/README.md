# NGINX Gateway

## Run docker

```sh
$ docker rmi proxy

$ docker build -t proxy .

$ docker run -d -p 3000:80 --name proxy proxy
```
