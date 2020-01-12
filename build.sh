#!/bin/bash

set -e

cd `dirname $0`
r=`pwd`
echo $r

exec &> logfile.txt

# project-brijframework-ecommerce
echo "Starting install project-brijframework-ecommerce..."
mvn clean install 
