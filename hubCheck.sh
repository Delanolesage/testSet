#!/usr/bin/env bash
# Environment Variables
# HUB_HOST
# BROWSER
# MODULE

echo "Checking if hub is ready - $HUB_HOST"

while [ "$( curl -s http://$HUB_HOST:4444/wd/hub/status | jq -r .value.ready )" != "true" ]
do
	sleep 1
done

# list all files
ls -la

cd resources/

# list all files
ls -la

# list all files
cd ..

# start the java command
java -cp testSet.jar:testSet-tests.jar:libs/* \
    -DHUB_HOST=$HUB_HOST
    #-Dcucumber.features="$CUCUMBER_FEATURES" \
    -Dtt.system.settings.file="$FILE" \
    org.testng.TestNG -testclass runner.TestRunner