# async_task_queue
Async Task Queue for task handling using Springboot + Redis

## Steps
1. Clone this repo.
2. Update project using pom.xml.
3. Run Redis Server on `localhost` and `6379` port (default). If you want, you can change the host and port number for redis server from `application.properties` file.
4. Run the project.
5. Open up your browser and enter following request urls for checking the task queue:

    1. `http://localhost:8080/cdr?MSISDN=12345&startDate=12345&endDate=12345`
    2. `http://localhost:8080/prime?from=1&to=100000`
