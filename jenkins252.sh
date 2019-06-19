source ~/.bash_rc
cd /home/devrabbit/SmartQE/SmartQE-Users/7/Selenium/DemoProject_Latest
curl -d @config252.xml -H 'Content-Type: text/xml' 'http://admin:admin@192.168.1.141:8081/createItem?name=DemoProject_Latest' --user admin:11b2bb6ad5a0829d41a3149cea7bf2b07f
curl -X POST http://admin:admin@192.168.1.141:8081/job/DemoProject_Latest/config.xml --user admin:11b2bb6ad5a0829d41a3149cea7bf2b07f --data-binary @config252.xml
curl -X POST http://admin:admin@192.168.1.141:8081/job/DemoProject_Latest/build --user admin:11b2bb6ad5a0829d41a3149cea7bf2b07f
