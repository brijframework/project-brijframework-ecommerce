#!/bin/bash

set -e

cd `dirname $0`
r=`pwd`
echo $r

exec &> logfile.txt

# project-brijframework-authorization
cd $r/project-brijframework-authorization
echo "Starting run project-brijframework-authorization..."
mvn spring-boot:run