npm install serverless -g 
serverless config credentials --provider aws --key [KEY] --secret [SECRET]

mkdir helloworld
cd helloworld/
serverless create --template aws-java-maven -n helloworld
serverless info
vim pom.xml
mvn clean install
serverless deploy
aws lambda list-functions
serverless invoke -f hello
