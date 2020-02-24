#!/bin/bash

set -e

cd `dirname $0`
r=`pwd`
echo $r

exec &> logfile.txt

echo "Starting run project-brijframework-ecommerce..."
mvn spring-boot:run