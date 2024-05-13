# Kafka_Spring_Boot_Micoservices_Console_Basesd
Installing Kafka - https://archive.apache.org/dist/kafka/3.6.1/kafka-3.6.1-src.tgz

Step 1: Start the Zookeeper which is used to maintain the state of the kafka topics.
Command: bin/windows/kafka-zookeeper-server.bat config/zookeeper.properties

Step 2: Start the kafka server
Command: bin\windows\kafka-server-start.bat config\server.properties

Step 3: Create a topic where we will push the messages
Command: bin\windows\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092

Step 4: Create a producer which will be using a topic to push the messages into the particular topic
Command: bin\windows\kafka-console-producer.bat --topic user-topic --bootstrap-server:9092

Step 5: Create a consumer which will be consuming the messages which is published in the topics
Command: bin\windows\kafka-console-consumer.bat --topic user-topic --from-beginning --bootstrap-server localhost:9092
![image](https://github.com/AdityaBeborta/Kafka_Spring_Boot_Micoservices/assets/71306766/aa3604e4-4dd6-4eef-b9ed-7462f5aa230d)
