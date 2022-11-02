FROM adoptopenjdk/openjdk11:jre-11.0.16.1_1-alpine

RUN apk add curl jq

# Workspace
WORKDIR /usr/share/test-automation

# ADD .jar under target from host
# into this image
ADD target/testSet.jar 			testSet.jar
ADD target/testSet-tests.jar 	testSet-tests.jar
ADD target/libs					libs
ADD target/resources/features   features
ADD target/resources/test.properties   test.properties

# in case of any other dependency like .csv / .json / .xls
# please ADD that as well

# ADD suite files
ADD target/resources/suite.xml					suite.xml

# ADD health check script
ADD hubCheck.sh                      hubCheck.sh

# BROWSER
# HUB_HOST
# MODULE

ENTRYPOINT sh hubCheck.sh