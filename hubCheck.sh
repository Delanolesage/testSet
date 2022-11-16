#!/usr/bin/env bash
# Environment Variables
# HUB_HOST
# CUCUMBER_FEATURES: Path
# FILE: Property file

echo "Checking if hub is ready - $HUB_HOST"

while [ "$( curl -s http://$HUB_HOST:4444/wd/hub/status | jq -r .value.ready )" != "true" ]
do
	sleep 1
done

# start the java command for running the test from jar files
java -cp testSet.jar:testSet-tests.jar:libs/* -Dcucumber.features="$CUCUMBER_FEATURES" -Dtt.system.settings.file="$FILE" org.testng.TestNG -testclass runner.TestRunner