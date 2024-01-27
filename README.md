Docker Command This Project
----------------------------------------
docker images
docker build -t 'image-name':v1 .
docker images
docker run --name 'container-name' -dp 8082:8081 'image-name':v1
docker container ps
docker logs 'container-name'
