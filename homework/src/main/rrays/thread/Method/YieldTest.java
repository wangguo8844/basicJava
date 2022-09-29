package main.rrays.thread.Method;

/**
 * "C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:D:\tools\idea\IntelliJ IDEA 2021.2.2\lib\idea_rt.jar=10577:D:\tools\idea\IntelliJ IDEA 2021.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\tools\space\test\homework\target\classes;D:\environment\mvn-repository\org\springframework\boot\spring-boot-starter-web\2.2.6.RELEASE\spring-boot-starter-web-2.2.6.RELEASE.jar;D:\environment\mvn-repository\org\springframework\boot\spring-boot-starter\2.2.6.RELEASE\spring-boot-starter-2.2.6.RELEASE.jar;D:\environment\mvn-repository\org\springframework\boot\spring-boot-starter-logging\2.2.6.RELEASE\spring-boot-starter-logging-2.2.6.RELEASE.jar;D:\environment\mvn-repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;D:\environment\mvn-repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;D:\environment\mvn-repository\org\apache\logging\log4j\log4j-to-slf4j\2.12.1\log4j-to-slf4j-2.12.1.jar;D:\environment\mvn-repository\org\apache\logging\log4j\log4j-api\2.12.1\log4j-api-2.12.1.jar;D:\environment\mvn-repository\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;D:\environment\mvn-repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;D:\environment\mvn-repository\org\yaml\snakeyaml\1.25\snakeyaml-1.25.jar;D:\environment\mvn-repository\org\springframework\boot\spring-boot-starter-json\2.2.6.RELEASE\spring-boot-starter-json-2.2.6.RELEASE.jar;D:\environment\mvn-repository\com\fasterxml\jackson\core\jackson-databind\2.10.3\jackson-databind-2.10.3.jar;D:\environment\mvn-repository\com\fasterxml\jackson\core\jackson-annotations\2.10.3\jackson-annotations-2.10.3.jar;D:\environment\mvn-repository\com\fasterxml\jackson\core\jackson-core\2.10.3\jackson-core-2.10.3.jar;D:\environment\mvn-repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.10.3\jackson-datatype-jdk8-2.10.3.jar;D:\environment\mvn-repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.10.3\jackson-datatype-jsr310-2.10.3.jar;D:\environment\mvn-repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.10.3\jackson-module-parameter-names-2.10.3.jar;D:\environment\mvn-repository\org\springframework\boot\spring-boot-starter-tomcat\2.2.6.RELEASE\spring-boot-starter-tomcat-2.2.6.RELEASE.jar;D:\environment\mvn-repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.33\tomcat-embed-core-9.0.33.jar;D:\environment\mvn-repository\org\apache\tomcat\embed\tomcat-embed-el\9.0.33\tomcat-embed-el-9.0.33.jar;D:\environment\mvn-repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.33\tomcat-embed-websocket-9.0.33.jar;D:\environment\mvn-repository\org\springframework\boot\spring-boot-starter-validation\2.2.6.RELEASE\spring-boot-starter-validation-2.2.6.RELEASE.jar;D:\environment\mvn-repository\jakarta\validation\jakarta.validation-api\2.0.2\jakarta.validation-api-2.0.2.jar;D:\environment\mvn-repository\org\hibernate\validator\hibernate-validator\6.0.18.Final\hibernate-validator-6.0.18.Final.jar;D:\environment\mvn-repository\org\jboss\logging\jboss-logging\3.4.1.Final\jboss-logging-3.4.1.Final.jar;D:\environment\mvn-repository\com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar;D:\environment\mvn-repository\org\springframework\spring-web\5.2.5.RELEASE\spring-web-5.2.5.RELEASE.jar;D:\environment\mvn-repository\org\springframework\spring-beans\5.2.5.RELEASE\spring-beans-5.2.5.RELEASE.jar;D:\environment\mvn-repository\org\springframework\spring-webmvc\5.2.5.RELEASE\spring-webmvc-5.2.5.RELEASE.jar;D:\environment\mvn-repository\org\springframework\spring-aop\5.2.5.RELEASE\spring-aop-5.2.5.RELEASE.jar;D:\environment\mvn-repository\org\springframework\spring-context\5.2.5.RELEASE\spring-context-5.2.5.RELEASE.jar;D:\environment\mvn-repository\org\springframework\spring-expression\5.2.5.RELEASE\spring-expression-5.2.5.RELEASE.jar;D:\environment\mvn-repository\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.2\mybatis-spring-boot-starter-2.1.2.jar;D:\environment\mvn-repository\org\springframework\boot\spring-boot-starter-jdbc\2.2.6.RELEASE\spring-boot-starter-jdbc-2.2.6.RELEASE.jar;D:\environment\mvn-repository\com\zaxxer\HikariCP\3.4.2\HikariCP-3.4.2.jar;D:\environment\mvn-repository\org\springframework\spring-jdbc\5.2.5.RELEASE\spring-jdbc-5.2.5.RELEASE.jar;D:\environment\mvn-repository\org\springframework\spring-tx\5.2.5.RELEASE\spring-tx-5.2.5.RELEASE.jar;D:\environment\mvn-repository\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.2\mybatis-spring-boot-autoconfigure-2.1.2.jar;D:\environment\mvn-repository\org\mybatis\mybatis\3.5.4\mybatis-3.5.4.jar;D:\environment\mvn-repository\org\mybatis\mybatis-spring\2.0.4\mybatis-spring-2.0.4.jar;D:\environment\mvn-repository\com\alibaba\fastjson\1.2.9\fastjson-1.2.9.jar;D:\environment\mvn-repository\org\springframework\boot\spring-boot-devtools\2.2.6.RELEASE\spring-boot-devtools-2.2.6.RELEASE.jar;D:\environment\mvn-repository\org\springframework\boot\spring-boot\2.2.6.RELEASE\spring-boot-2.2.6.RELEASE.jar;D:\environment\mvn-repository\org\springframework\boot\spring-boot-autoconfigure\2.2.6.RELEASE\spring-boot-autoconfigure-2.2.6.RELEASE.jar;D:\environment\mvn-repository\mysql\mysql-connector-java\8.0.19\mysql-connector-java-8.0.19.jar;D:\environment\mvn-repository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;D:\environment\mvn-repository\org\springframework\spring-core\5.2.5.RELEASE\spring-core-5.2.5.RELEASE.jar;D:\environment\mvn-repository\org\springframework\spring-jcl\5.2.5.RELEASE\spring-jcl-5.2.5.RELEASE.jar;D:\environment\mvn-repository\com\baomidou\mybatis-plus-boot-starter\3.3.1\mybatis-plus-boot-starter-3.3.1.jar;D:\environment\mvn-repository\com\baomidou\mybatis-plus\3.3.1\mybatis-plus-3.3.1.jar;D:\environment\mvn-repository\com\baomidou\mybatis-plus-extension\3.3.1\mybatis-plus-extension-3.3.1.jar;D:\environment\mvn-repository\com\baomidou\mybatis-plus-core\3.3.1\mybatis-plus-core-3.3.1.jar;D:\environment\mvn-repository\com\baomidou\mybatis-plus-annotation\3.3.1\mybatis-plus-annotation-3.3.1.jar;D:\environment\mvn-repository\com\github\jsqlparser\jsqlparser\3.1\jsqlparser-3.1.jar;D:\environment\mvn-repository\log4j\log4j\1.2.17\log4j-1.2.17.jar" main.rrays.thread.Method.YieldTest
 * main=========0
 * main=========1
 * Thread-0----0
 * Thread-0----1
 * Thread-0----2
 * Thread-0----3
 * Thread-0----4
 * main=========2礼让一次
 * main=========3
 * main=========4
 * Thread-0----5
 * Thread-0----6
 * Thread-0----7
 * Thread-0----8
 * Thread-0----9
 *
 * Process finished with exit code 0
 *
 * 说的是礼让 但是还是可能抢占到
 * * main=========2礼让一次
 * * main=========3
 *
 */
public class YieldTest {
    public static void main(String[] args) {

        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for (int i = 0; i < 5;i++){
            if (i==2){
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+"========="+i+"礼让一次");
            }else {
                System.out.println(Thread.currentThread().getName()+"========="+i);
            }
        }
    }
}
