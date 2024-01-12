#!/bin/bash
 echo "> now ing app pid find!"
 CURRENT_PID=$(pgrep -f demo) #실행중인 파일명으로
 echo "$CURRENT_PID"
 if [ -z $CURRENT_PID ]; then
         echo "> no ing app."
 else
         echo "> kill -9 $CURRENT_PID"
         kill -9 $CURRENT_PID
         sleep 3
 fi
 echo "> new app deploy"

 cd /home/ubuntu/deploy
 JAR_NAME=$(ls | grep -v '\-plain' | grep '.jar$' | tail -n 1) #jar파일의 이름을 정규표현식같은거로 찾는거 여기서는 -plain이 안들어있는 .jar파일을 찾느다
 echo "> JAR Name: $JAR_NAME"

 # nohup java -jar -Duser.timezone=Asia/Seoul $JAR_NAME &
 nohup java -jar -Duser.timezone=Asia/Seoul $JAR_NAME 1>nohup/stdout.txt 2>nohup/stderr.txt &
 sleep 2

 # end of the script
