FROM openjdk:11-jre
# add jar
ADD build/libs/demo-vault*.jar demo-vault.jar

EXPOSE 8080

# setup startup command
ENTRYPOINT exec java $JAVA_OPTS -jar demo-vault.jar

