https://www.baeldung.com/spring-kafka


bin/zookeeper-server-start.sh config/zookeeper.properties

bin/kafka-server-start.sh config/server.properties

bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092