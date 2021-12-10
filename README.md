## Docker Compose

In order to run the Project, we have to install Docker and then run `docker compose up`

## Docker Compose to docker swarm

1. Initalize Docker Swarm
```bash
docker swarm init 
```
2. Deploy Docker Compose to Docker Swarm using `Docker Stack` command
```bash
docker stack deploy --compose-file=docker-compose.yml spring_sql
```
